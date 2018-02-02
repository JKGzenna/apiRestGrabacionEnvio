package es.cex.apiRestGrabacionEnvio.domain;

import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author m-penatoledano
 * 
 *         Clase Bulto. Se utiliza en el servicio de grabación de envíos.
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class BultoJSON {

	/**
	 * Orden del Bulto en la expedición
	 * */
	@JsonProperty("orden")
	@ApiModelProperty(position = 1)
	private String orden;
	
	
	/**
	 * Código Único del Bulto
	 * */
	@JsonProperty("codUnico")
	@ApiModelProperty(position = 2)
	private String codUnico;
	
	/**
	 * Código de bulto del cliente
	 * */
	@JsonProperty("codBultoCli")
	@ApiModelProperty(position = 3)
	private String codBultoCli;
	
	/**
	 * Referencia
	 * */
	@JsonProperty("referencia")
	@ApiModelProperty(position = 4)
	private String referencia;
	
	/**
	 * Descripción
	 * */
	@JsonProperty("descripcion")
	@ApiModelProperty(position = 5)
	private String descripcion;
	
	/**
	 * Observaciones
	 * */
	@JsonProperty("observaciones")
	@ApiModelProperty(position = 6)
	private String observaciones;
	
	/**
	 * Kilos
	 * */
	@JsonProperty("kilos")
	@ApiModelProperty(position = 7)
	private String kilos;
	
	/**
	 * Volumen
	 * */
	@JsonProperty("volumen")
	@ApiModelProperty(position = 8)
	private String volumen;
	
	/**
	 * Alto
	 * */
	@JsonProperty("alto")
	@ApiModelProperty(position = 9)
	private String alto;
	
	/**
	 * Largo
	 * */
	@JsonProperty("largo")
	@ApiModelProperty(position = 10)
	private String largo;
	
	/**
	 * Ancho
	 * */
	@JsonProperty("ancho")
	@ApiModelProperty(position = 11)
	private String ancho;
	
	

	/*
	 * Getters y Setters
	 */
	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public String getCodUnico() {
		return codUnico;
	}

	public void setCodUnico(String codUnico) {
		this.codUnico = codUnico;
	}

	public String getCodBultoCli() {
		return codBultoCli;
	}

	public void setCodBultoCli(String codBultoCli) {
		this.codBultoCli = codBultoCli;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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
}
