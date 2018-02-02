package es.cex.apiRestGrabacionEnvio.common;

import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.pdf.Barcode128;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfCopyFields;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;

//import es.chx.apirestoficina.services.util.constants.Constants;
//import es.chx.apirestoficina.services.util.export.pdf.commons.PDFCommons;

/**
 * Clase de utilidad para generar los PDFs para albaranes, recibos y etiquetas.
 * 
 * @author x11443fe
 * 
 */
public class PDFReceipt {

    private static Log log = LogFactoryUtil.getLog(PDFReceipt.class);

    protected static final String JAVASCRIPT_PRINT_PARAMS = "if (global.defaultPrinter === undefined) {global.defaultPrinter = this.getPrintParams().printerName; } var pp=this.getPrintParams(); pp.interactive = pp.constants.interactionLevel.automatic;";

    protected static final String JAVASCRIPT_PAGES_PARAMS = "pp.firstPage = %s; pp.lastPage = %s;";

    protected static final String JAVASCRIPT_PRINTER_NAME_PARAM = "pp.printerName = '%s';";

    protected static final String JAVASCRIPT_PRINTER_NAME_PARAM_DEFAULT = "pp.printerName = global.defaultPrinter;";

    protected static final String JAVASCRIPT_EXEC_PRINT = "this.print({bUI: false, bSilent: true, bShrinkToFit: false, nStart: %s, nEnd: %s, printParams: pp});";

    protected static final String JAVASCRIPT_CLOSE_DOC = "this.closeDoc();";
    protected static final int javascriptLenght = JAVASCRIPT_PRINT_PARAMS
            .length()
            + JAVASCRIPT_PAGES_PARAMS.length()
            + JAVASCRIPT_PRINTER_NAME_PARAM.length()
            + JAVASCRIPT_EXEC_PRINT.length()
            + JAVASCRIPT_CLOSE_DOC.length()
            + 50;

    protected static void addPrintingJavascript(final PdfCopyFields copy,
            final int firstPage, final int lastPage, final String printer) {
        if (printer != null) {
            copy.addJavaScript(buildPrintingJavascript(firstPage, lastPage,
                    printer));
        }
    }

    public static void addPrintingJavascript(final PdfStamper stamper,
            final int firstPage, final int lastPage, final String printer) {
        if (printer != null) {
            stamper.addJavaScript(buildPrintingJavascript(firstPage, lastPage,
                    printer));
        }
    }

    public static void addCloseDocJavascript(final PdfStamper stamper) {
        stamper.addJavaScript(JAVASCRIPT_CLOSE_DOC);
    }

    /**
     * Crea el javascript necesario para imprimir desde Abode PDF.
     * 
     * Algunas variables aparacen duplicadas para dar soporte a todas las
     * versiones de Adobe: - Acrobat < 6.0 = this.print({ bUI: false, bSilent:
     * true, bShrinkToFit: true, nStart: 1, nEnd: 10, printParams: pp }); -
     * Acrobat >= 6.0 = this.print(pp)
     */
    protected static String buildPrintingJavascript(final int firstPage,
            final int lastPage, final String printer) {
        final StringBuilder javascript = new StringBuilder(javascriptLenght);

        javascript.append(JAVASCRIPT_PRINT_PARAMS);
        javascript.append(String.format(JAVASCRIPT_PAGES_PARAMS, firstPage,
                lastPage));

        if (printer.trim().length() > 0) {
            javascript.append(String.format(JAVASCRIPT_PRINTER_NAME_PARAM,
                    printer));
        } else {
            javascript.append(JAVASCRIPT_PRINTER_NAME_PARAM_DEFAULT);
        }

        javascript.append(String.format(JAVASCRIPT_EXEC_PRINT, firstPage,
                lastPage));

        return javascript.toString();
    }

