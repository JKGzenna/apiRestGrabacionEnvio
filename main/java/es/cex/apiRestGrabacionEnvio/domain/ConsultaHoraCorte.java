package es.cex.apiRestGrabacionEnvio.domain;

import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsultaHoraCorte {
	
	
	@JsonProperty("horaCorte")
	@ApiModelProperty(position = 1)
	private String horaCorte;
	
	@JsonProperty("ultimaLlamada")
	@ApiModelProperty(position = 2)
	private String ultimaLLamada;
	
	

	public String getHoraCorte() {
		return horaCorte;
	}

	public void setHoraCorte(String horaCorte) {
		this.horaCorte = horaCorte;
	}

	public String getUltimaLLamada() {
		return ultimaLLamada;
	}

	public void setUltimaLLamada(String ultimaLLamada) {
		this.ultimaLLamada = ultimaLLamada;
	}
	
	
	

}
