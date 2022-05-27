package com.uqingu.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String fmt(Date date) {
        String strDateFormat = "yyyy年MM月dd日 HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        return sdf.format(date);
    }
}
