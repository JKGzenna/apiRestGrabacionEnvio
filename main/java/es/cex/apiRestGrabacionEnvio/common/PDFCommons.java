package es.cex.apiRestGrabacionEnvio.common;

import java.awt.Color;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

//import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.Barcode128;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;



/**
 * Clase de utilidad para las pdf.
 * 
 */
public class PDFCommons {

    private static Log log = LogFactoryUtil.getLog(PDFCommons.class);

    /**
     * Genera codigo de barras en formato 128
     * 
     * @param code
     *            codigo numerico a convertir en codigo de barras
     * @param fontSize
     *            tamano del texto
     * @param barWidth
     *            anchura de las barras
     * @param barHeight
     *            altura de las barras
     * @return codigo de barras en formato 128
     */
    public static Barcode128 generateBarcode128(final String code, final int fontSize, final float barWidth,
            final int barHeight) {

        final Barcode128 bc = new Barcode128();
        // Sets the size of the text
        if (fontSize > 0) {
            bc.setSize(fontSize);
        } else {
            // if the fontSize parameter is set to zero then suppress any text
            bc.setFont(null);
        }

        // Sets the bar multiplier for wide bars
        bc.setN(1);
        // Sets the minimum bar width
        bc.setX(barWidth);
        bc.setBarHeight(barHeight);
        bc.setCode(code);
        bc.setAltText(code);

        return bc;
    }

    /**
     * @param r
     *            int
     * @param g
     *            int
     * @param b
     *            int
     * @return Color
     */
    public static Color getColor(final int r, final int g, final int b) {

        return new Color(r, g, b);

    }

    /**
     * Obtiene el fichero pdf
     * 
     * @param response
     *            ResourceResponse
     * @param fileName
     *            String
     * @param pdf
     *            ByteArrayOutputStream
     * @return OutputStream
     * @throws IOException
     */
//    public static OutputStream getFile(final ResourceResponse response, final String fileName,
//            final ByteArrayOutputStream pdf) throws IOException {
//        ExportUtil.setResponseProperties(response, fileName, Constants.EXPORT_PDF_TYPE);
//        final OutputStream out = response.getPortletOutputStream();
//        pdf.writeTo(out);
//        return out;
//
//    }

    /**
     * @return Font
     */
    public static Font getFont(final int fontType, final int fontSize, final int fontDecoration,
            final Color fontColor) {

        return new Font(fontType, fontSize, fontDecoration, fontColor);

    }

    /**
     * @param header
     *            String
     * @param locale
     *            Locale
     * @param headerFont
     *            Font
     * @param phrase
     *            Phrase
     * @return HeaderFooter
     */
    private static HeaderFooter getHeaderCell(final String header, final Locale locale, final Font headerFont,
            final Phrase phrase) {

        final HeaderFooter headerRow = new HeaderFooter(phrase, false);

        headerRow.setBorder(Rectangle.BOTTOM);
        headerRow.setBorderColor(headerFont.getColor());
        headerRow.setAlignment(Element.ALIGN_LEFT);

        return headerRow;

    }

    /**
     * @param header
     *            String
     * @param locale
     *            Locale
     * @param headerFont
     *            Font
     * @param chunk
     *            Chunk
     * @param typeDetail
     *            boolean
     * @return Phrase
     */
    public static Phrase getHeaderPhrase(final String header, final Locale locale, final Font headerFont,
            final Chunk chunk, final String typeDetail) {

        final Phrase phrase = new Phrase(chunk);

        phrase.add(new Phrase(
                StringPool.TAB.concat(ExportUtil.getHeaderText(locale, header, Constants.EXPORT_PDF_TYPE, typeDetail)),
                headerFont));

        return phrase;

    }

    /**
     * Obtiene el logo
     * 
     * @param pathThemeImage
     *            String
     * @return Image
     * @throws Exception
     */
    public static Image getImageLogo(final String pathThemeImage) throws Exception {

        final URL urlLogo = new URL(pathThemeImage.concat(Constants.EXPORT_PDF_HEARDER_IMG));

        final Image logo = Image.getInstance(urlLogo.toString());

        logo.setAlignment(Image.LEFT);
        logo.scalePercent(25);

        return logo;

    }

