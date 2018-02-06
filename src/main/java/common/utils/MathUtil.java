package common.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;

/**
 * 数字工具
 *
 * @author w24164
 * @create 2018-02-06 9:18
 */
public class MathUtil {
    /**
     *
     * @Title: getMd5
     * @Description: 加密封装字符串
     * @param str
     * @return: String(32bit)
     */
    public static String getMd5(String str)
    {
        return StringUtils.isBlank(str) ? null : DigestUtils.md5Hex(str.trim()+"2@&%/*Wd");
    }

    /**
     *
     * @Title: getCharMd5
     * @Description: 加密封装字符串
     * @param str
     * @return: char[]
     */
    public static char[] getCharMd5(String str)
    {
        return StringUtils.isBlank(str) ? null : DigestUtils.md5Hex(str.trim()+"2@&%/*Wd").toCharArray();
    }

}
