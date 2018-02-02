package es.cex.apiRestGrabacionEnvio.domain;

import java.io.Serializable;
import java.util.List;

public class GrabacionRecogida implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	public GrabacionRecogida(String solicitante, String canalEntrada, String refRecogida, String fechaRecogida,
			String hora1Desde, String hora1Hasta, String hora2Desde, String hora2Hasta, String codRte, String nomRte,
			String nifRte, String dirRecog, String pobRecog, String codPosRecog, String contacRecog, String telefRecog,
			String telef2Recog, String emailRecog, String observaciones, String tipoServ, String codDest,
			String nomDest, String nifDest, String dirDest, String pobDest, String codPosNacDest, String paisISODest,
			String codPosIntDest, String contacDest, String telefDest, String emailDest, String numeroEnvio,
			String refEnvio, String producto, String kilos, String volumen, String portes, String reembolso,
			String valDeclMec, String infTec, String nSerie, String modelo, List<BultoJSON> bulto) {
		super();
		this.solicitante = solicitante;
		this.canalEntrada = canalEntrada;
		this.refRecogida = refRecogida;
		this.fechaRecogida = fechaRecogida;
		this.hora1Desde = hora1Desde;
		this.hora1Hasta = hora1Hasta;
		this.hora2Desde = hora2Desde;
		this.hora2Hasta = hora2Hasta;
		this.codRte = codRte;
		this.nomRte = nomRte;
		this.nifRte = nifRte;
		this.dirRecog = dirRecog;
		this.pobRecog = pobRecog;
		this.codPosRecog = codPosRecog;
		this.contacRecog = contacRecog;
		this.telefRecog = telefRecog;
		this.telef2Recog = telef2Recog;
		this.emailRecog = emailRecog;
		this.observaciones = observaciones;
		this.tipoServ = tipoServ;
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
		this.numeroEnvio = numeroEnvio;
		this.refEnvio = refEnvio;
		this.producto = producto;
		this.kilos = kilos;
		this.volumen = volumen;
		this.portes = portes;
		this.reembolso = reembolso;
		this.valDeclMec = valDeclMec;
		this.infTec = infTec;
		this.nSerie = nSerie;
		this.modelo = modelo;
		this.bulto = bulto;
	}



	public GrabacionRecogida(){
		
	}


//	@JsonProperty("solicitante")
//	@ApiModelProperty(position = 1)
	private String solicitante;
	
//	@JsonProperty("canalEntrada")
//	@ApiModelProperty(position = 2)
	private String canalEntrada;
	
	private String refRecogida;
	
	private String fechaRecogida;
	
	private String hora1Desde;
	
	private String hora1Hasta;
	
	private String hora2Desde;
	
	private String hora2Hasta;
	

//	@JsonProperty("codRte")
//	@ApiModelProperty(position = 7)
	private String codRte;
	
//	@JsonProperty("nomRte")
//	@ApiModelProperty(position = 8)
	private String nomRte;

//	@JsonProperty("nifRte")
//	@ApiModelProperty(position = 9)
	private String nifRte;
	
//	@JsonProperty("dirRecog")
//	@ApiModelProperty(position = 10)
	private String dirRecog;
	
//	@JsonProperty("pobRecog")
//	@ApiModelProperty(position = 11)
	private String pobRecog;
	
//	@JsonProperty("codPosRecog")
//	@ApiModelProperty(position = 12)
	private String codPosRecog;
	
//	@JsonProperty("contacRecog")
//	@ApiModelProperty(position = 14)
	private String contacRecog;
	
//	@JsonProperty("telefRecog")
//	@ApiModelProperty(position = 15)
	private String telefRecog;
	
	private String telef2Recog;
	
//	@JsonProperty("emailRte")
//	@ApiModelProperty(position = 16)
	private String emailRecog;
	
	private String observaciones;
	
	private String tipoServ;
	
//	@JsonProperty("codDest")
//	@ApiModelProperty(position = 17)
	private String codDest;
	
//	@JsonProperty("nomDest")
//	@ApiModelProperty(position = 18)
	private String nomDest;
	
//	@JsonProperty("nifDest")
//	@ApiModelProperty(position = 19)
	private String nifDest;
	
