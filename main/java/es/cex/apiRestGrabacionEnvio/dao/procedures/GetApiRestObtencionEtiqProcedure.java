/**
 * @author JK GOLDARACENA & OSCAR GARAY
 */

package es.cex.apiRestGrabacionEnvio.dao.procedures;


import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import oracle.sql.STRUCT;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import es.cex.apiRestGrabacionEnvio.common.Constants;
import es.cex.apiRestGrabacionEnvio.domain.ConsultaHoraCorte;
import es.cex.apiRestGrabacionEnvio.domain.Etiqueta;
import es.cex.apiRestGrabacionEnvio.domain.ObtencionEtiqueta;
import es.cex.apiRestGrabacionEnvio.domain.SqlEtiqueta;
import es.chx.exceptions.ProcedureException;
import es.chx.procedures.ChxStoredProcedure;
import es.chx.trace.Trace;


/**
 * Llama al procedimiento almacenado NAME_DAMETIQUETA
 */


@Component("getApiRestObtencionEtiqProcedure")
public class GetApiRestObtencionEtiqProcedure extends ChxStoredProcedure {

	/** LOG */
	private static final Log LOG = LogFactory.getLog(GetApiRestObtencionEtiqProcedure.class);
	/** PROCEDURE_NAME */
	private static final String PROCEDURE_NAME = Constants.PROCEDURE_NAME_DAMETIQUETA;
	/** PACKAGE_NAME */
	private static final String PACKAGE_NAME = Constants.DB_PACKAGE_NAME_PCK_WS_DEVOLUCION; 

	
	/**
	 * Prepara el procedure para su ejecucion
	 * @param dataSource dataSource
	 */
	
	@Autowired
	public GetApiRestObtencionEtiqProcedure(DataSource dataSource) {
		
		super();
		
		setDataSource(dataSource);
		setFunction(false);
		setSql(PACKAGE_NAME + "." + PROCEDURE_NAME);
		
		declareParameter(new SqlParameter("solicitante", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("codUnico", OracleTypes.VARCHAR));
		declareParameter(new SqlOutParameter("obtencionEtiqueta", OracleTypes.STRUCT,
				"ALERTRAN.ETIQUETA"));
		declareParameter(new SqlOutParameter("codigoError", OracleTypes.NUMBER));
		declareParameter(new SqlOutParameter("mensajeError", OracleTypes.VARCHAR));
		
		
		compilar();
	}
	

	
	
	@Trace(traceLevel = "DEBUG")
	@SuppressWarnings("unchecked")
	public ObtencionEtiqueta execute(String solicitante, String codUnico)
			throws ProcedureException {
		
		
		Map<String, Object> parametros = new HashMap<String, Object>();
		
		parametros.put("solicitante", solicitante);
		parametros.put("codUnico", codUnico);
		
		
		
		LOG.debug("Ejecutamos " + getSql() + " con los parametros "
				+ parametros.toString());
		boolean nulo = false;
		Map<String, Object> resultados = new HashMap<String, Object>();
		try {
			resultados = execute(parametros);
		} catch (NullPointerException e) {
			nulo = true;
		}
		if (!nulo) {

			BigDecimal codigoError = (BigDecimal) resultados.get("codigoError");
			String mensajeError = (String) resultados.get("mensajeError");

			//ObtencionEtiqueta oe = new ObtencionEtiqueta();

			if ((codigoError != null && codigoError.intValue() != 0)) {
				throw new ProcedureException(mensajeError + "#" + codigoError);
				
			} else {
				//ObtencionEtiqueta oEt = new ObtencionEtiqueta();
				SqlEtiqueta resEtiqueta = new SqlEtiqueta();
				try {
					resEtiqueta = resEtiqueta.fromStruct((STRUCT) resultados.get("obtencionEtiqueta"));
					return resEtiqueta;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				}
		        
				
//				
//		        resSqlDevolucionEnvioOficina.setSqlEtiqueta(resEtiqueta);
//		        resSqlDevolucionEnvioOficina.setCodError(Utility
//		                .readCodError((BigDecimal) out.get(pOutCodError)));
//		        resSqlDevolucionEnvioOficina.setMensajeError((String) out
//		                .get(pOutDesError));
//		        
//		        
//				
//				chc.setHoraCorte((String) resultados
//						.get("horaCorte"));
//				chc.setHoraCorte((String) resultados
//						.get("ultimaLLamada"));
			}	
			// obtenemos el resultado de la ejecucion
		} else {
			return null;
		}
	}

}