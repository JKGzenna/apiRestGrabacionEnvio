package es.cex.apiRestGrabacionEnvio.controller;

import io.swagger.annotations.ApiOperation;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cex.apiRestGrabacionEnvio.common.Constants;
import es.cex.apiRestGrabacionEnvio.common.PDFReceipt;
import es.cex.apiRestGrabacionEnvio.domain.ConsultaHoraCorte;
import es.cex.apiRestGrabacionEnvio.domain.Etiqueta;
import es.cex.apiRestGrabacionEnvio.domain.EtiquetaInfoAdicional;
import es.cex.apiRestGrabacionEnvio.domain.GrabacionEnvioJSON;
import es.cex.apiRestGrabacionEnvio.domain.GrabacionEnvioResponseJSON;
import es.cex.apiRestGrabacionEnvio.domain.ObtencionEtiqueta;
import es.cex.apiRestGrabacionEnvio.service.IapiRestGrabacionEnvioService;
import es.chx.exceptions.ProcedureException;

@RestController
@RequestMapping(value = "/json")
public class JSONRestController {

	/** LOG */
	private static final Log LOG = LogFactory.getLog(JSONRestController.class);
	
//	/** Certificado y LDAP */
//	private String url;
//	private String urlcc;
//	private String truststore_path;
//  private String truststore_password;
//  private String keystore_path;
//  private String keystore_password;
	