//	@JsonProperty("dirDest")
//	@ApiModelProperty(position = 20)
	private String dirDest;
	
//	@JsonProperty("pobDest")
//	@ApiModelProperty(position = 21)
	private String pobDest;
	
//	@JsonProperty("codPosNacDest")
//	@ApiModelProperty(position = 22)
	private String codPosNacDest;
	
//	@JsonProperty("paisISODest")
//	@ApiModelProperty(position = 23)
	private String paisISODest;
	
//	@JsonProperty("codPosIntDest")
//	@ApiModelProperty(position = 24)
	private String codPosIntDest;

//	@JsonProperty("contacDest")
//	@ApiModelProperty(position = 25)
	private String contacDest;

//	@JsonProperty("telefDest")
//	@ApiModelProperty(position = 26)
	private String telefDest;
	
//	@JsonProperty("emailDest")
//	@ApiModelProperty(position = 27)
	private String emailDest;
	
	private String numeroEnvio;
	
	private String refEnvio;
	
//	@JsonProperty("producto")
//	@ApiModelProperty(position = 38)
	private String producto;
	
//	@JsonProperty("kilos")
//	@ApiModelProperty(position = 33)
	private String kilos;

//	@JsonProperty("volumen")
//	@ApiModelProperty(position = 34)
	private String volumen;
	
//	@JsonProperty("portes")
//	@ApiModelProperty(position = 39)
	private String portes;

	private String reembolso;
	
	private String valDeclMec;
	
	private String infTec;
	
	private String nSerie;
	
	private String modelo;
	
