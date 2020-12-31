package com.upgrad.ublog.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * TODO: 4.13. Implement a method with the following signature.
 *  public static String format(LocalDateTime localDateTime)
 *  This method should convert the default date time to the human readable format[dd-MM-yyyy HH:mm:ss].
 */

public class DateTimeFormatter {
    public static long format(LocalDateTime localDateTime) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy");
        Date d = sdf.parse("Mon May 27 11:46:15 IST 2013");
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        long time = c.getTimeInMillis();
        long curr = System.currentTimeMillis();
        long diff = curr - time;    //Time difference in milliseconds
        return diff/1000;
    }
}
