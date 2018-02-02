/**
 * @author JK GOLDARACENA & OSCAR GARAY
 */

package es.cex.apiRestGrabacionEnvio.service;

import java.util.Date;
import java.util.List;

import es.cex.apiRestGrabacionEnvio.domain.ConsultaHoraCorte;
import es.cex.apiRestGrabacionEnvio.domain.Etiqueta;
import es.cex.apiRestGrabacionEnvio.domain.EtiquetaInfoAdicional;
import es.cex.apiRestGrabacionEnvio.domain.GrabacionEnvioJSON;
import es.cex.apiRestGrabacionEnvio.domain.GrabacionEnvioResponseJSON;
import es.cex.apiRestGrabacionEnvio.domain.ObtencionEtiqueta;
import es.chx.exceptions.ProcedureException;




/**
 * Interfaz de los servicios proporcionados por el simulador de tarifas y tiempos
 */


public interface IapiRestGrabacionEnvioService {
		
	/**
	 * 
	 * @param grabacionEnvioJSON
	 * @return
	 * @throws ProcedureException
	 */
	GrabacionEnvioResponseJSON getGrabacionEnvios(GrabacionEnvioJSON grabacionEnvioJSON) throws ProcedureException;
	
	
	/**
	 * 
	 * @param grabacionEnvioJSON
	 * @return
	 * @throws ProcedureException
	 */
	GrabacionEnvioResponseJSON getGrabacionEnviosOficina(GrabacionEnvioJSON grabacionEnvioJSON) throws ProcedureException;
	
	
	/**
	 * 
	 * @param keybul
	 * @param keyEsquema
	 * @return
	 * @throws ProcedureException
	 */
	Etiqueta getEtiquetaZPL(String keybul, int keyEsquema) throws ProcedureException;
	

	/**
	 * 
	 * @param cp
	 * @param pais
	 * @return
	 * @throws ProcedureException
	 */
	ConsultaHoraCorte getConsultaHoraCorte(String cp, String pais) throws ProcedureException;
	
	
	/**
	 * 
	 * @param solicitante
	 * @param codUnico
	 * @return
	 * @throws ProcedureException
	 */
	ObtencionEtiqueta getObtencionEtiqueta(String solicitante, String codUnico) throws ProcedureException;
	
	
	
	/**
	 * 
	 * @param numEnvio
	 * @return
	 * @throws ProcedureException
	 */
//	EtiquetaInfoAdicional getEtiquetaInfoAdicional(String numEnvio) throws ProcedureException;
	
	
	
		
}




