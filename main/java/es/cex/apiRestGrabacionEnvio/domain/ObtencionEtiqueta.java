/**
 * @author JK GOLDARACENA & OSCAR GARAY
 */

package es.cex.apiRestGrabacionEnvio.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Clase para la obtencion de los campos que rellenan nuestra etiqueta PDF USANDO EL PCK_WS_DEVOLUCION 
 * y los procedures DAMEETIQUETA y DAME_INFOADICIONAL_ETIQUETA.
 */

public class ObtencionEtiqueta implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	
private String codigoBarras;
private String fechaEnvio;
private String codigoRemi;
private String nombreRemi;
private String direccionRemi;
private String cpRemi;
private String poblacionRemi;
private String telefonoRemi;
private String numeroEnvio;
private String nombreDest;
private String direccionDest;
private String contactoDest;
private String telefonoDest;
private String referencia;
private String observaciones;
private String cpDest;
private String poblacionDest;
private String nombreDelDest;
private BigDecimal kilos;
private Long bultos;
private String portes;
private Long producto;
private String nombreProducto;
private BigDecimal reembolso;
private Long entregaSab;
private String envioRetorno;
private String obs2;
private String codigoEtiqueta;
private String plaza;
private String codDelegacion;




public String getCodigoBarras() {
	return codigoBarras;
}
public void setCodigoBarras(String codigoBarras) {
	this.codigoBarras = codigoBarras;
}


public String getFechaEnvio() {
	return fechaEnvio;
}
public void setFechaEnvio(String fechaEnvio) {
	this.fechaEnvio = fechaEnvio;	
}


public String getCodigoRemi() {
	return codigoRemi;
}
public void setCodigoRemi(String codigoRemi) {
	this.codigoRemi = codigoRemi;	
}


public String getNombreRemi() {
	return nombreRemi;
}
public void setNombreRemi(String nombreRemi) {
	this.nombreRemi = nombreRemi;
}


public String getDireccionRemi() {
	return direccionRemi;
}
public void setDireccionRemi(String direccionRemi) {
	this.direccionRemi = direccionRemi;	
}


public String getCpRemi() {
	return cpRemi;
}
public void setCpRemi(String cpRemi) {
	this.cpRemi = cpRemi;	
}


public String getPoblacionRemi() {
	return poblacionRemi;
}
public void setPoblacionRemi(String poblacionRemi) {
	this.poblacionRemi = poblacionRemi;	
}


public String getTelefonoRemi() {
	return telefonoRemi;
}
public void setTelefonoRemi(String telefonoRemi) {
	this.telefonoRemi = telefonoRemi;	
}


public String getNumeroEnvio() {
	return numeroEnvio;
}
public void setNumeroEnvio(String numeroEnvio) {
	this.numeroEnvio = numeroEnvio;
}


public String getNombreDest() {
	return nombreDest;
}
public void setNombreDest(String nombreDest) {
	this.nombreDest = nombreDest;	
}


public String getDireccionDest() {
	return direccionDest;
}
public void setDireccionDest(String direccionDest) {
	this.direccionDest = direccionDest;	
}


public String getContactoDest() {
	return contactoDest;
}
public void setContactoDest(String contactoDest) {
	this.contactoDest = contactoDest;	
}


public String getTelefonoDest() {
	return telefonoDest;
}
public void setTelefonoDest(String telefonoDest) {
	this.telefonoDest = telefonoDest;
}





/**
 * @return the referencia
 */
public String getReferencia() {
	return referencia;
}
/**
 * @param referencia the referencia to set
 */
public void setReferencia(String referencia) {
	this.referencia = referencia;
}
/**
 * @return the serialversionuid
 */
public static long getSerialversionuid() {
	return serialVersionUID;
}
public String getObservaciones() {
	return observaciones;
}
public void setObservaciones(String observaciones) {
	this.observaciones = observaciones;
}


public String getCpDest() {
	return cpDest;
}
public void setCpDest(String cpDest) {
	this.cpDest = cpDest;
}


public String getPoblacionDest() {
	return poblacionDest;
}
public void setPoblacionDest(String poblacionDest) {
	this.poblacionDest = poblacionDest;
}


public String getNombreDelDest() {
	return nombreDelDest;
}
public void setNombreDelDest(String nombreDelDest) {
	this.nombreDelDest = nombreDelDest;
}






/**
 * @param bigDecimal the kilos to set
 */
public void setKilos(BigDecimal bigDecimal) {
	this.kilos = bigDecimal;
}

/**
 * @return the bultos
 */
public Long getBultos() {
	return bultos;
}
/**
 * @param bultos the bultos to set
 */
public void setBultos(Long bultos) {
	this.bultos = bultos;
}
/**
 * @return the kilos
 */
public BigDecimal getKilos() {
	return kilos;
}
public String getPortes() {
	return portes;
}
public void setPortes(String portes) {
	this.portes = portes;
}


/**
 * @return the producto
 */
public Long getProducto() {
	return producto;
}
/**
 * @param producto the producto to set
 */
public void setProducto(Long producto) {
	this.producto = producto;
}
/**
 * @return the reembolso
 */
public BigDecimal getReembolso() {
	return reembolso;
}
/**
 * @param reembolso the reembolso to set
 */
public void setReembolso(BigDecimal reembolso) {
	this.reembolso = reembolso;
}
/**
 * @return the entregaSab
 */
public Long getEntregaSab() {
	return entregaSab;
}
/**
 * @param entregaSab the entregaSab to set
 */
public void setEntregaSab(Long entregaSab) {
	this.entregaSab = entregaSab;
}
/**
 * @return the envioRetorno
 */
public String getEnvioRetorno() {
	return envioRetorno;
}
/**
 * @param envioRetorno the envioRetorno to set
 */
public void setEnvioRetorno(String envioRetorno) {
	this.envioRetorno = envioRetorno;
}
public String getNombreProducto() {
	return nombreProducto;
}
public void setNombreProducto(String nombreProducto) {
	this.nombreProducto = nombreProducto;
}


public String getObs2() {
	return obs2;
}
public void setObs2(String obs2) {
	this.obs2 = obs2;
}


public String getCodigoEtiqueta() {
	return codigoEtiqueta;
}
public void setCodigoEtiqueta(String codigoEtiqueta) {
	this.codigoEtiqueta = codigoEtiqueta;
}
/**
 * @return the plaza
 */
public String getPlaza() {
	return plaza;
}
/**
 * @param plaza the plaza to set
 */
public void setPlaza(String plaza) {
	this.plaza = plaza;
}
/**
 * @return the codDelegacion
 */
public String getCodDelegacion() {
	return codDelegacion;
}
/**
 * @param codDelegacion the codDelegacion to set
 */
public void setCodDelegacion(String codDelegacion) {
	this.codDelegacion = codDelegacion;
}


}