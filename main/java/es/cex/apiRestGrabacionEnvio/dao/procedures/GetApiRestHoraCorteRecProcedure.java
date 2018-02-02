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
import es.chx.exceptions.ProcedureException;
import es.chx.procedures.ChxStoredProcedure;
import es.chx.trace.Trace;


/**
 * Llama al procedimiento almacenado GRABAR_ENVIO
 */


@Component("getApiRestHoraCorteRecProcedure")
public class GetApiRestHoraCorteRecProcedure extends ChxStoredProcedure {

	/** LOG */
	private static final Log LOG = LogFactory.getLog(GetApiRestHoraCorteRecProcedure.class);
	/** PROCEDURE_NAME */
	private static final String PROCEDURE_NAME = Constants.PROCEDURE_NAME_CONSULTA_HORA_CORTE;
	/** PACKAGE_NAME */
	private static final String PACKAGE_NAME = Constants.DB_PACKAGE_NAME_CHX_WS_GENERICO; 

	
	/**
	 * Prepara el procedure para su ejecucion
	 * @param dataSource dataSource
	 */
	
	@Autowired
	public GetApiRestHoraCorteRecProcedure(DataSource dataSource) {
		
		super();
		
		setDataSource(dataSource);
		setFunction(false);
		setSql(PACKAGE_NAME + "." + PROCEDURE_NAME);
		
		declareParameter(new SqlParameter("cp", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("pais", OracleTypes.VARCHAR));
		
		declareParameter(new SqlOutParameter("horaCorte", OracleTypes.VARCHAR));
		declareParameter(new SqlOutParameter("ultimaLLamada", OracleTypes.VARCHAR));
		declareParameter(new SqlOutParameter("codigoError", OracleTypes.NUMBER));
		declareParameter(new SqlOutParameter("mensajeError", OracleTypes.VARCHAR));
		
		
		compilar();
	}
	

	
	
	@Trace(traceLevel = "DEBUG")
	@SuppressWarnings("unchecked")
	public ConsultaHoraCorte execute(String cp, String pais)
			throws ProcedureException {
		
		
		Map<String, Object> parametros = new HashMap<String, Object>();
		
		parametros.put("cp", cp);
		parametros.put("pais", pais);
		
		
		
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

			ConsultaHoraCorte chc = new ConsultaHoraCorte();

			if ((codigoError != null && codigoError.intValue() != 0)
					|| (StringUtils.hasText(mensajeError))) {
				throw new ProcedureException(mensajeError + "#" + codigoError);
				
			} else {
				
				chc.setHoraCorte((String) resultados
						.get("horaCorte"));
				chc.setHoraCorte((String) resultados
						.get("ultimaLLamada"));
			}	
			// obtenemos el resultado de la ejecucion
			return chc;
		} else {
			return null;
		}
	}

}