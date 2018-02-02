package es.cex.apiRestGrabacionEnvio.domain;

import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author m-penatoledano
 * 
 *         Clase Informacion AQdicional. Se utiliza en el servicio de grabación de envíos.
 */


@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Etiqueta {

	/**
	 * Etiqueta PDF
	 * */
	@JsonProperty("etiqueta1")
	@ApiModelProperty(position = 1)
	private byte[] etiqueta1;
	
	/**
	 * Etiqueta ZPL
	 * */
	@JsonProperty("etiqueta2")
	@ApiModelProperty(position = 2)
	private String etiqueta2;
	
	
	/**
	 * Numero de Recogida
	 * */
	@JsonProperty("numeroRecogida")
	@ApiModelProperty(position = 3)
	private String numeroRecogida;

	
	public byte[] getEtiqueta1() {
		return etiqueta1;
	}


	public void setEtiqueta1(byte[] etiqueta1) {
		this.etiqueta1 = etiqueta1;
	}


	public String getEtiqueta2() {
		return etiqueta2;
	}


	public void setEtiqueta2(String etiqueta2) {
		this.etiqueta2 = etiqueta2;
	}


	public String getNumeroRecogida() {
		return numeroRecogida;
	}


	public void setNumeroRecogida(String numeroRecogida) {
		this.numeroRecogida = numeroRecogida;
	}
	
	
	
	
	
	
	
}


