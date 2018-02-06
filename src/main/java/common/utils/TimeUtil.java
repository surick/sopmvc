package common.utils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取当前时间
 *
 * @author w24164
 * @create 2018-02-06 9:21
 */
public class TimeUtil {
    public static void main(String[] args)
    {
        System.out.println(getYMD()+"       "+getYMDHMS());
        System.out.println(new Date());
    }


    /**
     * @Title: getYMD
     * @Description: 获取当前时间（年-月-日）
     * @return: Date
     */
    public static Date getYMD()
    {
        return new Date();
    }

    /**
     * @Title: getYMDHMS
     * @Description: 获取当前时间（年-月-日 时:分:秒）
     * @return
     * @return: Date
     */
    public static Date getYMDHMS()
    {
        SimpleDateFormat sdf = getTimeFormat("yyyy-MM-dd HH:mm:ss");

        return sdf.parse(sdf.format(new Date(System.currentTimeMillis())),
                new ParsePosition(0));
    }

    /**
     * @Title: getTimeFormat
     * @Description: 获取时间格式
     * @param format
     * @return: SimpleDateFormat
     */
    private static SimpleDateFormat getTimeFormat(String format)
    {
        return new SimpleDateFormat(format);
    }
}
