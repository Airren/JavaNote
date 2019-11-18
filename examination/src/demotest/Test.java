package demotest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        Date nowTime = df.parse(df.format(new Date()));
        Date startTime = df.parse("17:00:00");
        Date endTime = df.parse("18:00:00");
        System.out.println(isEffectiveDate(nowTime, startTime, endTime));
    }

    private static boolean isEffectiveDate(Date now, Date start, Date end) {
        long nowTime = now.getTime();
        long startTime = start.getTime();
        long endTime = end.getTime();

        return nowTime >= startTime && nowTime <= endTime;
    }
}