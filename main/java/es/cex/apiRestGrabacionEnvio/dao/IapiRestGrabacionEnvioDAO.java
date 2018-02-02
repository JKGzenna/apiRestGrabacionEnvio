/**
 * @author JK GOLDARACENA & OSCAR GARAY
 */

package es.cex.apiRestGrabacionEnvio.dao;

import java.util.Date;
import java.util.List;

import es.cex.apiRestGrabacionEnvio.domain.ConsultaHoraCorte;
import es.cex.apiRestGrabacionEnvio.domain.Etiqueta;
import es.cex.apiRestGrabacionEnvio.domain.EtiquetaInfoAdicional;
import es.cex.apiRestGrabacionEnvio.domain.GrabacionEnvioJSON;
import es.cex.apiRestGrabacionEnvio.domain.GrabacionEnvioResponseJSON;
import es.cex.apiRestGrabacionEnvio.domain.ObtencionEtiqueta;
import es.chx.exceptions.ProcedureException;





public interface IapiRestGrabacionEnvioDAO {
	

/**
 * 
 * @param grabacionEnvioResponse
 * @return
 * @throws ProcedureException
 */
GrabacionEnvioResponseJSON getGrabacionEnvio(GrabacionEnvioJSON grabacionEnvioRequest) throws ProcedureException;

GrabacionEnvioResponseJSON getGrabacionEnvioOficina(GrabacionEnvioJSON grabacionEnvioRequest) throws ProcedureException;

Etiqueta getEtiquetaZPL(String keybul, int keyEsquema) throws ProcedureException;

ConsultaHoraCorte getConsultaHoraCorte(String cp, String pais) throws ProcedureException;

ObtencionEtiqueta getObtencionEtiqueta(String solicitante, String codUnico) throws ProcedureException;

//EtiquetaInfoAdicional getEtiquetaInfoAdicional(String numEnvio) throws ProcedureException;
}