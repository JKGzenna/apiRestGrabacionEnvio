/**
 * @author JK GOLDARACENA & OSCAR GARAY
 */

package es.cex.apiRestGrabacionEnvio.dao.procedures;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
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
import es.cex.apiRestGrabacionEnvio.domain.EtiquetaInfoAdicional;
import es.chx.exceptions.ProcedureException;
import es.chx.procedures.ChxStoredProcedure;
import es.chx.trace.Trace;


/**
 * Llama al procedimiento almacenado DAME_INFOADICIONAL_ETIQUETA del paqueta PCK_WS_DEVOLUCION
 */


//@Component("getApiRestEtiqInfoAdicProcedure")
//public class GetApiRestEtiqInfoAdicProcedure extends ChxStoredProcedure {

//	/** LOG */
//	private static final Log LOG = LogFactory.getLog(GetApiRestEtiqInfoAdicProcedure.class);
//	/** PROCEDURE_NAME */
//	private static final String PROCEDURE_NAME = Constants.PROCEDURE_NAME_DAME_INFOADICIONAL_ETIQUETA;
//	/** PACKAGE_NAME */
//	private static final String PACKAGE_NAME = Constants.DB_PACKAGE_NAME_PCK_WS_DEVOLUCION; 
//
//	
//	/**
//	 * Prepara el procedure para su ejecucion
//	 * @param dataSource dataSource
//	 */
//	
//	@Autowired
//	public GetApiRestEtiqInfoAdicProcedure(DataSource dataSource) {
//		
//		super();
//		
//		setDataSource(dataSource);
//		setFunction(false);
//		setSql(PACKAGE_NAME + "." + PROCEDURE_NAME);
//		
//		declareParameter(new SqlParameter("numEnvio", OracleTypes.VARCHAR));
//		
//		declareParameter(new SqlOutParameter("codigoDelOrig", OracleTypes.VARCHAR));
//		declareParameter(new SqlOutParameter("nombreDelOrig", OracleTypes.VARCHAR));
//		declareParameter(new SqlOutParameter("codigoDelDes", OracleTypes.VARCHAR));
//		declareParameter(new SqlOutParameter("nombreDelDes", OracleTypes.VARCHAR));
//		declareParameter(new SqlOutParameter("codigoError", OracleTypes.NUMBER));
//		declareParameter(new SqlOutParameter("mensajeError",OracleTypes.VARCHAR));
//		
//		
//		compilar();
//	}
//	
//
//	@Trace(traceLevel = "DEBUG")
//	@SuppressWarnings("unchecked")
//	public EtiquetaInfoAdicional execute(String numEnvio)
//			throws ProcedureException {
//		
//		
//		Map<String, Object> parametros = new HashMap<String, Object>();
//		
//		parametros.put("numEnvio", numEnvio);
//		
//		
//		
//		LOG.debug("Ejecutamos " + getSql() + " con los parametros "
//				+ parametros.toString());
//		boolean nulo = false;
//		Map<String, Object> resultados = new HashMap<String, Object>();
//		try {
//			resultados = execute(parametros);
//		} catch (NullPointerException e) {
//			nulo = true;
//		}
//		if (!nulo) {
//
//			BigDecimal codigoError = (BigDecimal) resultados.get("codigoError");
//			String mensajeError = (String) resultados.get("mensajeError");
//
//			
//			EtiquetaInfoAdicional eia = new EtiquetaInfoAdicional();
//
//			if ((codigoError != null && codigoError.intValue() != 0)
//					|| (StringUtils.hasText(mensajeError))) {
//				throw new ProcedureException(mensajeError + "#" + codigoError);
//				
//			} else {
//				
//				eia.setCodigoDelDes((String) resultados
//						.get("codigoDelDes"));
//				eia.setNombreDelOrig((String) resultados
//						.get("nombreDelOrig"));
//				eia.setCodigoDelDes((String) resultados
//						.get("codigoDelDes"));
//				eia.setNombreDelDes((String) resultados
//						.get("nombreDelDes"));
//				
//			}	
//			// obtenemos el resultado de la ejecucion
//			return eia;
//		} else {
//			return null;
//		}
//	}
//}