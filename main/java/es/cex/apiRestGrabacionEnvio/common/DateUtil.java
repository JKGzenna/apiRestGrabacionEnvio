package es.cex.apiRestGrabacionEnvio.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

/**
 * Clase de utilidad para los date.
 * 
 */
public class DateUtil {

	/**
	 * @param date
	 *            Date
	 * @param format
	 *            String
	 * @param locale
	 *            Locale
	 * @return String
	 */
	public static String formatDate(final Date date, final String format,
			final Locale locale) {

		if (Validator.isNotNull(format)) {
			SimpleDateFormat dateFormat = null;
			if (Validator.isNotNull(locale)) {
				dateFormat = new SimpleDateFormat(format, new Locale(
						locale.toString()));
			} else {
				dateFormat = new SimpleDateFormat(format);
			}

			return dateFormat.format(date);
		}

		return StringPool.BLANK;
	}
}