package DateTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class DateTestMain {
    public static void main(String[] args) throws ParseException {
//        Calendar cal = Calendar.getInstance();
//        cal.add(Calendar.DATE, 0);
//        System.out.println(cal.getTime());
//
//        System.out.println(LocalDate.now());
//        System.out.println("2020-02-28".equals(LocalDate.now().toString()));
//        Date time = new Date();
//        System.out.println(time.toString());
////        Date twoMinAgo = new Date();
//        Calendar cal1 = Calendar.getInstance();
//        Calendar cal2 = Calendar.getInstance();
//        cal2.add(Calendar.DATE, 1);
////        System.out.println(cal1.getTime());
////        System.out.println(cal2.getTime());
////        String timeStamp = cal2.getTime().toString();
//        System.out.println(cal2.getTime().toString());
//        System.out.println(cal1.compareTo(cal2) > 0);
//
//        System.out.println(TimeUnit.valueOf("MILLISECONDS"));
//        System.out.println(TimeUnit.valueOf("MILLISECONDS") instanceof TimeUnit);
//        System.out.println(Enum.valueOf(TimeUnit.class, "MILLISECONDS"));
//        System.out.println(Integer.valueOf(Calendar.MINUTE));
//        System.out.println(Calendar.MINUTE);

//
////        System.out.println(Instant.parse(timeStamp));
//        DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
//        Date date = formatter.parse(timeStamp);
//        Calendar cal3 = Calendar.getInstance();
//        cal3.setTime(date);
//        System.out.println(cal3.getTime());


        Date lastTaskDat = new Date();
        String lastTimeStamp = getStringFromDate(lastTaskDat);
//

//        Date today = new Date();
//        String lastTaskTime = getStringFromDate(today);
////        String lastTaskTime = "Thu Mar 05 00:00:00 PST 2020";
//        System.out.println(lastTaskTime);
//        System.out.println(getDateFromString(lastTaskTime));

        Date taskDate = new Date();
        String timestamp = getStringFromDate(taskDate);
        Date lastTaskDate = getDateFromString(lastTimeStamp);
        if ((taskDate.compareTo(addDate(lastTaskDate, Calendar.MINUTE,
                5))) > 0) {
            System.out.println(taskDate.toString());
            System.out.println(lastTaskDate.toString());
        } else {
            System.out.println("Task has been exeed");
        }

    }
    public static Date addDate(Date date, int field, int amount) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(field, amount);
        return calendar.getTime();
    }
    private static final DateTimeFormatter isoFormat = ISODateTimeFormat.dateTimeNoMillis().withZone(DateTimeZone.UTC);

    private static final DateTimeFormatter isoFormatMillis = ISODateTimeFormat.dateTime().withZone(DateTimeZone.UTC);

    public static String getStringFromDate(final Date date) {
        if (date == null) {
            return "null";
        }
        return isoFormat.print(date.getTime());
    }

    public static Date getDateFromString(final String dateString) {
        Date ret = null;
        try {
            if ((dateString) != null) {
                //Parsing date with No milliseconds.
                final DateTime dt = isoFormat.parseDateTime(dateString);
                ret = dt.toDate();
            }
        } catch (final Exception e) {

            try {
                // Parsing dates with milliseconds
                final DateTime dt = isoFormatMillis.parseDateTime(dateString);
                ret = dt.toDate();
            } catch (final Exception e1) {
                // Parsing dates with format: "yyyy-MM-dd'T'HH:mm:ss'Z'"
                final TimeZone tz = TimeZone.getTimeZone("UTC");
                final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                format.setTimeZone(tz);
                try {
                    ret = format.parse(dateString);
                } catch (final Throwable th) {
                    throw new RuntimeException("Cannot parse", th);
                }
            }
        }
        return ret;
    }
}
