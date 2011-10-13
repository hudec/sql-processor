package org.sqlproc.engine.impl;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;

import org.junit.Ignore;

@Ignore("Not test class.")
public class TestUtils {

    public static Locale LOCALE_CS = new Locale("cs");

    public static Date parse(final Object value) {
        return parse(value, Locale.getDefault());
    }

    public static Date parse(final Object value, Locale locale) {
        DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        final ParsePosition position = new ParsePosition(0);
        final String stringValue = value.toString();
        final Date result = (Date) format.parseObject(stringValue, position);
        if (position.getIndex() != stringValue.length()) {
            throw new RuntimeException("Cannot parse '" + value + "' using format " + format);
        }
        return result;
    }

    public static String convertToString(final Object value) {
        return convertToString(value, Locale.getDefault());
    }

    public static String convertToString(final Object value, Locale locale) {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        if (dateFormat != null) {
            return dateFormat.format(value);
        }
        return value.toString();
    }

    public static boolean isBlank(String s) {
        if (s == null)
            return true;
        if (s.trim().length() == 0)
            return true;
        return false;
    }
}