    /**
     * Obtiene el fichero pdf
     * 
     * @param response
     *            ResourceResponse
     * @param fileName
     *            String
     * @param pdf
     *            ByteArrayOutputStream
     * @return OutputStream
     * @throws IOException
     */
//    public static OutputStream getInlineFile(final ResourceResponse response, final String fileName,
//            final ByteArrayOutputStream pdf) throws IOException {
//        ExportUtil.setInlineResponseProperties(response, fileName, Constants.EXPORT_PDF_TYPE);
//        response.setContentLength(pdf.size());
//        final OutputStream out = response.getPortletOutputStream();
//        pdf.writeTo(out);
//        return out;
//
//    }

    /**
     * @param size
     *            int
     * @param verticalAlingment
     *            int
     * @param horizontalAlingment
     *            int
     * @return PdfPTable
     */
    public static PdfPTable getTable(final int size, final int verticalAlingment) {
        final PdfPTable content = new PdfPTable(size);
        content.setWidthPercentage(Constants.EXPORT_PDF_DEFAULT_SIZE);
        content.getDefaultCell().setVerticalAlignment(verticalAlingment);
        return content;
    }

    /**
     * @param locale
     *            Locale
     * @param pdf
     *            Document
     * @param header
     *            String
     * @param headerFont
     *            Font
     * @param footerFont
     *            Font
     * @param borderColor
     *            Color
     * @param pathThemeImage
     *            String
     * @param typeDetail
     *            String
     * @throws Exception
     */
    public static void setHeaderAndFooter(final Locale locale, final Document pdf, final String header,
            final Font headerFont, final Font footerFont, final Color borderColor, final String pathThemeImage,
            final String typeDetail) throws Exception {

        pdf.setHeader(writeHeader(pdf, header, locale, headerFont, borderColor, pathThemeImage, typeDetail));
        pdf.setFooter(writeFooter(pdf, footerFont, borderColor, locale));

    }

    /**
     * Mismo metodo que el anterior pero con la posibilidad de escribir un
     * mensaje al final del listado
     * 
     * @param locale
     * @param pdf
     * @param header
     * @param headerFont
     * @param footerFont
     * @param borderColor
     * @param pathThemeImage
     * @param typeDetail
     * @param messageFooter
     * @param messageFooterFont
     * @throws Exception
     */
    public static void setHeaderAndFooter(final Locale locale, final Document pdf, final String header,
            final Font headerFont, final Font footerFont, final Color borderColor, final String pathThemeImage,
            final String typeDetail, final String messageFooter, final Font messageFooterFont) throws Exception {

        pdf.setHeader(writeHeader(pdf, header, locale, headerFont, borderColor, pathThemeImage, typeDetail));
        pdf.setFooter(writeMessageFooter(pdf, messageFooterFont, messageFooter));
        // pdf.setFooter(writeFooter(pdf, footerFont, borderColor, locale));

    }

    /**
     * Metodo privado que pinta cada celda de los parametros de busqueda
     * 
     * @param data
     *            Dato a pintar
     * 
     * @param contentFont
     *            Fuente
     * 
     * @param colspan
     *            colspan
     * 
     * @return la celda con su formato y los datos
     */
    private static PdfPCell writeCellSearch(final String data, final Font contentFont, final int colspan) {

        final PdfPCell cell = new PdfPCell();

        final Paragraph paragraph = new Paragraph(data, contentFont);
        paragraph.setAlignment(Element.ALIGN_LEFT);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setColspan(colspan);
        cell.setMinimumHeight(Element.ANCHOR);
        cell.setFixedHeight(Element.ANCHOR);
        cell.addElement(paragraph);
        cell.setBorder(Rectangle.NO_BORDER);

        return cell;
    }

    /**
     * Escribe una celda
     * 
     * @param data
     *            PdfPTable
     * @param font
     *            Font
     * @param color
     *            Color
     * @param horizontalAlingment
     *            int
     * @param colspan
     *            int
     * @param padding
     *            float
     * @return PdfPCell
     */
    public static PdfPCell writeContent(final PdfPTable data, final Font font, final Color color,
            final int horizontalAlingment, final int colspan, final float padding) {

        return writePCell(data, font, color, horizontalAlingment, colspan, padding);

    }

