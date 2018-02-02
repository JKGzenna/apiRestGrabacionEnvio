package es.cex.apiRestGrabacionEnvio.domain;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GrabacionEnvioJSON implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	

	public GrabacionEnvioJSON(String solicitante, String canalEntrada,
			String numEnvio, String ref, String refCliente, String fecha,
			String codRte, String nomRte, String nifRte, String dirRte,
			String pobRte, String codPosNacRte, String paisISORte,
			String codPosIntRte, String contacRte, String telefRte,
			String emailRte, String codDest, String nomDest, String nifDest,
			String dirDest, String pobDest, String codPosNacDest,
			String paisISODest, String codPosIntDest, String contacDest,
			String telefDest, String emailDest, String contacOtrs,
			String telefOtrs, String emailOtrs, String observac,
			String numBultos, String kilos, String volumen, String alto,
			String largo, String ancho, String producto, String portes,
			String reembolso, String entrSabado, String seguro,
			String numEnvioVuelta, String password, List<BultoJSON> bulto,
			String codDirecDestino,
			List<InformacionAdicional> informacionAdicional) {
		super();
		this.solicitante = solicitante;
		this.canalEntrada = canalEntrada;
		this.numEnvio = numEnvio;
		this.ref = ref;
		this.refCliente = refCliente;
		this.fecha = fecha;
		this.codRte = codRte;
		this.nomRte = nomRte;
		this.nifRte = nifRte;
		this.dirRte = dirRte;
		this.pobRte = pobRte;
		this.codPosNacRte = codPosNacRte;
		this.paisISORte = paisISORte;
		this.codPosIntRte = codPosIntRte;
		this.contacRte = contacRte;
		this.telefRte = telefRte;
		this.emailRte = emailRte;
		this.codDest = codDest;
		this.nomDest = nomDest;
		this.nifDest = nifDest;
		this.dirDest = dirDest;
		this.pobDest = pobDest;
		this.codPosNacDest = codPosNacDest;
		this.paisISODest = paisISODest;
		this.codPosIntDest = codPosIntDest;
		this.contacDest = contacDest;
		this.telefDest = telefDest;
		this.emailDest = emailDest;
		this.contacOtrs = contacOtrs;
		this.telefOtrs = telefOtrs;
		this.emailOtrs = emailOtrs;
		this.observac = observac;
		this.numBultos = numBultos;
		this.kilos = kilos;
		this.volumen = volumen;
		this.alto = alto;
		this.largo = largo;
		this.ancho = ancho;
		this.producto = producto;
		this.portes = portes;
		this.reembolso = reembolso;
		this.entrSabado = entrSabado;
		this.seguro = seguro;
		this.numEnvioVuelta = numEnvioVuelta;
		this.password = password;
		this.bulto = bulto;
		this.codDirecDestino = codDirecDestino;
		this.informacionAdicional = informacionAdicional;
	}

	public GrabacionEnvioJSON(){
		
	}

	/**
	 * Solicitante
	 */
	@JsonProperty("solicitante")
	@ApiModelProperty(position = 1)
	private String solicitante;
	
	/**
	 * Canal de Entrada
	 */
	@JsonProperty("canalEntrada")
	@ApiModelProperty(position = 2)
	private String canalEntrada;
	
	/**
	 * Número de envío
	 **/
	@JsonProperty("numEnvio")
	@ApiModelProperty(position = 3)
	private String numEnvio;
	/**
	 * Referencia
	 **/
	
	@JsonProperty("ref")
	@ApiModelProperty(position = 4)
	private String ref;
	/**
	 * Referencia Cliente
	 **/
	@JsonProperty("refCliente")
	@ApiModelProperty(position = 5)
	private String refCliente;
	/**
	 * Fecha
	 **/
	@JsonProperty("fecha")
	@ApiModelProperty(position = 6)
	private String fecha;
	/**
	 * Código Remitente
	 **/
	@JsonProperty("codRte")
	@ApiModelProperty(position = 7)
	private String codRte;
	/**
	 * Nombre Remitente
	 **/
	
	@JsonProperty("nomRte")
	@ApiModelProperty(position = 8)
	private String nomRte;
	/**
	 * Nif Remitente
	 **/
	
	@JsonProperty("nifRte")
	@ApiModelProperty(position = 9)
	private String nifRte;
	/**
	 * Dirección Remitente
	 **/
	
	@JsonProperty("dirRte")
	@ApiModelProperty(position = 10)
	private String dirRte;
	/**
	 * Población Remitente
	 **/
	
	@JsonProperty("pobRte")
	@ApiModelProperty(position = 11)
	private String pobRte;
	/**
	 * Código Postal Nacional Remitente
	 **/
	
	@JsonProperty("codPosNacRte")
	@ApiModelProperty(position = 12)
	private String codPosNacRte;
	/**
	 * Código de Pais ISO del Remitente
	 **/
	
	@JsonProperty("paisISORte")
	@ApiModelProperty(position = 12)
	private String paisISORte;
	/**
	 * Código Postal Internacional
	 **/
	
	@JsonProperty("codPosIntRte")
	@ApiModelProperty(position = 13)
	private String codPosIntRte;
	/**
	 * Contacto Remitente
	 **/
	
	@JsonProperty("contacRte")
	@ApiModelProperty(position = 14)
	private String contacRte;
	/**
	 * Teléfono Remitente
	 **/
	
	@JsonProperty("telefRte")
	@ApiModelProperty(position = 15)
	private String telefRte;
	/**
	 * Email Remitente
	 **/
	
	@JsonProperty("emailRte")
	@ApiModelProperty(position = 16)
	private String emailRte;
	/**
	 * Código Destinatario
	 **/
	
	@JsonProperty("codDest")
	@ApiModelProperty(position = 17)
	private String codDest;
	/**
	 * Nombre Destinatario
	 **/
	
	@JsonProperty("nomDest")
	@ApiModelProperty(position = 18)
	private String nomDest;
	/**
	 * Nif Destinatario
	 **/
	
	@JsonProperty("nifDest")
	@ApiModelProperty(position = 19)
	private String nifDest;
	/**
	 * Dirección Destinatario
	 **/
	
	@JsonProperty("dirDest")
	@ApiModelProperty(position = 20)
	private String dirDest;
	/**
	 * Población Destinatario
	 **/
	
	@JsonProperty("pobDest")
	@ApiModelProperty(position = 21)
	private String pobDest;
	/**
	 * Código Postal Nacional Destinatario
	 **/
	
	@JsonProperty("codPosNacDest")
	@ApiModelProperty(position = 22)
	private String codPosNacDest;
	/**
	 * Código de Pais ISO del Destinatario
	 **/
	
	@JsonProperty("paisISODest")
	@ApiModelProperty(position = 23)
	private String paisISODest;
	/**
	 * Código Postal Internacional del Destinatario
	 **/
	
	@JsonProperty("codPosIntDest")
	@ApiModelProperty(position = 24)
	private String codPosIntDest;
	/**
	 * Contacto Destinatario
	 **/
	
	@JsonProperty("contacDest")
	@ApiModelProperty(position = 25)
	private String contacDest;
	/**
	 * Teléfono Destinatario
	 **/
	
	@JsonProperty("telefDest")
	@ApiModelProperty(position = 26)
	private String telefDest;
	/**
	 * Email Destinatario
	 **/
	
	@JsonProperty("emailDest")
	@ApiModelProperty(position = 27)
	private String emailDest;
	/**
	 * Otros Contacto
	 **/
	
	@JsonProperty("contacOtrs")
	@ApiModelProperty(position = 28)
	private String contacOtrs;
	/**
	 * Otros Teléfono
	 **/
	
	@JsonProperty("telefOtrs")
	@ApiModelProperty(position = 29)
	private String telefOtrs;
	/**
	 * Otros Email
	 **/
	
	@JsonProperty("emailOtrs")
	@ApiModelProperty(position = 30)
	private String emailOtrs;
	/**
	 * Observaciones
	 **/
	
	@JsonProperty("observac")
	@ApiModelProperty(position = 31)
	private String observac;
	/**
	 * Número de bultos
	 **/
	
	@JsonProperty("numBultos")
	@ApiModelProperty(position = 32)
	private String numBultos;
	/**
	 * Kilos
	 **/
	
	@JsonProperty("kilos")
	@ApiModelProperty(position = 33)
	private String kilos;
	/**
	 * Volumen
	 **/
	
	@JsonProperty("volumen")
	@ApiModelProperty(position = 34)
	private String volumen;
	/**
	 * Alto
	 **/
	
	@JsonProperty("alto")
	@ApiModelProperty(position = 35)
	private String alto;
	/**
	 * Largo
	 **/
	
	@JsonProperty("largo")
	@ApiModelProperty(position = 36)
	private String largo;
	/**
	 * Ancho
	 **/
	
	@JsonProperty("ancho")
	@ApiModelProperty(position = 37)
	private String ancho;
	/**
	 * Producto
	 **/
	
	@JsonProperty("producto")
	@ApiModelProperty(position = 38)
	private String producto;
	/**
	 * Tipo de portes
	 **/
	
	@JsonProperty("portes")
	@ApiModelProperty(position = 39)
	private String portes;
	/**
	 * Importe de reembolso
	 **/
	
	@JsonProperty("reembolso")
	@ApiModelProperty(position = 40)
	private String reembolso;
	/**
	 * Servicio adicional de Entrega en Sábado
	 **/
	
	@JsonProperty("entrSabado")
	@ApiModelProperty(position = 41)
	private String entrSabado;
	/**
	 * Importe de Seguro a todo riesgo
	 **/
	
	@JsonProperty("seguro")
	@ApiModelProperty(position = 42)
	private String seguro;
	
	/**
	 * Numero Envio Vuelta
	 * */
	
	@JsonProperty("numEnvioVuelta")
	@ApiModelProperty(position = 43)
	private String numEnvioVuelta;
	
	/**
	 * Password
	 */
	@JsonProperty("password")
	@ApiModelProperty(position = 46)
	private String password;
	
	/**
	 * Lista Bultos
	 */
	@JsonProperty("listaBultos")
	@ApiModelProperty(position = 44)
	private List<BultoJSON> bulto;
	
	/**
	 * CampoS solo para Grabacion Envio Oficinas
	 */
	
	
	/**
	 * Cod Direccion destino
	 */
	@JsonProperty("codDirecDestino")
	@ApiModelProperty(position = 45)
	private String codDirecDestino;
	
	
	/**
	 * Informacion Adicional
	 */
	@JsonProperty("listaInformacionAdicional")
	@ApiModelProperty(position = 48)
	private List<InformacionAdicional> informacionAdicional;
	
	
	@JsonProperty("recogidaEnvio")
	@ApiModelProperty(position = 47)
	private String recogidaEnvio;
	
