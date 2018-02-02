package es.cex.apiRestGrabacionEnvio.domain;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GrabacionEnvioResponseJSON implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("codigoRetorno")
	@ApiModelProperty(position = 1)
	private int codigoRetorno;
	
	@JsonProperty("mensajeRetorno")
	@ApiModelProperty(position = 2)
	private String mensajeRetorno;
	
	@JsonProperty("datosResultado")
	@ApiModelProperty(position = 3)
	private String datosResultado;
	
	@JsonProperty("listaBultos")
	@ApiModelProperty(position = 4)
	private List<BultoJSON> bulto;
	
//  @JsonProperty("resultado")
//  @ApiModelProperty(position = 5)
//  private String resultado;
	
//	@JsonProperty("alto")
//	@ApiModelProperty(position = 1)
//	private String alto;
	
//	@JsonProperty("numEnvioVuelta")
//	@ApiModelProperty(position = 3)
//	private String numEnvioVuelta;
	
	/**
	 * Informacion Adicional
	 */
	@JsonProperty("etiqueta")
	@ApiModelProperty(position = 6)
	private List<Etiqueta> etiqueta;
	
//	@JsonProperty("etiqueta")
//	@ApiModelProperty(position = 6)
//	private byte[] etiqueta;
	
	
	
	
	
	

	
	
	

	public String getDatosResultado() {
		return datosResultado;
	}

	public void setDatosResultado(String datosResultado) {
		this.datosResultado = datosResultado;
	}

//	public String getNumEnvioVuelta() {
//		return numEnvioVuelta;
//	}
//
//	public void setNumEnvioVuelta(String numEnvioVuelta) {
//		this.numEnvioVuelta = numEnvioVuelta;
//	}

//	public String getResultado() {
//		return resultado;
//	}
//
//	public void setResultado(String resultado) {
//		this.resultado = resultado;
//	}

	public int getCodigoRetorno() {
		return codigoRetorno;
	}

	public void setCodigoRetorno(int codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

	public String getMensajeRetorno() {
		return mensajeRetorno;
	}

	public void setMensajeRetorno(String mensajeRetorno) {
		this.mensajeRetorno = mensajeRetorno;
	}

	public List<BultoJSON> getBulto() {
		return bulto;
	}

	public void setBulto(List<BultoJSON> bulto) {
		this.bulto = bulto;
	}

	public List<Etiqueta> getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(List<Etiqueta> etiqueta) {
		this.etiqueta = etiqueta;
	}

//	public byte[] getEtiqueta() {
//		return etiqueta;
//	}
//
//	public void setEtiqueta(byte[] etiqueta) {
//		this.etiqueta = etiqueta;
//	}

	
	
	

	
	
}