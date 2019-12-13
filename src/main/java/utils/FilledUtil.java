package utils;

import java.nio.charset.StandardCharsets;

/**
 * FilledUtil
 *
 * @author ：hxing
 * @date ：Created in 2019/10/17 19:23
 * @description：填充占位符工具类
 */
public class FilledUtil {


    /**
     *
     *  右对齐，首位有效数字前填充零
     *
     * @param intg 原整型数字
     * @param length 总长度
     */

    public static String fillZeroAtLeft(long intg, int length){
        return fillString(String.valueOf(intg),'0',length,false);
    }

    /**
     *
     *  在原串左边填充字符空格
     *
     * @param str 原字符串
     * @param length 总长度
     */

    public static String fillBlankAtLeft(String str, int length){
        return fillString(str,' ',length,false);
    }

    /**
     *
     *  在原串右边边填充字符空格
     *
     * @param str 原字符串
     * @param length 总长度
     */

    public static String fillBlankAtRight(String str, int length){
        if (null == str){
            str="";
        }
        return fillString(str,' ',length,true);
    }


    /**
     *
     *  在原串右边边填充字符空格（中文填）
     *
     * @param str 原字符串
     * @param length 总长度
     */

    public static String fillChineseAtRight(String str, int length){
        if (null == str){
            str="";
        }
        return fillChinese(str,' ',length,true);
    }

    /**
     *
     *  字符填充
     *
     * @param string 原字符串
     * @param filler 填充字符
     * @param totalLength 总长度
     * @param atEnd 是否是在string后面填充，是填true,否填false(在string前面填充)
     */

    public static String fillString(String string, char filler, int totalLength, boolean atEnd) {
        if (string == null){
            return "";
        }
        byte[] tempbyte = string.getBytes();

        return fillResidualStr(tempbyte,string,filler,totalLength,atEnd);
    }


    /**
     *
     *   中文填充
     *
     * @param string 原字符串
     * @param filler 填充字符
     * @param totalLength 总长度
     * @param atEnd 是否是在string后面填充，是填true,否填false(在string前面填充)
     */
    public static String fillChinese(String string, char filler, int totalLength, boolean atEnd) {
        if (string == null){
            return "";
        }
        byte[] tempbyte = new byte[0];
        try {
            tempbyte = string.getBytes(StandardCharsets.UTF_8);
        } catch (Exception e) {
        }

        return fillResidualStr(tempbyte,string,filler,totalLength,atEnd);
    }


    private static String fillResidualStr(byte[] temp, String string, char filler, int totalLength, boolean atEnd){
        int currentLength = temp.length;
        int delta = totalLength - currentLength;

        for (int i = 0; i < delta; i++) {
            if (atEnd) {
                string += filler;
            } else {
                string = filler + string;
            }
        }
        return string;
    }


}
