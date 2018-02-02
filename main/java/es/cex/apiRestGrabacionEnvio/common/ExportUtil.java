package es.cex.apiRestGrabacionEnvio.common;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

//import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.servlet.HttpHeaders;
//import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;



/**
 * Clase de utilidad para el theme.
 * 
 */
public class ExportUtil {

    /**
     * @param typeExport
     *            String
     * @param index
     *            int
     * @param typeDetailIndex
     *            int
     * @return List<String>
     * @throws Exception
     */
    public static List<String> getDetailHeadersRows(final String typeExport, final int index, final int typeDetailIndex)
            throws Exception {
        if (typeExport.trim().toUpperCase().equalsIgnoreCase(Constants.EXPORT_PDF_TYPE)) {
            return Arrays
                    .asList(Arrays
                            .asList(Arrays.asList(PropsUtil.getArray(Constants.EXPORT_PDF_DETAIL_SHEETS_HEADER))
                                    .get(index).split(Pattern.quote(StringPool.PERIOD)))
                            .get(typeDetailIndex).split(StringPool.DASH));
        } else {
            return Arrays
                    .asList(Arrays
                            .asList(Arrays.asList(PropsUtil.getArray(Constants.EXPORT_XLS_DETAIL_SHEETS_HEADER))
                                    .get(index).split(Pattern.quote(StringPool.PERIOD)))
                            .get(typeDetailIndex).split(StringPool.DASH));

        }
    }

    /**
     * @param index
     *            int
     * @param typeExport
     *            String
     * @return String
     * @throws Exception
     */
    public static String getHeader(final int index, final String typeExport) throws Exception {
        String list = StringPool.BLANK;

        if (typeExport.trim().toUpperCase().equalsIgnoreCase(Constants.EXPORT_PDF_TYPE)) {
            list = Constants.EXPORT_PDF_LIST;
        } else {
            list = Constants.EXPORT_XLS_LIST;
        }

        return Arrays.asList(PropsUtil.getArray(list)).get(index);
    }

    /**
     * @param index
     *            int
     * @param typeExport
     *            String
     * @return String
     * @throws Exception
     */
    public static String getHeaderColumns(final int index, final String typeExport) throws Exception {

        String listHeader = Constants.EXPORT_XLS_LIST_HEADER;

        if (typeExport.trim().toUpperCase().equalsIgnoreCase(Constants.EXPORT_PDF_TYPE)) {
            listHeader = Constants.EXPORT_PDF_LIST_HEADER;
        }

        return Arrays.asList(PropsUtil.getArray(listHeader)).get(index);
    }

    /**
     * @param locale
     *            Locale
     * @param header
     *            String
     * @param typeExport
     *            String
     * @param typeDetail
     *            boolean
     * @return String
     */
    public static String getHeaderText(final Locale locale, final String header, final String typeExport,
            final String typeDetail) {

        if (Validator.isNull(typeDetail) || typeDetail.equalsIgnoreCase(StringPool.BLANK)) {
            return getHeaderTextList(locale, header, typeExport);
        } else {
            return getHeaderTextDetail(locale, typeDetail, typeExport);
        }
    }

    /**
     * @param locale
     *            Locale
     * @param typeDetail
     *            String
     * @param typeExport
     *            String
     * @return String
     */
    private static String getHeaderTextDetail(final Locale locale, final String typeDetail, final String typeExport) {

        if (typeExport.trim().toUpperCase().equalsIgnoreCase(Constants.EXPORT_PDF_TYPE)) {

            return LanguageUtil
                    .format(locale,
                            LanguageUtil
                                    .get(locale,
                                            Constants.EXPORT_PDF_DETAIL_HEARDER_TEXT),
                            new String[] {
                                    LanguageUtil.get(locale,
                                            Constants.EXPORT_PDF_DETAIL_HEADER_KEY_PREFIX.concat(typeDetail)),
                                    DateUtil.formatDate(new Date(), Constants.EXPORT_PDF_LONG_DATE_FORMAT, locale) });
        } else {
            return LanguageUtil.format(locale, LanguageUtil.get(locale, Constants.EXPORT_XLS_DETAIL_HEARDER_TEXT),
                    DateUtil.formatDate(new Date(), Constants.EXPORT_XLS_LONG_DATE_FORMAT, locale));
        }

    }

    /**
     * @param locale
     *            Locale
     * @param header
     *            String
     * @param typeExport
     *            String
     * @return String
     */
    private static String getHeaderTextList(final Locale locale, final String header, final String typeExport) {
        String headerFormat = StringPool.BLANK;
        String dateFormat = StringPool.BLANK;

        if (typeExport.trim().toUpperCase().equalsIgnoreCase(Constants.EXPORT_PDF_TYPE)) {
            headerFormat = Constants.EXPORT_PDF_HEARDER_TEXT;
            dateFormat = Constants.EXPORT_PDF_LONG_DATE_FORMAT;
        } else {
            headerFormat = Constants.EXPORT_XLS_HEARDER_TEXT;
            dateFormat = Constants.EXPORT_XLS_LONG_DATE_FORMAT;
        }

        return LanguageUtil.format(locale, headerFormat, header).concat(StringPool.SPACE).concat(StringPool.DASH)
                .concat(StringPool.SPACE).concat(LanguageUtil.format(locale, Constants.EXPORT_XLS_HEARDER_DATE,
                        DateUtil.formatDate(new Date(), dateFormat, locale)));
    }

