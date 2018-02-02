/**
 * @author JK GOLDARACENA & OSCAR GARAY
 */

package es.cex.apiRestGrabacionEnvio.domain;

import java.io.Serializable;

/**
 * Clase para la obtencion de los campos que rellenan nuestra etiqueta PDF USANDO EL PCK_WS_DEVOLUCION 
 * y el procedure DAME_INFOADICIONAL_ETIQUETA.
 */

public class EtiquetaInfoAdicional implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	
private String codigoDelOrig;
private String nombreDelOrig;
private String codigoDelDes;
private String nombreDelDes;




public String getCodigoDelOrig() {
	return codigoDelOrig;	
}
public void setCodigoDelOrig(String codigoDelOrig) {
	this.codigoDelOrig = codigoDelOrig;
}
public String getNombreDelOrig() {
	return nombreDelOrig;
}
public void setNombreDelOrig(String nombreDelOrig) {
	this.nombreDelOrig = nombreDelOrig;
}
public String getCodigoDelDes() {
	return codigoDelDes;
}
public void setCodigoDelDes(String codigoDelDes) {
	this.codigoDelDes = codigoDelDes;
}
public String getNombreDelDes() {
	return nombreDelDes;
}
public void setNombreDelDes(String nombreDelDes) {
	this.nombreDelDes = nombreDelDes;
}


}