//	/**
//	 * CodigoError 
//	 */
//	@JsonProperty("error")
//	@ApiModelProperty(position = 48)
//	private int error;
//	
//	/**
//	 * Mensaje de error
//	 */
//	
//	@JsonProperty("mensajeError")
//	@ApiModelProperty(position = 49)
//	private String mensajeError;
	

	
	/**
	 * GETTERS AND SETTERS
	 * 
	 */
	
	
	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public String getCanalEntrada() {
		return canalEntrada;
	}

	public void setCanalEntrada(String canalEntrada) {
		this.canalEntrada = canalEntrada;
	}

	public String getNumEnvio() {
		return numEnvio;
	}

	public void setNumEnvio(String numEnvio) {
		this.numEnvio = numEnvio;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getRefCliente() {
		return refCliente;
	}

	public void setRefCliente(String refCliente) {
		this.refCliente = refCliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCodRte() {
		return codRte;
	}

	public void setCodRte(String codRte) {
		this.codRte = codRte;
	}

	public String getNomRte() {
		return nomRte;
	}

	public void setNomRte(String nomRte) {
		this.nomRte = nomRte;
	}

	public String getNifRte() {
		return nifRte;
	}

	public void setNifRte(String nifRte) {
		this.nifRte = nifRte;
	}

	public String getDirRte() {
		return dirRte;
	}

	public void setDirRte(String dirRte) {
		this.dirRte = dirRte;
	}

	public String getPobRte() {
		return pobRte;
	}

	public void setPobRte(String pobRte) {
		this.pobRte = pobRte;
	}

	public String getCodPosNacRte() {
		return codPosNacRte;
	}

	public void setCodPosNacRte(String codPosNacRte) {
		this.codPosNacRte = codPosNacRte;
	}

	public String getPaisISORte() {
		return paisISORte;
	}

	public void setPaisISORte(String paisISORte) {
		this.paisISORte = paisISORte;
	}

	public String getCodPosIntRte() {
		return codPosIntRte;
	}

	public void setCodPosIntRte(String codPosIntRte) {
		this.codPosIntRte = codPosIntRte;
	}

	public String getContacRte() {
		return contacRte;
	}

	public void setContacRte(String contacRte) {
		this.contacRte = contacRte;
	}

	public String getTelefRte() {
		return telefRte;
	}

	public void setTelefRte(String telefRte) {
		this.telefRte = telefRte;
	}

	public String getEmailRte() {
		return emailRte;
	}

	public void setEmailRte(String emailRte) {
		this.emailRte = emailRte;
	}

	public String getCodDest() {
		return codDest;
	}

	public void setCodDest(String codDest) {
		this.codDest = codDest;
	}

	public String getNomDest() {
		return nomDest;
	}

	public void setNomDest(String nomDest) {
		this.nomDest = nomDest;
	}

	public String getNifDest() {
		return nifDest;
	}

	public void setNifDest(String nifDest) {
		this.nifDest = nifDest;
	}

	public String getDirDest() {
		return dirDest;
	}

	public void setDirDest(String dirDest) {
		this.dirDest = dirDest;
	}

	public String getPobDest() {
		return pobDest;
	}

	public void setPobDest(String pobDest) {
		this.pobDest = pobDest;
	}

	public String getCodPosNacDest() {
		return codPosNacDest;
	}

	public void setCodPosNacDest(String codPosNacDest) {
		this.codPosNacDest = codPosNacDest;
	}

	public String getPaisISODest() {
		return paisISODest;
	}

	public void setPaisISODest(String paisISODest) {
		this.paisISODest = paisISODest;
	}

	public String getCodPosIntDest() {
		return codPosIntDest;
	}

	public void setCodPosIntDest(String codPosIntDest) {
		this.codPosIntDest = codPosIntDest;
	}

	public String getContacDest() {
		return contacDest;
	}

	public void setContacDest(String contacDest) {
		this.contacDest = contacDest;
	}

	public String getTelefDest() {
		return telefDest;
	}

	public void setTelefDest(String telefDest) {
		this.telefDest = telefDest;
	}

	public String getEmailDest() {
		return emailDest;
	}

	public void setEmailDest(String emailDest) {
		this.emailDest = emailDest;
	}

	public String getContacOtrs() {
		return contacOtrs;
	}

	public void setContacOtrs(String contacOtrs) {
		this.contacOtrs = contacOtrs;
	}

	public String getTelefOtrs() {
		return telefOtrs;
	}

	public void setTelefOtrs(String telefOtrs) {
		this.telefOtrs = telefOtrs;
	}

	public String getEmailOtrs() {
		return emailOtrs;
	}

	public void setEmailOtrs(String emailOtrs) {
		this.emailOtrs = emailOtrs;
	}

	public String getObservac() {
		return observac;
	}

	public void setObservac(String observac) {
		this.observac = observac;
	}

	public String getNumBultos() {
		return numBultos;
	}

	public void setNumBultos(String numBultos) {
		this.numBultos = numBultos;
	}

	public String getKilos() {
		return kilos;
	}

	public void setKilos(String kilos) {
		this.kilos = kilos;
	}

	public String getVolumen() {
		return volumen;
	}

	public void setVolumen(String volumen) {
		this.volumen = volumen;
	}

	public String getAlto() {
		return alto;
	}

	public void setAlto(String alto) {
		this.alto = alto;
	}

	public String getLargo() {
		return largo;
	}

	public void setLargo(String largo) {
		this.largo = largo;
	}

	public String getAncho() {
		return ancho;
	}

	public void setAncho(String ancho) {
		this.ancho = ancho;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getPortes() {
		return portes;
	}

	public void setPortes(String portes) {
		this.portes = portes;
	}

	public String getReembolso() {
		return reembolso;
	}

	public void setReembolso(String reembolso) {
		this.reembolso = reembolso;
	}

	public String getEntrSabado() {
		return entrSabado;
	}

	public void setEntrSabado(String entrSabado) {
		this.entrSabado = entrSabado;
	}

	public String getSeguro() {
		return seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}

	public String getNumEnvioVuelta() {
		return numEnvioVuelta;
	}

	public void setNumEnvioVuelta(String numEnvioVuelta) {
		this.numEnvioVuelta = numEnvioVuelta;
	}
	
	
//	public int getError() {
//		return error;
//	}
//
//	public void setError(int error) {
//		this.error = error;
//	}
//
//	public String getMensajeError() {
//		return mensajeError;
//	}
//
//	public void setMensajeError(String mensajeError) {
//		this.mensajeError = mensajeError;
//	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<BultoJSON> getBulto() {
		return bulto;
	}

	public void setBulto(List<BultoJSON> bulto) {
		this.bulto = bulto;
	}

	/**
	 * ESTE CAMPO SOLO ES PARA GRABACION ENVIO OFICINAS
	 * @return
	 */
	public String getCodDirecDestino() {
		return codDirecDestino;
	}

	public void setCodDirecDestino(String codDirecDestino) {
		this.codDirecDestino = codDirecDestino;
	}
    
	/**
	 *LISTA INFORMACION ADICIONAL
	 * @return
	 */
	public List<InformacionAdicional> getInformacionAdicional() {
		return informacionAdicional;
	}

	public void setInformacionAdicional(
			List<InformacionAdicional> informacionAdicional) {
		this.informacionAdicional = informacionAdicional;
	}

	public String getRecogidaEnvio() {
		return recogidaEnvio;
	}

	public void setRecogidaEnvio(String recogidaEnvio) {
		this.recogidaEnvio = recogidaEnvio;
	}
	
	
	

//	@Override
//    public String toString() {
//        return String.format("{solicitante:%s,canalEntrada:%s,numEnvio:%s,ref:%s}", solicitante, canalEntrada, numEnvio, ref);
//    }
	


}
	