    /**
     * Escribe una celda
     * 
     * @param data
     *            String
     * @param font
     *            Font
     * @param color
     *            Color
     * @param horizontalAlingment
     *            int
     * @param colspan
     *            int
     * @param minHeight
     *            float
     * @return PdfPCell
     */
    public static PdfPCell writeContent(final String data, final Font font, final Color color,
            final int horizontalAlingment, final int colspan, final float minHeight, final boolean isList) {

        return writePCell(data, font, color, horizontalAlingment, colspan, minHeight, isList);

    }

    /**
     * @param content
     *            PdfPTable
     * @param locale
     *            Locale
     * @param dataExport
     *            HashMap<Integer, HashMap<Integer, List<String>>>
     * @param contentColor
     *            Font
     * @param contentFont
     *            Color
     * @param index
     *            Integer
     */
    public static void writeContents(final PdfPTable content, final Locale locale,
            final HashMap<Integer, HashMap<Integer, List<String>>> dataExport, final Font contentFont,
            final Color contentColor, final int index, final boolean isList) {

        final HashMap<Integer, List<String>> data = dataExport.get(index);
        final int row = 0;

        for (int i = 0; i < data.keySet().size(); i++) {

            final List<String> resultRow = data.get(i);

            for (final String resul : resultRow) {
                content.addCell(writeRow(contentFont, contentColor, row, resul, Constants.EXPORT_PDF_DEFAULT_COLSPAN,
                        Element.ANCHOR, isList));
            }
        }
    }

    /**
     * @param document
     *            Document
     * @param footerFont
     *            Font
     * @param borderColor
     *            Color
     * @param locale
     *            Locale
     * 
     * @throws Exception
     */
    public static HeaderFooter writeFooter(final Document document, final Font footerFont, final Color borderColor,
            final Locale locale) throws Exception {

        final HeaderFooter footer = new HeaderFooter(new Paragraph(
                LanguageUtil.get(locale, Constants.EXPORT_PDF_FOOTER).concat(StringPool.SPACE), footerFont), true);
        footer.setBorder(Rectangle.TOP);
        footer.setBorderColor(borderColor);
        footer.setAlignment(Element.ALIGN_CENTER);

        return footer;

    }

    public static HeaderFooter writeMessageFooter(final Document document, final Font footerFont,
            final String messageFooter) throws Exception {

        final HeaderFooter footer = new HeaderFooter(new Paragraph(messageFooter, footerFont), true);
        footer.setBorder(Rectangle.BOTTOM);
        footer.setAlignment(Element.ALIGN_CENTER);

        return footer;

    }

    /**
     * @param document
     *            Document
     * @param header
     *            String
     * @param locale
     *            Locale
     * @param headerFont
     *            Font
     * @param borderColor
     *            Color
     * @param pathThemeImage
     *            String
     * @param typeDetail
     *            boolean
     * @throws Exception
     */
    public static HeaderFooter writeHeader(final Document document, final String header, final Locale locale,
            final Font headerFont, final Color borderColor, final String pathThemeImage, final String typeDetail)
            throws Exception {

        final Chunk chunk = new Chunk(getImageLogo(pathThemeImage), 0, -10);
        final Phrase phrase = getHeaderPhrase(header, locale, headerFont, chunk, typeDetail);

        return getHeaderCell(header, locale, headerFont, phrase);

    }

    /**
     * Escribe una fila de la cabecera
     * 
     * @param data
     *            String
     * 
     * @param headerFont
     *            Font
     * @param headerColor
     *            Color
     * @param horizontalAlingment
     *            int
     * @param colspan
     *            int
     * @param minHeight
     *            float
     * @return PdfPCell
     */
    public static PdfPCell writeHeaderCell(final String data, final Font font, final Color color,
            final int horizontalAlingment, final int colspan, final float minHeight) {

        return writePCell(data, font, color, horizontalAlingment, colspan, minHeight, false);

    }

