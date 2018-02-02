/**
 * @author JK GOLDARACENA & OSCAR GARAY
 */

package es.cex.apiRestGrabacionEnvio.dao.procedures;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import oracle.sql.ARRAY;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlInOutParameter;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import es.cex.apiRestGrabacionEnvio.common.Constants;
import es.cex.apiRestGrabacionEnvio.dao.rowmappers.BultoRowMapper;
import es.cex.apiRestGrabacionEnvio.domain.BultoJSON;
import es.cex.apiRestGrabacionEnvio.domain.GrabacionEnvioJSON;
import es.cex.apiRestGrabacionEnvio.domain.GrabacionEnvioResponseJSON;
import es.chx.exceptions.ProcedureException;
import es.chx.procedures.ChxStoredProcedure;
import es.chx.procedures.objects.type.DBType;

import es.chx.trace.Trace;


/**
 * Llama al procedimiento almacenado GRABAR_ENVIO
 */


@Component("getApiRestGrabacionEnvioProcedure")
public class GetApiRestGrabacionEnvioProcedure extends ChxStoredProcedure {

	/** LOG */
	private static final Log LOG = LogFactory.getLog(GetApiRestGrabacionEnvioProcedure.class);
	/** PROCEDURE_NAME */
	private static final String PROCEDURE_NAME = Constants.PROCEDURE_NAME_GRABAR_ENVIO;
	/** PACKAGE_NAME */
	private static final String PACKAGE_NAME = Constants.DB_PACKAGE_NAME_CHX_WS_GENERICO; 

	
	/**
	 * Prepara el procedure para su ejecucion
	 * @param dataSource dataSource
	 */
	