    /**
     * @param exportListDetail
     *            String
     * @param typeDetail
     *            String
     * @param index
     *            int
     * @return int
     * @throws Exception
     */
    public static int getIndexList(final String exportListDetail, final String typeDetail, final int index)
            throws Exception {
        return (Arrays.asList(
                Arrays.asList(PropsUtil.getArray(exportListDetail)).get(index).split(Pattern.quote(StringPool.PERIOD))))
                        .indexOf(typeDetail);

    }

    /**
     * @param listPortlet
     * @return int
     * @throws Exception
     */
    public static int getIndexPortletList(final String listPortlet) throws Exception {
        final List<String> list = getListPortletName();
        return list.indexOf(listPortlet);
    }

    /**
     * @return List<String>
     * @throws Exception
     */
    private static List<String> getListPortletName() throws Exception {
        return Arrays.asList(PropsUtil.getArray(Constants.EXPORT_PORTLET_NAME));
    }

    /**
     * @param exportListDetail
     *            String
     * @param index
     *            int
     * @param typeDetailIndex
     *            int
     * @return List<String>
     * @throws Exception
     */
    public static List<String> getNames(final String exportListDetail, final int index, final int typeDetailIndex,
            final String separator) throws Exception {

        return Arrays.asList(Arrays.asList((Arrays.asList(PropsUtil.getArray(exportListDetail)).get(index))
                .split(Pattern.quote(StringPool.PERIOD))).get(typeDetailIndex).split(separator));
    }

    /**
     * @param exportListDetail
     *            String
     * @param index
     *            int
     * @param typeDetailIndex
     *            int
     * @return List<String>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public static List<List<String>> getNamesList(final String exportListDetail, final int index,
            final int typeDetailIndex, final String separator) throws Exception {
        return Arrays.asList(ExportUtil.getNames(exportListDetail, index, typeDetailIndex, separator));
    }

    /**
     * @param headerColumns
     *            String
     * @return List<String>
     */
    public static List<String> getRowHeaderColumns(final String headerColumns) {
        return Arrays.asList(headerColumns.split(StringPool.DASH));
    }

    /**
     * @param rowHeaders
     *            List<String>
     * @return Boolean
     */
    public static Boolean isDetailRowHeadersEmpty(final List<String> rowHeaders) {

        return (rowHeaders.contains(Constants.EXPORT_NONE) ? true : false);

    }

    /**
     * @param rowHeaders
     *            List<String>
     * @return Boolean
     */
    public static boolean isRowsHeader(final List<String> rowHeaders) {
        return (!rowHeaders.isEmpty() && !ExportUtil.isDetailRowHeadersEmpty(rowHeaders));
    }

    /**
     * 
     * @param response
     *            ResourceResponse
     * @param fileName
     *            String
     * @param typeExport
     *            String
     */
//    public static void setInlineResponseProperties(final ResourceResponse response, final String fileName,
//            final String typeExport) throws IOException {
//
//        String exportAttarchment = StringPool.BLANK;
//        String contentType = StringPool.BLANK;
//
//        if (typeExport.trim().toUpperCase().equalsIgnoreCase(Constants.EXPORT_PDF_TYPE)) {
//            exportAttarchment = Constants.EXPORT_PDF_ATTACHMENT_INLINE + StringPool.SEMICOLON;
//            contentType = Constants.EXPORT_PDF_CONTENT_TYPE;
//        } else {
//            exportAttarchment = Constants.EXPORT_XLS_ATTACHMENT + StringPool.SEMICOLON + Constants.EXPORT_XLS_FILENAME;
//            contentType = Constants.EXPORT_XLS_CONTENT_TYPE;
//        }
//
//        response.setProperty(HttpHeaders.CONTENT_DISPOSITION,
//                exportAttarchment + StringPool.EQUAL + StringPool.QUOTE + fileName + StringPool.QUOTE);
//        response.setContentType(contentType);
//        response.setProperty(HttpHeaders.CACHE_CONTROL, HttpHeaders.CACHE_CONTROL_PUBLIC_VALUE);
//        response.setProperty(HttpHeaders.PRAGMA, HttpHeaders.PRAGMA_PUBLIC_VALUE);
//    }
//
//    /**
//     * 
//     * @param response
//     *            ResourceResponse
//     * @param fileName
//     *            String
//     * @param typeExport
//     *            String
//     */
//    public static void setResponseProperties(final ResourceResponse response, final String fileName,
//            final String typeExport) throws IOException {
//
//        String exportAttarchment = StringPool.BLANK;
//        String contentType = StringPool.BLANK;
//
//        if (typeExport.trim().toUpperCase().equalsIgnoreCase(Constants.EXPORT_PDF_TYPE)) {
//            exportAttarchment = Constants.EXPORT_PDF_ATTACHMENT + StringPool.SEMICOLON + Constants.EXPORT_PDF_FILENAME;
//            contentType = Constants.EXPORT_PDF_CONTENT_TYPE;
//        } else {
//            exportAttarchment = Constants.EXPORT_XLS_ATTACHMENT + StringPool.SEMICOLON + Constants.EXPORT_XLS_FILENAME;
//            contentType = Constants.EXPORT_XLS_CONTENT_TYPE;
//        }
//
//        response.setProperty(HttpHeaders.CONTENT_DISPOSITION,
//                exportAttarchment + StringPool.EQUAL + StringPool.QUOTE + fileName + StringPool.QUOTE);
//        response.setContentType(contentType);
//        response.setProperty(HttpHeaders.CACHE_CONTROL, HttpHeaders.CACHE_CONTROL_PUBLIC_VALUE);
//        response.setProperty(HttpHeaders.PRAGMA, HttpHeaders.PRAGMA_PUBLIC_VALUE);
//    }
}