    /**
     * Escribe la cabecera
     * 
     * @param content
     *            PdfPTable
     * 
     * @param locale
     *            Locale
     * @param headerColumns
     *            List<String>
     * @param headerFont
     *            Font
     * @param headerColor
     *            Color
     * @param keyPattern
     *            String
     */
    public static void writeHeaders(final PdfPTable content, final Locale locale, final List<String> headerColumns,
            final Font headerFont, final Color headerColor, final String keyPattern) {

        try {
            for (final String headerColum : headerColumns) {
                content.addCell(PDFCommons.writeHeaderCell(LanguageUtil.get(locale, keyPattern.concat(headerColum)),
                        headerFont, headerColor, Element.ALIGN_CENTER, Constants.EXPORT_PDF_DEFAULT_COLSPAN,
                        Element.ANCHOR));
            }
        } catch (final Exception e) {
            if (log.isErrorEnabled()) {
                log.error("Se ha producido un error al obtener el header de fichero: " + e.getMessage());
            }
        }

    }

    /**
     * Escribe una celda
     * 
     * @param data
     *            PdfPTable
     * @param font
     *            Font
     * 
     * @param background
     *            Color
     * @param horizontalAlingment
     *            int
     * @param colspan
     *            int
     * @param padding
     *            float
     * @return PdfPCell
     * 
     */
    private static PdfPCell writePCell(final PdfPTable data, final Font font, final Color background,
            final Integer horizontalAlingment, final int colspan, final float padding) {

        final PdfPCell cell = new PdfPCell();
        if (Validator.isNotNull(background)) {
            cell.setBackgroundColor(background);
        }
        if (Validator.isNotNull(horizontalAlingment)) {
            cell.setHorizontalAlignment(horizontalAlingment);
        }
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setColspan(colspan);
        cell.setPadding(padding);
        cell.addElement(data);

        return cell;

    }

    /**
     * Escribe una celda
     * 
     * @param data
     *            String
     * @param font
     *            Font
     * 
     * @param background
     *            Color
     * @param horizontalAlingment
     *            int
     * @param colspan
     *            int
     * @param minHeight
     *            int
     * @return PdfPCell
     * 
     */
    private static PdfPCell writePCell(final String data, final Font font, final Color background,
            final int horizontalAlingment, final int colspan, final float minHeight, final boolean isList) {

        final PdfPCell cell = new PdfPCell();

        final Paragraph paragraph = new Paragraph(data, font);
        paragraph.setAlignment(horizontalAlingment);
        if (Validator.isNotNull(background)) {
            cell.setBackgroundColor(background);
        }

        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setColspan(colspan);
        cell.setMinimumHeight(Constants.CELL_HEIGHT);
        if (!isList) {
            cell.setFixedHeight(Constants.CELL_HEIGHT);
        }
        cell.addElement(paragraph);

        return cell;

    }

    /**
     * @param contentFont
     *            Font
     * @param contentColor
     *            Color
     * @param row
     *            int
     * @param data
     *            String
     * @param colspan
     *            int
     * @param fixedHeight
     *            float
     * @return PdfPCell
     */
    private static PdfPCell writeRow(final Font contentFont, final Color contentColor, final int row, final String data,
            final int colspan, final float minHeight, final boolean isList) {

        if ((row % 2) != 0) {
            return PDFCommons.writeContent(data, contentFont, contentColor, Element.ALIGN_LEFT, colspan, minHeight,
                    isList);
        } else {
            return PDFCommons.writeContent(data, contentFont, null, Element.ALIGN_LEFT, colspan, minHeight, isList);
        }

    }

    /**
     * Metodo que pinta los parametros de busqueda en el pdf
     * 
     * @param contentSearch
     *            Tabla que pintara los parametros de busqueda
     * 
     * @param searchData
     *            Contiene los parametros de busqueda
     * 
     * @param contentFont
     *            Fuente de las celdas
     * 
     * @param contentColor
     *            Color de las celdas
     * 
     * @throws DocumentException
     */
    public static void writeSearchData(final PdfPTable contentSearch, final HashMap<Integer, List<String>> searchData,
            final Font contentFont, final Color contentColor) throws DocumentException {

        for (final String resul : searchData.get(0)) {

            contentSearch.addCell(writeCellSearch(resul, contentFont, Constants.EXPORT_PDF_DEFAULT_COLSPAN));
        }
        contentSearch.addCell(writeCellSearch("", contentFont, 5));

    }

}