	@Autowired
	public GetApiRestGrabacionEnvioProcedure(DataSource dataSource) {
		
		super();
		
		setDataSource(dataSource);
		setFunction(false);
		setSql(PACKAGE_NAME + "." + PROCEDURE_NAME);
		
		declareParameter(new SqlParameter("solicitante", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("canalEntrada", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("numEnvio", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("referencia", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("refCliente", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("fecha", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("codRemitente", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("nombreRemitente",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("nifRemitente", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("dirRemitente", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("pobRemitente", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("codPostNacRemitente",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("codPaisISORemitente",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("codPosIntRemitente",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("contactRemitente",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("telefonoRemitente",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("emailRemitente", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("codDestinatario",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("nombreDestinatario",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("nifDestinatario",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("dirDestinatario",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("poblDestinatario",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("codPostalNacDestinatario",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("paisISODestinatario",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("codPostalIntDestinatario",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("contactoDestinatario",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("telefonoDestinatario",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("emailDestinatario",
				OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("contactOtrs", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("telefOtrs", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("emailOtrs", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("observac", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("numBultos", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("kilos", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("volumen", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("alto", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("largo", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("ancho", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("producto", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("portes", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("reenbolso", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("entrSabado", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("seguro", OracleTypes.VARCHAR));
		declareParameter(new SqlInOutParameter("numEnvioVuelta", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("bultos", OracleTypes.ARRAY, Constants.DBTYPES_OWNER + DBType.COLECCION));
		
		
		//declareParameter(new SqlParameter("password", OracleTypes.VARCHAR));
		
		declareParameter(new SqlOutParameter("resultado", OracleTypes.VARCHAR));
		declareParameter(new SqlOutParameter("datosResultado",
				OracleTypes.VARCHAR));
		
		
		declareParameter(new SqlOutParameter("listaBultos", OracleTypes.CURSOR,
		 null, new BultoRowMapper()));

		//declareParameter(new SqlOutParameter("alto", OracleTypes.VARCHAR));
		//declareParameter(new SqlOutParameter("numEnvioVueltaOut", OracleTypes.VARCHAR));
		
		declareParameter(new SqlOutParameter("codigoError", OracleTypes.NUMBER));
		declareParameter(new SqlOutParameter("mensajeError",
				OracleTypes.VARCHAR));
		
		
		compilar();
	}
	
	
	
	
	@Trace(traceLevel = "DEBUG")
	@SuppressWarnings("unchecked")
	public GrabacionEnvioResponseJSON execute(GrabacionEnvioJSON ge)
			throws ProcedureException {
		
		Connection con = null;
		ARRAY arrListaBultos;
		
		
		try {
			con = getJdbcTemplate().getDataSource().getConnection();
		} catch (SQLException e1) {
			LOG.error("Error al crear la conexion para el PL " + getSql());
		}

		Map<String, Object> parametros = new HashMap<String, Object>();
		
		
		
		
		List<BultoJSON> listaBultos = ge.getBulto();
		String[] contenido = new String[listaBultos.size()];
		for (int j = 0; j < listaBultos.size(); j++) {
			contenido[j] = listaBultos.get(j).getOrden() + "|" + listaBultos.get(j).getCodBultoCli() + "|"
					+ listaBultos.get(j).getReferencia() + "|" + listaBultos.get(j).getDescripcion() + "|"
					+ listaBultos.get(j).getObservaciones() + "|" + listaBultos.get(j).getKilos() + "|"
					+ listaBultos.get(j).getVolumen() + "|" + listaBultos.get(j).getAlto() + "|" + listaBultos.get(j).getLargo()
					+ "|" + listaBultos.get(j).getAncho() + "|" + listaBultos.get(j).getCodUnico() + "|";
			
		}
		
		
		parametros.put("solicitante", ge.getSolicitante());
		parametros.put("canalEntrada", ge.getCanalEntrada());
		parametros.put("numEnvio", ge.getNumEnvio());
		parametros.put("referencia", ge.getRef());
		parametros.put("refCliente", ge.getRefCliente());
		parametros.put("fecha", ge.getFecha());
		parametros.put("codRemitente", ge.getCodRte());
		parametros.put("nombreRemitente", ge.getNomRte());
		parametros.put("nifRemitente", ge.getNifRte());
		parametros.put("dirRemitente", ge.getDirRte());
		parametros.put("pobRemitente", ge.getPobRte());
		parametros.put("codPostNacRemitente", ge.getCodPosNacRte());
		parametros.put("codPaisISORemitente", ge.getPaisISORte());
		parametros.put("codPosIntRemitente", ge.getCodPosIntRte());
		parametros.put("contactRemitente", ge.getContacRte());
		parametros.put("telefonoRemitente", ge.getTelefRte());
		parametros.put("emailRemitente", ge.getEmailRte());
		parametros.put("codDestinatario", ge.getCodDest());
		parametros.put("nombreDestinatario", ge.getNomDest());
		parametros.put("nifDestinatario", ge.getNifDest());
		parametros.put("dirDestinatario", ge.getDirDest());
		parametros.put("poblDestinatario", ge.getPobDest());
		parametros.put("codPostalNacDestinatario", ge.getCodPosNacDest());
		parametros.put("paisISODestinatario", ge.getPaisISODest());
		parametros.put("codPostalIntDestinatario", ge.getCodPosIntDest());
		parametros.put("contactoDestinatario", ge.getContacDest());
		parametros.put("telefonoDestinatario", ge.getTelefDest());
		parametros.put("emailDestinatario", ge.getEmailDest());
		parametros.put("contactOtrs", ge.getContacOtrs());
		parametros.put("telefOtrs", ge.getTelefOtrs());
		parametros.put("emailOtrs", ge.getEmailOtrs());
		parametros.put("observac", ge.getObservac());
		parametros.put("numBultos", ge.getNumBultos());
		parametros.put("kilos", ge.getKilos());
		parametros.put("volumen", ge.getVolumen());
		parametros.put("alto", ge.getAlto());
		parametros.put("largo", ge.getLargo());
		parametros.put("ancho", ge.getAncho());
		parametros.put("producto", ge.getProducto());
		parametros.put("portes", ge.getPortes());
		parametros.put("reenbolso", ge.getReembolso());
		parametros.put("entrSabado", ge.getEntrSabado());
		parametros.put("seguro", ge.getSeguro());
		parametros.put("numEnvioVuelta", ge.getNumEnvioVuelta());
		//parametros.put("password", ge.getPassword());
		
		
		
		try {
			arrListaBultos = createArrayDescriptorWithoutNewConnection(con, Constants.DBTYPES_OWNER, contenido);
			parametros.put("bultos", arrListaBultos);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		

		LOG.debug("Ejecutamos " + getSql() + " con los parametros "
				+ parametros.toString());
		boolean nulo = false;
		Map<String, Object> resultados = new HashMap<String, Object>();
		try {
			resultados = execute(parametros);
		} catch (NullPointerException e) {
			nulo = true;
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOG.error("Error al cerrar la conexion para el PL " + getSql());
			}
		}
		if (!nulo) {

			BigDecimal codigoError = (BigDecimal) resultados.get("codigoError");
			String mensajeError = (String) resultados.get("mensajeError");

			GrabacionEnvioResponseJSON grabacionEnvio = new GrabacionEnvioResponseJSON();

			if ((codigoError != null && codigoError.intValue() != 0)
					|| (StringUtils.hasText(mensajeError))) {
				throw new ProcedureException(mensajeError + "#" + codigoError);
				
			} else {
				
				//grabacionEnvio.setResultado((String) resultados
				//		.get("resultado"));
				
				grabacionEnvio.setDatosResultado((String) resultados
						.get("datosResultado"));
				
//				grabacionEnvio.setNumEnvioVuelta((String) resultados
//						.get("envio"));
				
				if (((List<List<BultoJSON>>) resultados
						.get("listaBultos")).size() > 0){
				grabacionEnvio.setBulto(((List<List<BultoJSON>>) resultados
								.get("listaBultos")).get(0));
				}else{
					grabacionEnvio.setBulto(new ArrayList<BultoJSON>());
				}
			}

			// obtenemos el resultado de la ejecucion
			return grabacionEnvio;
		} else {
			return null;
		}
	}

}