    @Autowired
	private IapiRestGrabacionEnvioService apiRestGrabacionEnvioService;
	
//	private String codBarras = null;
	
	
	@PostMapping (value = "/grabacionEnvio", 
			      consumes="application/json", 
			      produces="application/json")
	@ApiOperation(value = "insertGrabacionEnvio", 
				  notes = "Inserta en grabacion de Envios")
	public ResponseEntity<GrabacionEnvioResponseJSON> insertCustomer(@RequestBody GrabacionEnvioJSON grabacionEnvio) {
	
		
		Constants.CONTADOR_BULTOS = 1;

		
		GrabacionEnvioResponseJSON gEnv = new GrabacionEnvioResponseJSON();
		Etiqueta etiqueta = new Etiqueta();
		
		if (grabacionEnvio.getSolicitante() == null || grabacionEnvio.getSolicitante().equals("") || grabacionEnvio.getSolicitante().equals("string")){
			gEnv.setMensajeRetorno("CAMPO SOLICITANTE OBLIGATORIO");
			gEnv.setCodigoRetorno(1);
//		}
//		else if (grabacionEnvio.getRef() == null || grabacionEnvio.getRef().equals("") || grabacionEnvio.getRef().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO REFERENCIA OBLIGATORIO");
//			gEnv.setCodigoRetorno(4);
//		}
//		else if (grabacionEnvio.getFecha() == null || grabacionEnvio.getFecha().equals("") || grabacionEnvio.getFecha().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO FECHA OBLIGATORIO");
//			gEnv.setCodigoRetorno(6);
//		}
//		// Sin este campo da un error general
//		else if (grabacionEnvio.getCodRte() == null || grabacionEnvio.getCodRte().equals("") || grabacionEnvio.getCodRte().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO CODIGO DE REMITENTE OBLIGATORIO");
//			gEnv.setCodigoRetorno(7);
//			
//		}
//		else if (grabacionEnvio.getNomRte() == null || grabacionEnvio.getNomRte().equals("") || grabacionEnvio.getNomRte().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO NOMBRE REMITENTE OBLIGATORIO");
//			gEnv.setCodigoRetorno(8);
//		}
//		else if (grabacionEnvio.getDirRte() == null || grabacionEnvio.getDirRte().equals("") || grabacionEnvio.getDirRte().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO DIRECCION REMITENTE OBLIGATORIO");
//			gEnv.setCodigoRetorno(10);
//		}
//		else if (grabacionEnvio.getPobRte() == null || grabacionEnvio.getPobRte().equals("") || grabacionEnvio.getPobRte().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO POBLACION REMITENTE OBLIGATORIO");
//			gEnv.setCodigoRetorno(11);
//		}
//		else if (grabacionEnvio.getCodPosNacRte() == null || grabacionEnvio.getCodPosNacRte().equals("") || grabacionEnvio.getCodPosNacRte().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO CODIGO POSTAL NACIONAL OBLIGATORIO");
//			gEnv.setCodigoRetorno(12);
//		}
//		else if (grabacionEnvio.getNomDest() == null || grabacionEnvio.getNomDest().equals("") || grabacionEnvio.getNomDest().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO NOMBRE DESTINATARIO OBLIGATORIO");
//			gEnv.setCodigoRetorno(19);
//		}
//		else if (grabacionEnvio.getDirDest() == null || grabacionEnvio.getDirDest().equals("") || grabacionEnvio.getDirDest().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO DIRECCION DESTINATARIO OBLIGATORIO");
//			gEnv.setCodigoRetorno(21);
//		}
//		else if (grabacionEnvio.getPobDest() == null || grabacionEnvio.getPobDest().equals("") || grabacionEnvio.getPobDest().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO POBLACION DESTINATARIO OBLIGATORIO");
//			gEnv.setCodigoRetorno(22);
//		}
//		else if (grabacionEnvio.getCodPosNacDest() == null || grabacionEnvio.getCodPosNacDest().equals("") || grabacionEnvio.getCodPosNacDest().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO CODIGO POSTAL NACIONAL DESTINATARIO OBLIGATORIO");
//			gEnv.setCodigoRetorno(23);
//		}
//		else if (grabacionEnvio.getContacDest() == null || grabacionEnvio.getContacDest().equals("") || grabacionEnvio.getContacDest().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO CONTACTO DESTINATARIO OBLIGATORIO");
//			gEnv.setCodigoRetorno(26);
//		}
//		else if (grabacionEnvio.getTelefDest() == null || grabacionEnvio.getTelefDest().equals("") || grabacionEnvio.getTelefDest().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO TELEFONO DESTINATARIO OBLIGATORIO");
//			gEnv.setCodigoRetorno(27);
//		}
//		else if (grabacionEnvio.getNumBultos() == null || grabacionEnvio.getNumBultos().equals("") || grabacionEnvio.getNumBultos().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO NUMERO DE BULTOS OBLIGATORIO");
//			gEnv.setCodigoRetorno(33);
//		}
//		else if (grabacionEnvio.getKilos() == null || grabacionEnvio.getKilos().equals("") || grabacionEnvio.getKilos().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO KILOS OBLIGATORIO");	
//			gEnv.setCodigoRetorno(34);
//		}
//		else if (grabacionEnvio.getPortes() == null || grabacionEnvio.getPortes().equals("") || grabacionEnvio.getPortes().equals("string")){
//			gEnv.setMensajeRetorno("CAMPO PORTES OBLIGATORIO");	
//			gEnv.setCodigoRetorno(40);

		}else{
			try {
				List<Etiqueta> listaEtiqueta = new ArrayList<Etiqueta>();
				ObtencionEtiqueta oEt = new ObtencionEtiqueta();
				EtiquetaInfoAdicional eIa = new EtiquetaInfoAdicional();
				//oEt = apiRestGrabacionEnvioService.getObtencionEtiqueta(grabacionEnvio.getSolicitante(), grabacionEnvio);
				if (!grabacionEnvio.getCodDirecDestino().isEmpty()
						&& !grabacionEnvio.getCodDirecDestino()
								.equals("string")) {
					gEnv = apiRestGrabacionEnvioService
							.getGrabacionEnviosOficina(grabacionEnvio);
					if (gEnv.getMensajeRetorno() == null){
						gEnv.setMensajeRetorno("");
					}
					for (int i = 0; i < grabacionEnvio.getBulto().size(); i++) {
						Etiqueta et = new Etiqueta();
						if (grabacionEnvio.getInformacionAdicional().get(0)
								.getTipoEtiqueta().equals("1")) {
							try {
//								codBarras = gEnv.getDatosResultado();
								et.setEtiqueta2(null);
								if (gEnv.getBulto().size() > 0){
									//eIa = apiRestGrabacionEnvioService.getEtiquetaInfoAdicional(grabacionEnvio.getNumEnvio());
									oEt = apiRestGrabacionEnvioService.getObtencionEtiqueta(grabacionEnvio.getSolicitante(), gEnv.getBulto().get(i).getCodUnico());
									//oEt.setPlaza(eIa.getNombreDelDes());
									//oEt.setCodDelegacion(eIa.getCodigoDelDes());
									et.setEtiqueta1(generarEtiqueta(oEt, grabacionEnvio, gEnv.getBulto().get(i).getCodUnico()));
								
								//PRUEBAS
//								ConsultaHoraCorte chc = new ConsultaHoraCorte();
//								chc = apiRestGrabacionEnvioService
//										.getConsultaHoraCorte(grabacionEnvio.getCodPosNacRte(), grabacionEnvio.getPaisISORte());
//								System.out.println(chc.getHoraCorte());
								}else{
									//eIa = apiRestGrabacionEnvioService.getEtiquetaInfoAdicional(grabacionEnvio.getNumEnvio());
									oEt = apiRestGrabacionEnvioService.getObtencionEtiqueta(grabacionEnvio.getSolicitante(), grabacionEnvio.getBulto().get(i).getCodUnico());
									//oEt.setPlaza(eIa.getNombreDelDes());
									//oEt.setCodDelegacion(eIa.getCodigoDelDes());
									et.setEtiqueta1(generarEtiqueta(oEt, grabacionEnvio, grabacionEnvio.getBulto().get(i).getCodUnico()));
								}
							} catch (Exception e) {
								LOG.error(Constants.ERROR_GRABAR_ENVIO
										+ e.getMessage());
							}
						}
						if (grabacionEnvio.getInformacionAdicional().get(0)
								.getTipoEtiqueta().equals("2")) {
							try {
								Properties props = loadProperties("messages.properties");
//								codBarras = gEnv.getDatosResultado();
								et.setEtiqueta1(null);
								// llamada al PL que nos recogera el codigo ZPL
								if (gEnv.getBulto().size() > 0){
									etiqueta = apiRestGrabacionEnvioService.getEtiquetaZPL(gEnv.getBulto().get(i).getCodUnico(), Integer.parseInt(props.getProperty("keyEsquema")));
									et.setEtiqueta2(etiqueta.getEtiqueta2());
								}else{
									etiqueta = apiRestGrabacionEnvioService.getEtiquetaZPL(grabacionEnvio.getBulto().get(i).getCodUnico(), Integer.parseInt(props.getProperty("keyEsquema")));
									et.setEtiqueta2(etiqueta.getEtiqueta2());
								}
							} catch (Exception e) {
								LOG.error(Constants.ERROR_GRABAR_ENVIO
										+ e.getMessage());
							}
							
						}
						listaEtiqueta.add(et);
					}
					gEnv.setEtiqueta(listaEtiqueta);
				}else{
					gEnv = apiRestGrabacionEnvioService
							.getGrabacionEnvios(grabacionEnvio);
					if (gEnv.getMensajeRetorno() == null){
						gEnv.setMensajeRetorno("");
					}
					for (int i = 0; i < grabacionEnvio.getBulto().size(); i++) {
						Etiqueta et = new Etiqueta();
						if (grabacionEnvio.getInformacionAdicional().get(0)
								.getTipoEtiqueta().equals("1")) {
							try {
//								codBarras = gEnv.getDatosResultado();
								et.setEtiqueta2(null);
								if (gEnv.getBulto().size() > 0){
									//eIa = apiRestGrabacionEnvioService.getEtiquetaInfoAdicional(grabacionEnvio.getNumEnvio());
									oEt = apiRestGrabacionEnvioService.getObtencionEtiqueta(grabacionEnvio.getSolicitante(), gEnv.getBulto().get(i).getCodUnico());
									//oEt.setPlaza(eIa.getNombreDelDes());
									//oEt.setCodDelegacion(eIa.getCodigoDelDes());
									et.setEtiqueta1(generarEtiqueta(oEt, grabacionEnvio, gEnv.getBulto().get(i).getCodUnico()));
								
								}else{
									//eIa = apiRestGrabacionEnvioService.getEtiquetaInfoAdicional(grabacionEnvio.getNumEnvio());
									oEt = apiRestGrabacionEnvioService.getObtencionEtiqueta(grabacionEnvio.getSolicitante(), grabacionEnvio.getBulto().get(i).getCodUnico());
									//oEt.setPlaza(eIa.getNombreDelDes());
									//oEt.setCodDelegacion(eIa.getCodigoDelDes());
									et.setEtiqueta1(generarEtiqueta(oEt, grabacionEnvio, grabacionEnvio.getBulto().get(i).getCodUnico()));
									
								}

							} catch (Exception e) {
								LOG.error(Constants.ERROR_GRABAR_ENVIO
										+ e.getMessage());
							}
						}
						if (grabacionEnvio.getInformacionAdicional().get(0)
								.getTipoEtiqueta().equals("2")) {
							try {
//								codBarras = gEnv.getDatosResultado();
								Properties props = loadProperties("messages.properties");
								et.setEtiqueta1(null);
								if (gEnv.getBulto().size() > 0){
									etiqueta = apiRestGrabacionEnvioService
											.getEtiquetaZPL(gEnv.getBulto().get(i)
													.getCodUnico(),
													Integer.parseInt(props.getProperty(Constants.KEY_ESQUEMA)));
	
									et.setEtiqueta2(etiqueta.getEtiqueta2());
								}else{
									etiqueta = apiRestGrabacionEnvioService
											.getEtiquetaZPL(grabacionEnvio.getBulto().get(i).getCodUnico(),
													Integer.parseInt(props.getProperty(Constants.KEY_ESQUEMA)));
	
									et.setEtiqueta2(etiqueta.getEtiqueta2());
								}
							} catch (Exception e) {
								LOG.error(Constants.ERROR_GRABAR_ENVIO
										+ e.getMessage());
							}

						}
						listaEtiqueta.add(et);
					}
					gEnv.setEtiqueta(listaEtiqueta);
				}
			} catch (ProcedureException e) {
				String[] mensajeConcatCod = e.getMessage().split("#");
				String errorMensaje = mensajeConcatCod[0]; 
				String errorCod = mensajeConcatCod[1]; 
				gEnv.setMensajeRetorno(errorMensaje);
				gEnv.setCodigoRetorno(Integer.parseInt(errorCod));
				LOG.error(Constants.ERROR_GRABAR_ENVIO
						+ e.getMessage());
			}
		}
		return new ResponseEntity<GrabacionEnvioResponseJSON>(gEnv, HttpStatus.OK);
	}
	