//	@JsonProperty("listaBultos")
//	@ApiModelProperty(position = 44)
	private List<BultoJSON> bulto;


	/**
	 * @return the solicitante
	 */
	public String getSolicitante() {
		return solicitante;
	}



	/**
	 * @param solicitante the solicitante to set
	 */
	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}



	/**
	 * @return the canalEntrada
	 */
	public String getCanalEntrada() {
		return canalEntrada;
	}



	/**
	 * @param canalEntrada the canalEntrada to set
	 */
	public void setCanalEntrada(String canalEntrada) {
		this.canalEntrada = canalEntrada;
	}



	/**
	 * @return the refRecogida
	 */
	public String getRefRecogida() {
		return refRecogida;
	}



	/**
	 * @param refRecogida the refRecogida to set
	 */
	public void setRefRecogida(String refRecogida) {
		this.refRecogida = refRecogida;
	}



	/**
	 * @return the fechaRecogida
	 */
	public String getFechaRecogida() {
		return fechaRecogida;
	}



	/**
	 * @param fechaRecogida the fechaRecogida to set
	 */
	public void setFechaRecogida(String fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}



	/**
	 * @return the hora1Desde
	 */
	public String getHora1Desde() {
		return hora1Desde;
	}



	/**
	 * @param hora1Desde the hora1Desde to set
	 */
	public void setHora1Desde(String hora1Desde) {
		this.hora1Desde = hora1Desde;
	}



	/**
	 * @return the hora1Hasta
	 */
	public String getHora1Hasta() {
		return hora1Hasta;
	}



	/**
	 * @param hora1Hasta the hora1Hasta to set
	 */
	public void setHora1Hasta(String hora1Hasta) {
		this.hora1Hasta = hora1Hasta;
	}



	/**
	 * @return the hora2Desde
	 */
	public String getHora2Desde() {
		return hora2Desde;
	}



	/**
	 * @param hora2Desde the hora2Desde to set
	 */
	public void setHora2Desde(String hora2Desde) {
		this.hora2Desde = hora2Desde;
	}



	/**
	 * @return the hora2Hasta
	 */
	public String getHora2Hasta() {
		return hora2Hasta;
	}



	/**
	 * @param hora2Hasta the hora2Hasta to set
	 */
	public void setHora2Hasta(String hora2Hasta) {
		this.hora2Hasta = hora2Hasta;
	}



	/**
	 * @return the codRte
	 */
	public String getCodRte() {
		return codRte;
	}



	/**
	 * @param codRte the codRte to set
	 */
	public void setCodRte(String codRte) {
		this.codRte = codRte;
	}



	/**
	 * @return the nomRte
	 */
	public String getNomRte() {
		return nomRte;
	}



	/**
	 * @param nomRte the nomRte to set
	 */
	public void setNomRte(String nomRte) {
		this.nomRte = nomRte;
	}



	/**
	 * @return the nifRte
	 */
	public String getNifRte() {
		return nifRte;
	}



	/**
	 * @param nifRte the nifRte to set
	 */
	public void setNifRte(String nifRte) {
		this.nifRte = nifRte;
	}



	/**
	 * @return the dirRecog
	 */
	public String getDirRecog() {
		return dirRecog;
	}



	/**
	 * @param dirRecog the dirRecog to set
	 */
	public void setDirRecog(String dirRecog) {
		this.dirRecog = dirRecog;
	}



	/**
	 * @return the pobRecog
	 */
	public String getPobRecog() {
		return pobRecog;
	}



	/**
	 * @param pobRecog the pobRecog to set
	 */
	public void setPobRecog(String pobRecog) {
		this.pobRecog = pobRecog;
	}



	/**
	 * @return the codPosRecog
	 */
	public String getCodPosRecog() {
		return codPosRecog;
	}



	/**
	 * @param codPosRecog the codPosRecog to set
	 */
	public void setCodPosRecog(String codPosRecog) {
		this.codPosRecog = codPosRecog;
	}



	/**
	 * @return the contacRecog
	 */
	public String getContacRecog() {
		return contacRecog;
	}



	/**
	 * @param contacRecog the contacRecog to set
	 */
	public void setContacRecog(String contacRecog) {
		this.contacRecog = contacRecog;
	}



	/**
	 * @return the telefRecog
	 */
	public String getTelefRecog() {
		return telefRecog;
	}



	/**
	 * @param telefRecog the telefRecog to set
	 */
	public void setTelefRecog(String telefRecog) {
		this.telefRecog = telefRecog;
	}



	/**
	 * @return the telef2Recog
	 */
	public String getTelef2Recog() {
		return telef2Recog;
	}



	/**
	 * @param telef2Recog the telef2Recog to set
	 */
	public void setTelef2Recog(String telef2Recog) {
		this.telef2Recog = telef2Recog;
	}



	/**
	 * @return the emailRecog
	 */
	public String getEmailRecog() {
		return emailRecog;
	}



	/**
	 * @param emailRecog the emailRecog to set
	 */
	public void setEmailRecog(String emailRecog) {
		this.emailRecog = emailRecog;
	}



	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}



	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}



	/**
	 * @return the tipoServ
	 */
	public String getTipoServ() {
		return tipoServ;
	}



	/**
	 * @param tipoServ the tipoServ to set
	 */
	public void setTipoServ(String tipoServ) {
		this.tipoServ = tipoServ;
	}



	/**
	 * @return the codDest
	 */
	public String getCodDest() {
		return codDest;
	}



	/**
	 * @param codDest the codDest to set
	 */
	public void setCodDest(String codDest) {
		this.codDest = codDest;
	}



	/**
	 * @return the nomDest
	 */
	public String getNomDest() {
		return nomDest;
	}



	/**
	 * @param nomDest the nomDest to set
	 */
	public void setNomDest(String nomDest) {
		this.nomDest = nomDest;
	}



	/**
	 * @return the nifDest
	 */
	public String getNifDest() {
		return nifDest;
	}



	/**
	 * @param nifDest the nifDest to set
	 */
	public void setNifDest(String nifDest) {
		this.nifDest = nifDest;
	}



	/**
	 * @return the dirDest
	 */
	public String getDirDest() {
		return dirDest;
	}



	/**
	 * @param dirDest the dirDest to set
	 */
	public void setDirDest(String dirDest) {
		this.dirDest = dirDest;
	}



	/**
	 * @return the pobDest
	 */
	public String getPobDest() {
		return pobDest;
	}



	/**
	 * @param pobDest the pobDest to set
	 */
	public void setPobDest(String pobDest) {
		this.pobDest = pobDest;
	}



	/**
	 * @return the codPosNacDest
	 */
	public String getCodPosNacDest() {
		return codPosNacDest;
	}



	/**
	 * @param codPosNacDest the codPosNacDest to set
	 */
	public void setCodPosNacDest(String codPosNacDest) {
		this.codPosNacDest = codPosNacDest;
	}



	/**
	 * @return the paisISODest
	 */
	public String getPaisISODest() {
		return paisISODest;
	}



	/**
	 * @param paisISODest the paisISODest to set
	 */
	public void setPaisISODest(String paisISODest) {
		this.paisISODest = paisISODest;
	}



	/**
	 * @return the codPosIntDest
	 */
	public String getCodPosIntDest() {
		return codPosIntDest;
	}



	/**
	 * @param codPosIntDest the codPosIntDest to set
	 */
	public void setCodPosIntDest(String codPosIntDest) {
		this.codPosIntDest = codPosIntDest;
	}



	/**
	 * @return the contacDest
	 */
	public String getContacDest() {
		return contacDest;
	}



	/**
	 * @param contacDest the contacDest to set
	 */
	public void setContacDest(String contacDest) {
		this.contacDest = contacDest;
	}



	/**
	 * @return the telefDest
	 */
	public String getTelefDest() {
		return telefDest;
	}



	/**
	 * @param telefDest the telefDest to set
	 */
	public void setTelefDest(String telefDest) {
		this.telefDest = telefDest;
	}



	/**
	 * @return the emailDest
	 */
	public String getEmailDest() {
		return emailDest;
	}



	/**
	 * @param emailDest the emailDest to set
	 */
	public void setEmailDest(String emailDest) {
		this.emailDest = emailDest;
	}



	/**
	 * @return the numeroEnvio
	 */
	public String getNumeroEnvio() {
		return numeroEnvio;
	}



	/**
	 * @param numeroEnvio the numeroEnvio to set
	 */
	public void setNumeroEnvio(String numeroEnvio) {
		this.numeroEnvio = numeroEnvio;
	}



	/**
	 * @return the refEnvio
	 */
	public String getRefEnvio() {
		return refEnvio;
	}



	/**
	 * @param refEnvio the refEnvio to set
	 */
	public void setRefEnvio(String refEnvio) {
		this.refEnvio = refEnvio;
	}



	/**
	 * @return the producto
	 */
	public String getProducto() {
		return producto;
	}



	/**
	 * @param producto the producto to set
	 */
	public void setProducto(String producto) {
		this.producto = producto;
	}



	/**
	 * @return the kilos
	 */
	public String getKilos() {
		return kilos;
	}



	/**
	 * @param kilos the kilos to set
	 */
	public void setKilos(String kilos) {
		this.kilos = kilos;
	}



	/**
	 * @return the volumen
	 */
	public String getVolumen() {
		return volumen;
	}



	/**
	 * @param volumen the volumen to set
	 */
	public void setVolumen(String volumen) {
		this.volumen = volumen;
	}



	/**
	 * @return the portes
	 */
	public String getPortes() {
		return portes;
	}



	/**
	 * @param portes the portes to set
	 */
	public void setPortes(String portes) {
		this.portes = portes;
	}



	/**
	 * @return the reembolso
	 */
	public String getReembolso() {
		return reembolso;
	}



	/**
	 * @param reembolso the reembolso to set
	 */
	public void setReembolso(String reembolso) {
		this.reembolso = reembolso;
	}



	/**
	 * @return the valDeclMec
	 */
	public String getValDeclMec() {
		return valDeclMec;
	}



	/**
	 * @param valDeclMec the valDeclMec to set
	 */
	public void setValDeclMec(String valDeclMec) {
		this.valDeclMec = valDeclMec;
	}



	/**
	 * @return the infTec
	 */
	public String getInfTec() {
		return infTec;
	}



	/**
	 * @param infTec the infTec to set
	 */
	public void setInfTec(String infTec) {
		this.infTec = infTec;
	}



	/**
	 * @return the nSerie
	 */
	public String getnSerie() {
		return nSerie;
	}



	/**
	 * @param nSerie the nSerie to set
	 */
	public void setnSerie(String nSerie) {
		this.nSerie = nSerie;
	}



	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}



	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	/**
	 * @return the bulto
	 */
	public List<BultoJSON> getBulto() {
		return bulto;
	}



	/**
	 * @param bulto the bulto to set
	 */
	public void setBulto(List<BultoJSON> bulto) {
		this.bulto = bulto;
	}
	
	


}
	

