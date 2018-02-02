package es.cex.apiRestGrabacionEnvio.domain;

import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author m-penatoledano
 * 
 *         Clase Informacion AQdicional. Se utiliza en el servicio de grabación de envíos.
 */



public class InformacionAdicional {

	/**
	 * Tipo Etiqueta
	 * */
	@JsonProperty("tipoEtiqueta")
	@ApiModelProperty(position = 1)
	private String tipoEtiqueta;
	
	
	/**
	 * Etiqueta PDF
	 * */
	@JsonProperty("etiquetaPDF")
	@ApiModelProperty(position = 2)
	private String etiquetaPDF;
	
	
	/**
	 * Código Remitente
	 * */
	@JsonProperty("codRemitente")
	@ApiModelProperty(position = 3)
	private String codRemitente;
	
	/**
	 * Nombre Remitente
	 * */
	@JsonProperty("nombRte")
	@ApiModelProperty(position = 4)
	private String nombRte;
	
	/**
	 * Dir Remitente
	 * */
	@JsonProperty("dirRte")
	@ApiModelProperty(position = 5)
	private String dirRte;
	
	/**
	 * Poblacion Remitente
	 * */
	@JsonProperty("pobRte")
	@ApiModelProperty(position = 6)
	private String pobRte;
	
	
	
	
	
	
	/**
	 * @return the tipoEtiqueta
	 */
	public String getTipoEtiqueta() {
		return tipoEtiqueta;
	}
	/**
	 * @param tipoEtiqueta the tipoEtiqueta to set
	 */
	public void setTipoEtiqueta(String tipoEtiqueta) {
		this.tipoEtiqueta = tipoEtiqueta;
	}
	public String getEtiquetaPDF() {
		return etiquetaPDF;
	}
	public void setEtiquetaPDF(String etiquetaPDF) {
		this.etiquetaPDF = etiquetaPDF;
	}
	public String getCodRemitente() {
		return codRemitente;
	}
	public void setCodRemitente(String codRemitente) {
		this.codRemitente = codRemitente;
	}
	public String getNombRte() {
		return nombRte;
	}
	public void setNombRte(String nombRte) {
		this.nombRte = nombRte;
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
	
	
	
	
	
}


