package cn.vincent.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommonUtils {
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    public static SimpleDateFormat theDateSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static long beginTime1;
    public static long endTime1;
    public static long beginTime2;
    public static long endTime2;

    public static long calcMaxDuration(){
        long beginTime = beginTime1;
        if(beginTime2 < beginTime1){
            beginTime = beginTime2;
        }
        long endTime = endTime1;
        if(endTime2 > endTime1){
            endTime = endTime2;
        }
        return  (endTime - beginTime)/1000;
    }
    public static String getCurDateTime(){
        return sdf.format(new Date(Long.parseLong(String.valueOf(System.currentTimeMillis()))));
    }

    public static Date getTheDate(String theDateString) {
        Date result = null;
        try {
            result = theDateSdf.parse(theDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 从当前时间往前推几秒
     * @param sec
     * @return
     */
    public static Date getPastTime(int sec) {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.SECOND,instance.get(Calendar.SECOND)-10);
        return instance.getTime();
    }
}
