

package es.cex.apiRestGrabacionEnvio.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.chx.exceptions.ProcedureException;
import es.cex.apiRestGrabacionEnvio.dao.IapiRestGrabacionEnvioDAO;
//import es.cex.apiRestGrabacionEnvio.dao.procedures.GetApiRestEtiqInfoAdicProcedure;
import es.cex.apiRestGrabacionEnvio.dao.procedures.GetApiRestEtiquetaProcedure;
import es.cex.apiRestGrabacionEnvio.dao.procedures.GetApiRestGrabacionEnvioOficProcedure;
import es.cex.apiRestGrabacionEnvio.dao.procedures.GetApiRestGrabacionEnvioProcedure;
import es.cex.apiRestGrabacionEnvio.dao.procedures.GetApiRestHoraCorteRecProcedure;
import es.cex.apiRestGrabacionEnvio.dao.procedures.GetApiRestObtencionEtiqProcedure;
import es.cex.apiRestGrabacionEnvio.domain.ConsultaHoraCorte;
import es.cex.apiRestGrabacionEnvio.domain.Etiqueta;
import es.cex.apiRestGrabacionEnvio.domain.EtiquetaInfoAdicional;
import es.cex.apiRestGrabacionEnvio.domain.GrabacionEnvioJSON;
import es.cex.apiRestGrabacionEnvio.domain.GrabacionEnvioResponseJSON;
import es.cex.apiRestGrabacionEnvio.domain.ObtencionEtiqueta;




@Component("apiRestGrabacionEnvioDAO")
public class ApiRestGrabacionEnvioDAO implements IapiRestGrabacionEnvioDAO {

	
	@Autowired
	private GetApiRestGrabacionEnvioProcedure getApiRestGrabacionEnvioProcedure;
	
	@Autowired
	private GetApiRestGrabacionEnvioOficProcedure getApiRestGrabacionEnvioOficProcedure;
	
	@Autowired
	private GetApiRestEtiquetaProcedure getApiRestEtiquetaProcedure;
	
	@Autowired
	private GetApiRestHoraCorteRecProcedure getApiRestHoraCorteRecProcedure;
	
	@Autowired
	private GetApiRestObtencionEtiqProcedure getApiRestObtencionEtiqProcedure;
	
//	@Autowired
//	private GetApiRestEtiqInfoAdicProcedure getApiRestEtiqInfoAdicProcedure;

	
	public GrabacionEnvioResponseJSON getGrabacionEnvio(
			GrabacionEnvioJSON grabacionEnvioJSON) throws ProcedureException {
		return getApiRestGrabacionEnvioProcedure.execute(grabacionEnvioJSON);
	}
	
	public GrabacionEnvioResponseJSON getGrabacionEnvioOficina(
			GrabacionEnvioJSON grabacionEnvioJSON) throws ProcedureException {
		return getApiRestGrabacionEnvioOficProcedure.execute(grabacionEnvioJSON);
	}

	public Etiqueta getEtiquetaZPL(String keybul, int keyEsquema)
			throws ProcedureException {
		return getApiRestEtiquetaProcedure.execute(keybul, keyEsquema);
	}

	public ConsultaHoraCorte getConsultaHoraCorte(String cp, String pais)
			throws ProcedureException {
		return getApiRestHoraCorteRecProcedure.execute(cp, pais);
	}

	
	public ObtencionEtiqueta getObtencionEtiqueta(String solicitante, String codUnico)
			throws ProcedureException {
		return getApiRestObtencionEtiqProcedure.execute(solicitante, codUnico);
	}
	
//	public EtiquetaInfoAdicional getEtiquetaInfoAdicional(String numEnvio)
//			throws ProcedureException {
//		return getApiRestEtiqInfoAdicProcedure.execute(numEnvio);
//	}	
	
	

}