    /**
     * Concatena los PDF que recibe como primer parametro y devuelve el
     * resultado en el OutputStream que se le pasa como segundo parámetro
     * 
     * @param streamOfPDFFiles
     *            lista de los PDFs a concatenar
     * @param outputStream
     *            contendrá los PDFs concatenados
     * @throws DocumentException
     * @throws IOException
     */
    private static void concatPDFs(final List<InputStream> streamOfPDFFiles,
            final OutputStream outputStream) throws DocumentException,
            IOException {

        final PdfCopyFields copy = new PdfCopyFields(outputStream);

        for (final InputStream inputStream : streamOfPDFFiles) {
            copy.addDocument(new PdfReader(inputStream));
        }

        copy.close();
    }

    private static byte[] getBytes(InputStream is) throws IOException {

        int len;
        int size = 1024;
        byte[] buf;

        if (is instanceof ByteArrayInputStream) {
            size = is.available();
            buf = new byte[size];
            len = is.read(buf, 0, size);
        } else {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            buf = new byte[size];
            while ((len = is.read(buf, 0, size)) != -1)
                bos.write(buf, 0, len);
            buf = bos.toByteArray();
        }
        return buf;
    }

    /**
     * Carga la imagen del logo para situarla sobre el PDF generado
     * 
     * @param name
     *            nombre del fichero que contiene el logo
     * @return un array de bytes con la imagen del logo
     * @throws Exception
     */
    private static byte[] loadLogo(String name) throws Exception {

        byte[] logo = null;

        StringBuffer uri = new StringBuffer();

        String uriFtpHost = PropsUtil.get("uriFtp.hostexp");
        String uriFtpUsu = PropsUtil.get("uriFtp.usuexp");
        String uriFtpPass = PropsUtil.get("uriFtp.passexp");
        String uriFtpRemDir = PropsUtil.get("ftp.remoteDir") + name;

        uri.append(uriFtpRemDir);
        uri.append(";type=i");
        uri.insert(0, ":21/");
        uri.insert(0, uriFtpHost);
        uri.insert(0, "@");
        uri.insert(0, uriFtpPass);
        uri.insert(0, ":");
        uri.insert(0, uriFtpUsu);
        uri.insert(0, "ftp://");

        try {
            URL url = new URL(uri.toString());
            InputStream inputStream = url.openStream();
            logo = getBytes(inputStream);
        } catch (IOException ex) {
            log.error("Error descargando logotipo del FTP " + name);
        }

        return logo;
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

    public static void createDeliveryNote(final String parcelCode,
            final int parcelCounter, final HashMap<String, Object> shippingMap,
            final OutputStream exit, final Locale locale,
            final String pathToLogo) throws Exception {

        Properties props = loadProperties("messages.properties");

        PdfReader pdfTemplate;
        PdfStamper stamper;

        try {

            pdfTemplate = new PdfReader(
                    getTemplate(Constants.DELIVERYNOTE_TEMPLATE));

            try {
                stamper = new PdfStamper(pdfTemplate, exit);
                // para que no haya campos editables en el PDF generado
                stamper.setFormFlattening(true);

                // first column
                // sender properties
                if (Validator.isNull((String) shippingMap
                        .get(Constants.HIDE_SENDER))
                        || (((String) shippingMap.get(Constants.HIDE_SENDER))
                                .compareTo("1") != 0)) {
                    stamper.getAcroFields().setField(Constants.SENDER_KEYCLI,
                            (String) shippingMap.get(Constants.SENDER_KEYCLI));
                    stamper.getAcroFields().setField(Constants.SENDER_NAME,
                            (String) shippingMap.get(Constants.SENDER_NAME));
                    stamper.getAcroFields().setField(Constants.SENDER_ADDRESS,
                            (String) shippingMap.get(Constants.SENDER_ADDRESS));
                    stamper.getAcroFields().setField(
                            Constants.DELIVERYNOTE_SENDER_CITY,
                            (String) shippingMap
                            .get(Constants.DELIVERYNOTE_SENDER_CITY));
                    // PRUEBA
                    stamper.getAcroFields().setField(
                            Constants.SENDER_PHONE,
                            props.getProperty(Constants.SENDER_PHONE)
                            + StringPool.SPACE
                            + (String) shippingMap
                            .get(Constants.SENDER_PHONE));
                }

                // receiver properties
                // depending on whether or not it is a post office box we use
                // the receiver name or the string "Apartado de Correos n�"
                // followed by the number
                String receiverName = "1".compareTo(StringPool.BLANK
                        + shippingMap.get(Constants.POST_OFFICE_BOX)) == 0 ? props
                                .getProperty(Constants.DELIVERYNOTE_POST_OFFICE_BOX)
                                + StringPool.SPACE
                                + shippingMap.get(Constants.POSTAL_MAIL_CP)
                        : (String) shippingMap.get(Constants.RECEIVER_NAME);

                stamper.getAcroFields().setField(Constants.RECEIVER_NAME,
                                        receiverName);
                stamper.getAcroFields().setField(Constants.RECEIVER_ADDRESS,
                        (String) shippingMap.get(Constants.RECEIVER_ADDRESS));
                String aux = (String) shippingMap.get(Constants.RECEIVER_CP);

                // NO SE CONTEMPLA LA ENTREGA EN SÁBADO
                // if
                // (Validator.isNotNull(shippingMap.get(Constants.DELIVERYNOTE_DELIVERYONSATURDAY))
                // && (((String)
                // shippingMap.get(Constants.DELIVERYNOTE_DELIVERYONSATURDAY))
                // .compareTo("0") != 0)) {
                // aux = aux.concat(StringPool.SPACE);
                // aux =
                // aux.concat(props.getProperty(Constants.DELIVERYNOTE_SATURDAYLABEL));
                // }

                stamper.getAcroFields().setField(Constants.RECEIVER_CP, aux);
                stamper.getAcroFields().setField(
                                        Constants.RECEIVER_CITY,
                        (String) shippingMap.get(Constants.RECEIVER_CITY)
                                        + StringPool.SPACE
                                + (String) shippingMap
                                        .get(Constants.RECEIVER_COUNTRY));
                stamper.getAcroFields().setField(Constants.CHX_DESTINATION,
                        (String) shippingMap.get(Constants.CHX_DESTINATION));

                StringBuffer contact = new StringBuffer();
                contact.append(props
                                        .getProperty(Constants.DELIVERYNOTE_RECEIVERLABEL)
                                        + StringPool.SPACE);

                if ("1".compareTo(StringPool.BLANK
                                        + shippingMap.get(Constants.POST_OFFICE_BOX)) != 0) {
                    contact.append(shippingMap.get(Constants.RECEIVER_PHONE)
                                            + StringPool.COMMA + StringPool.SPACE);
                }
                contact.append((String) shippingMap
                                        .get(Constants.RECEIPT_RECEIVER_CONTACT));

                stamper.getAcroFields().setField(
                                        Constants.DELIVERYNOTE_RECEIVERLABEL,
                                        contact.toString());

                // observations
                stamper.getAcroFields()
                                .setField(
                                        Constants.OBSERVATIONS,
                                        props.getProperty(Constants.DELIVERYNOTE_OBSERVATIONSLABEL)
                                        + StringPool.SPACE
                                        + (String) shippingMap
                                        .get(Constants.OBSERVATIONS));

                // second column
                stamper.getAcroFields()
                                .setField(
                                        Constants.OFFICESHIPPINGNUMBER,
                                        props.getProperty(Constants.DELIVERYNOTE_OFFICESHIPPINGNUMBERLABEL)
                                        + StringPool.SPACE
                                        + (String) shippingMap
                                        .get(Constants.OFFICESHIPPINGNUMBER));

                stamper.getAcroFields().setField(
                                        Constants.DELIVERYNOTE_ENVIORETORNO,
                        props.getProperty(Constants.DELIVERYNOTE_ENVIORETORNO));
                stamper.getAcroFields().setField(
                                        Constants.ENVIORETORNO,
                        (String) shippingMap
                                        .get(Constants.DELIVERYNOTE_ENVIORETORNO));

                stamper.getAcroFields().setField(
                                        Constants.DELIVERYNOTE_REFUNDLABEL,
                        props.getProperty(Constants.DELIVERYNOTE_REFUNDLABEL));

                if (Validator.isNotNull((String) shippingMap
                                        .get(Constants.REFUNDVALUE))) {
                    if ((((String) shippingMap.get(Constants.REFUNDVALUE))
                                            .compareTo("0") != 0)
                            && (((String) shippingMap
                                                    .get(Constants.REFUNDVALUE))
                                                    .compareTo("0,0") != 0)) {
                        stamper.getAcroFields()
                                        .setField(
                                                Constants.REFUNDVALUE,
                                                (String) shippingMap
                                                .get(Constants.REFUNDVALUE)
                                                + StringPool.SPACE
                                                + props.getProperty(Constants.DELIVERYNOTE_CURRENCYLABEL));
                    }
                }

                stamper.getAcroFields().setField(
                                        Constants.DELIVERYNOTE_PARCELLABEL,
                        props.getProperty(Constants.DELIVERYNOTE_PARCELLABEL));

//                stamper.getAcroFields().setField(
//                                        Constants.PARCELS,
//                        (parcelCounter + 1) + StringPool.SPACE
//                                        + props.getProperty(Constants.DELIVERYNOTE_DE)
//                                + StringPool.SPACE
//                                        + shippingMap.get(Constants.PARCELS));
                
               stamper.getAcroFields().setField(
                        				Constants.PARCELS,
                        (Constants.CONTADOR_BULTOS) + StringPool.SPACE
                        	+ props.getProperty(Constants.DELIVERYNOTE_DE)
                + StringPool.SPACE
                        + shippingMap.get(Constants.PARCELS));

                stamper.getAcroFields().setField(
                                        Constants.DELIVERYNOTE_DATELABEL,
                        props.getProperty(Constants.DELIVERYNOTE_DATELABEL));
                stamper.getAcroFields().setField(Constants.DATE,
                                        (String) shippingMap.get(Constants.RECORDING_DATE));

                stamper.getAcroFields().setField(
                                        Constants.DELIVERYNOTE_PORTAGELABEL,
                        props.getProperty(Constants.DELIVERYNOTE_PORTAGELABEL));
                stamper.getAcroFields().setField(Constants.PORTAGE,
                                        (String) shippingMap.get(Constants.PORTAGE));

                stamper.getAcroFields().setField(
                                        Constants.DELIVERYNOTE_WEIGHTLABEL,
                        props.getProperty(Constants.DELIVERYNOTE_WEIGHTLABEL));
                stamper.getAcroFields()
                                .setField(
                                        Constants.WEIGHT,
                                        shippingMap.get(Constants.WEIGHT)
                                        + StringPool.SPACE
                                        + props.getProperty(Constants.DELIVERYNOTE_WEIGHTUNITS));

                // OJO, esta plantilla se está usando en oficinas y en grabación
                // privada. EN GRABACIÓN PRIVADA TIENE QUE APARECER LA FECHA Y
                // EN OFICINAS NO
                // por eso el if

                // NO SE CONTEMPLA LA GRABACION PRIVADA
                // if (shippingMap.get(Constants.FECHAENV) != null) {
                // if (!((String)
                // shippingMap.get(Constants.FECHAENV)).equalsIgnoreCase(StringPool.BLANK))
                // {
                // stamper.getAcroFields().setField(Constants.DELIVERYNOTE_FECHAENV,
                // props.getProperty(Constants.DELIVERYNOTE_FECHAENV));
                // stamper.getAcroFields().setField(Constants.FECHAENV,
                // (String) shippingMap.get(Constants.FECHAENV));
                // }
                // }

                // indica si tenemos que tapar el recuadro en el que aparecen
                // Seguro y Entrega en sábado
                boolean hideCellBorder = true;

                /*
                 * insurance is optional if
                 * (Validator.isNotNull(shippingMap.get(Constants.INSURANCEVALUE
                 * ))) { if(((String)shippingMap.get(Constants.INSURANCEVALUE)).
                 * compareTo("0") != 0 &&
                 * ((String)shippingMap.get(Constants.INSURANCEVALUE)).compareTo
                 * ("0,0") != 0){
                 * 
                 * hideCellBorder = false;
                 * 
                 * stamper.getAcroFields().setField(
                 * Constants.DELIVERYNOTE_INSURANCELABEL,
                 * LanguageUtil.get(locale,
                 * Constants.DELIVERYNOTE_INSURANCELABEL));
                 * stamper.getAcroFields() .setField( Constants.INSURANCEVALUE,
                 * (String)shippingMap.get(Constants.INSURANCEVALUE) +
                 * StringPool.SPACE + LanguageUtil .get(locale,
                 * Constants.DELIVERYNOTE_CURRENCYLABEL)); } }
                 */

                // delivery on saturday is optional
                // NO SE CONTEMPLA LA ENTREGA EN SÁBADO
                // if
                // (Validator.isNotNull(shippingMap.get(Constants.DELIVERYNOTE_DELIVERYONSATURDAY))
                // && (((String)
                // shippingMap.get(Constants.DELIVERYNOTE_DELIVERYONSATURDAY))
                // .compareTo("0") != 0)) {
                // hideCellBorder = false;
                //
                // stamper.getAcroFields().setField(Constants.DELIVERYNOTE_DELIVERYONSATURDAYLABEL,
                // props.getProperty(Constants.DELIVERYNOTE_DELIVERYONSATURDAYLABEL));
                // }

                if (hideCellBorder) {
                    // para dibujar el recuadro que tapará los campos/etiquetas
                    // que no se van a visualizar
                    PdfContentByte over = stamper.getOverContent(1);
                    over.setColorFill(Color.WHITE);
                    final String[] values = (props
                                            .getProperty(Constants.DELIVERYNOTE_DELIVERYONSATURDAY))
                            .replaceAll("\\s", "").split(",");
                    // 282,
                    // 175,
                    // 220,
                    // 37
                    over.rectangle(Integer.parseInt(values[0]), /* x */

                            Float.parseFloat(values[1]),
                            // Integer.parseInt(values[1]), /* y */
                            Integer.parseInt(values[2]), /* width */
                            Integer.parseInt(values[3])); /* height */
                    over.fill();
                }

                stamper.getAcroFields()
                                .setField(
                                        Constants.DELIVERYNOTE_REFERENCELABEL,
                                        props.getProperty(Constants.DELIVERYNOTE_REFERENCELABEL));
                stamper.getAcroFields().setField(Constants.REFERENCE,
                                        (String) shippingMap.get(Constants.REFERENCE));

                stamper.getAcroFields()
                                .setField(
                                        Constants.DELIVERYNOTE_PARCELCODELABEL,
                                        props.getProperty(Constants.DELIVERYNOTE_PARCELCODELABEL));
                stamper.getAcroFields().setField(
                                        Constants.DELIVERYNOTE_PARCELCODE, parcelCode);

                stamper.getAcroFields().setField(Constants.PRODUCTNAME,
                        (String) shippingMap.get(Constants.PRODUCTNAME));

                // we get the values to draw the barcode from
                // portal-ext.properties (deliveryNote.horizontalBarCode=10, 10,
                // 1.7, 110, 0)
                // SE HAN REUBICADO EN messages.properties

                String[] values = (props
                                        .getProperty(Constants.DELIVERYNOTE_HORIZONTALBARCODE))
                                        .replaceAll("\\s", "").split(",");

                @SuppressWarnings("unchecked")
                final Barcode128 shipBarcode = PDFCommons.generateBarcode128(
                        ((List<String>) shippingMap
                                                .get(Constants.DELIVERYNOTE_PACKAGES))
                                                .get(parcelCounter), Integer
                                                .parseInt(values[4]/* fontSize */), Float
                                                .parseFloat(values[2]/* barWidth */), Integer
                                                .parseInt(values[3]/* barHeight */));

                // preparing barcode here
                final Image imgShipBarCode = shipBarcode
                                        .createImageWithBarcode(stamper.getOverContent(1),
                                                Color.BLACK, Color.BLACK);
                imgShipBarCode.setAbsolutePosition(
                                        Float.parseFloat(values[0]/* x */),
                        Float.parseFloat(values[1]/* y */));
                stamper.getOverContent(1).addImage(imgShipBarCode);

                // logo
                byte[] img = null;
                try {
                    if (Validator.isNotNull(pathToLogo)) {
                        img = loadLogo(pathToLogo);
                    }
                } catch (Exception e) {
                    if (log.isErrorEnabled()) {
                        log.error(
                                "PDFReceipt.createSticker2Label: Se ha producido un error al construir recuperar el logo: "
                                        + e.getMessage(), e);
                    }
                }

                if (Validator.isNotNull(img)) {

                    values = PropsUtil.getArray(Constants.DELIVERYNOTE_COVER);

                    stamper.getOverContent(1).setColorFill(Color.WHITE);
                    stamper.getOverContent(1).rectangle(
                                            Float.parseFloat(values[0]),
                                            Float.parseFloat(values[1]),
                            Float.parseFloat(values[2]),
                                            Float.parseFloat(values[3]));
                    stamper.getOverContent(1).fill();

                    values = PropsUtil.getArray(Constants.DELIVERYNOTE_LOGO);
                    Image logo = Image.getInstance(img);
                    logo.scaleToFit(Float.parseFloat(values[2]),
                                            Float.parseFloat(values[3]));
                    logo.setAbsolutePosition(
                                            Float.parseFloat(values[0]) - logo.getScaledWidth()
                                            / 2,
                            Float.parseFloat(values[1])
                                            - logo.getScaledHeight() / 2);
                    stamper.getOverContent(1).addImage(logo);
                }

                stamper.close();
                pdfTemplate.close();

            } catch (final DocumentException e) {
                if (log.isErrorEnabled()) {
                    log.error(
                            "Se ha producido un error al construir el PdfStamper: "
                                    + e.getMessage(), e);
                }
            }

        } catch (final IOException e) {
            if (log.isErrorEnabled()) {
                log.error(
                        "Se ha producido un error al construir el PdfReader: "
                                + e.getMessage(), e);
            }
        }
    }

    /*
     * Ahora mismo devuelve ByteArrayOutputStream para poder pasarlo fácilmente
     * a File. Originalmente devolvía OutputStream.
     */
    @SuppressWarnings("unchecked")
    public static ByteArrayOutputStream createDeliveryNotes(
            final HashMap<String, Object> shippingMap, final Locale locale,
            String pathToLogo) throws Exception {
        ByteArrayOutputStream fos = null;
        final List<InputStream> pdfs = new ArrayList<InputStream>();

        int parcelCounter = 0;
        // con el metodo getPackages recuperamos los identificadores de los
        // paquetes que componen el envio

        List<String> packagesIds = (List<String>) shippingMap
                .get(Constants.DELIVERYNOTE_PACKAGES);
        
        

        if (Validator.isNotNull(packagesIds)) {
            for (final String officeShippingNumber : packagesIds) {
                // por cada paquete del envio se generara un albaran
                fos = new ByteArrayOutputStream();
                createDeliveryNote(officeShippingNumber, parcelCounter++,
                        shippingMap, fos, locale, pathToLogo);
                pdfs.add(new ByteArrayInputStream(fos.toByteArray()));
            }
        }

        // limpiamos
        fos.flush();
        fos.close();
        fos = null;

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        concatPDFs(pdfs, baos);
        return baos;
    }

    /**
     * devuelve un InputStream a la plantilla en PDF
     * 
     * @param templateName
     *            nombre de la plantilla (sin extension)
     * @return un InputStream a la plantilla en PDF
     */
    private static InputStream getTemplate(final String templateName) {
        // las plantillas en PDF tienen que ir dentro de la carpeta pdftemplates
        // en el proyecto (al generar el jar acaban en el raiz)
        final String aux = /* File.separator */"/" + templateName + ".pdf";
        return PDFReceipt.class.getResourceAsStream(aux);
    }
}