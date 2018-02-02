/**
 * @author JK GOLDARACENA & OSCAR GARAY
 */

package es.cex.apiRestGrabacionEnvio.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cex.apiRestGrabacionEnvio.dao.IapiRestGrabacionEnvioDAO;
import es.cex.apiRestGrabacionEnvio.domain.ConsultaHoraCorte;
import es.cex.apiRestGrabacionEnvio.domain.Etiqueta;
import es.cex.apiRestGrabacionEnvio.domain.EtiquetaInfoAdicional;
import es.cex.apiRestGrabacionEnvio.domain.GrabacionEnvioJSON;
import es.cex.apiRestGrabacionEnvio.domain.GrabacionEnvioResponseJSON;
import es.cex.apiRestGrabacionEnvio.domain.ObtencionEtiqueta;
import es.cex.apiRestGrabacionEnvio.service.IapiRestGrabacionEnvioService;
import es.chx.exceptions.ProcedureException;




@Service("apiGrabacionEnvioService")
public class ApiRestGrabacionEnvioService implements IapiRestGrabacionEnvioService {

	/** apiRestGrabacionEnvioDAO */
	@Autowired
	private IapiRestGrabacionEnvioDAO apiRestGrabacionEnvioDAO;
	
	

	public GrabacionEnvioResponseJSON getGrabacionEnvios(
			GrabacionEnvioJSON grabacionEnvioJSON)
			throws ProcedureException {
		return apiRestGrabacionEnvioDAO.getGrabacionEnvio(grabacionEnvioJSON);
	}
	
	public GrabacionEnvioResponseJSON getGrabacionEnviosOficina(
			GrabacionEnvioJSON grabacionEnvioJSON)
			throws ProcedureException {
		return apiRestGrabacionEnvioDAO.getGrabacionEnvioOficina(grabacionEnvioJSON);
	}
	
	public Etiqueta getEtiquetaZPL(
			String keybul, int keyEsquema)
			throws ProcedureException {
		return apiRestGrabacionEnvioDAO.getEtiquetaZPL(keybul, keyEsquema);
	}
	
	public ConsultaHoraCorte getConsultaHoraCorte(String cp, String pais)
			throws ProcedureException {
		return apiRestGrabacionEnvioDAO.getConsultaHoraCorte(cp, pais);
	}

	
	public ObtencionEtiqueta getObtencionEtiqueta(String solicitante, String codUnico) throws ProcedureException {
		return apiRestGrabacionEnvioDAO.getObtencionEtiqueta(solicitante, codUnico);
	}

	
//	public EtiquetaInfoAdicional getEtiquetaInfoAdicional(String numEnvio)
//			throws ProcedureException {
//		return apiRestGrabacionEnvioDAO.getEtiquetaInfoAdicional(numEnvio);
//}
	
}