	private byte[] generarEtiqueta(ObtencionEtiqueta etiqueta, GrabacionEnvioJSON grabacionEnvio, String codUnicoBulto) throws Exception {

        // Variable Map con la informaciÃ³n
        Locale locale = new Locale("es_ES");

        HashMap<String, Object> shippingMap = new HashMap<String, Object>();

        // Se rellena la etiqueta con la informaciÃ³n que se recibe del PL.
        // - Los campos que no se reciben, se han comentado.

        // shippingMap.put("sender.hide", "0");
        shippingMap.put("sender.keycli", etiqueta.getCodigoRemi() != null ? etiqueta.getCodigoRemi() : "");
        shippingMap.put("sender.phone", etiqueta.getTelefonoRemi() != null ? etiqueta.getTelefonoRemi() : "");
        shippingMap.put("sender.name", etiqueta.getNombreRemi() != null ? etiqueta.getNombreRemi() : "");
        shippingMap.put("sender.address", etiqueta.getDireccionRemi() != null ? etiqueta.getDireccionRemi() : "");
        shippingMap.put("sender.city", etiqueta.getPoblacionRemi() != null ? etiqueta.getPoblacionRemi() : "");

        shippingMap.put("post.office.box", "0");
        shippingMap.put("postal.mail.cp", etiqueta.getCpRemi() != null ? etiqueta.getCpRemi() : "");
        // nombreDest o nombreDelDest?
        shippingMap.put("receiver.name", etiqueta.getNombreDest() != null ? etiqueta.getNombreDest() : "");
        //nuevo
        shippingMap.put("reference", etiqueta.getReferencia() != null ? etiqueta.getReferencia() : "");
        shippingMap.put("receiver.address", etiqueta.getDireccionDest() != null ? etiqueta.getDireccionDest() : "");
        shippingMap.put("receiver.cp", etiqueta.getCpDest() != null ? etiqueta.getCpDest() : "");
        shippingMap.put("deliveryNote.deliveryOnSaturday", etiqueta.getEntregaSab());
        shippingMap.put("receiver.city", etiqueta.getPoblacionDest() != null ? etiqueta.getPoblacionDest() : "");

        //String city2 = new StringBuilder().append(etiqueta.getPlaza()).append(" ").append(etiqueta.getCodDelegacion()).toString();
        String city2 = etiqueta.getPoblacionDest();
        shippingMap.put("receiver.city2", city2 != null ? city2 : "");

        // El paÃ­s serÃ¡ siempre ESPAÃ‘A
        shippingMap.put("receiver.country", "ESPAÑA");
        shippingMap.put("deliverynote.receiverLabel", "PRUEBA ETIQUETA");
        shippingMap.put("receipt.receiver.contact",
        etiqueta.getContactoDest() != null ? etiqueta.getContactoDest() : "");
        shippingMap.put("observations", etiqueta.getObs2() != null ? etiqueta.getObs2() : "");
        shippingMap.put("officeShippingNumber", etiqueta.getNumeroEnvio() != null ? etiqueta.getNumeroEnvio() : "");
        shippingMap.put("receiver.phone", etiqueta.getTelefonoDest() != null ? etiqueta.getTelefonoDest() : "");
       // shippingMap.put("deliverynote.envioRetornoLabel",
       // etiqueta.getEnvioRetorno() != null ? etiqueta.getEnvioRetorno() : "");

        // Se formatea el reembolso para que aparezca siempre con dos decimales
        NumberFormat ftRefund = NumberFormat.getNumberInstance();
        ftRefund.setMaximumFractionDigits(2);
        ftRefund.setMinimumFractionDigits(2);
        shippingMap.put("refundValue", etiqueta.getReembolso() != null ? ftRefund.format(etiqueta.getReembolso()) : "");
     //   shippingMap.put("refundValue", etiqueta.getReembolso() != 0 ? etiqueta.getReembolso() : "");

        shippingMap.put("parcels", etiqueta.getBultos());
        shippingMap.put("recordingDate", etiqueta.getFechaEnvio() != null ? etiqueta.getFechaEnvio() : "");

        String portes = "";
        if (etiqueta.getPortes() != null) {
            if (etiqueta.getPortes().equals("P")) {
                portes = "PAGADO";
            } else if (etiqueta.getPortes().equals("D")) {
                portes = "DEBIDO";
            }
        }
        shippingMap.put("portage", portes);

        // Se formatea el peso para que aparezca siempre con tres decimales
       NumberFormat ftWeight = NumberFormat.getNumberInstance();
       ftWeight.setMaximumFractionDigits(3);
       ftWeight.setMinimumFractionDigits(3);
       shippingMap.put("weight", etiqueta.getKilos() != null ? ftWeight.format(etiqueta.getKilos()) : "");
      //  shippingMap.put("weight", etiqueta.getKilos() != 0 ? etiqueta.getKilos() : "");

        // El envÃ­o es para grabaciÃ³n privada, pero se ha comprobado que
        // funciona.
        shippingMap.put("fechaEnv", etiqueta.getFechaEnvio());
        shippingMap.put("productName", etiqueta.getNombreProducto());

        // - El mÃ©todo createDeliveryNotes admite una lista de bultos
        // y genera las etiquetas para cada uno.
        // - Actualmente se recibe del PL un bulto Ãºnico.
        // List<String> packagesList = Arrays.asList("10894647966846816879",
        // "20987687498");
        if (etiqueta.getCodigoBarras() != null) {
            //@SuppressWarnings("unchecked")
			//List<List<BultoJSON>> packagesList = Arrays.asList(etiqueta.getBulto());
           // shippingMap.put("deliverynote.packagesList", packagesList);
        	List<String> packagesList = Arrays.asList(codUnicoBulto, etiqueta.getNumeroEnvio());
            shippingMap.put("deliverynote.packagesList", packagesList);
        }

        ByteArrayOutputStream fosBucle = null;

        fosBucle = PDFReceipt.createDeliveryNotes(shippingMap, locale, null);
        Properties props = loadProperties("messages.properties");

         //PASO A ARCHIVO
        if (grabacionEnvio.getInformacionAdicional().get(0).getEtiquetaPDF().equalsIgnoreCase(props.getProperty(Constants.GENERAR_PDF))){
	         FileOutputStream fsalida = null;
	         Constants.CONTADOR_BULTOS = Constants.CONTADOR_BULTOS + 1;
	         try {
	         File f = new File(props.getProperty(Constants.PATH_PDF) + ".pdf");
	         int counter = 1;
	         while(f.exists())
	         {
	             f = new File(props.getProperty(Constants.PATH_PDF) + (counter++) + ".pdf");
	         }
	         fsalida = new FileOutputStream(f);
	        
	         } catch (FileNotFoundException e1) {
	         e1.printStackTrace();
	         }
	         try {
	         fosBucle.writeTo(fsalida);
	         } catch (IOException e1) {
	         e1.printStackTrace();
	         }
	        
	         // Vaciar y cerrar
	         try {
	         fsalida.flush();
	         fsalida.close();
	         } catch (IOException e) {
	         e.printStackTrace();
	         }
        }
//        // FIN PASO A ARCHIVO PARA COMPROBAR EL RESULTADO
        
        return Base64.encodeBase64(fosBucle.toByteArray());
    }
	
	
	 private static Properties loadProperties(String resource)
	            throws IOException, FileNotFoundException {
	        Properties props = new Properties();
	        InputStream in = null;

	        in = PDFReceipt.class.getClassLoader().getResourceAsStream(resource);

	        if (in != null) {
	            props.load(in);
	            in.close();

	        } else {
	            throw new FileNotFoundException(
	                    "No existe el documento de propiedades");
	        }

	        return props;
	    }

}
	

