package com.ws.base.transfer.car.manage.sys.util;

import java.util.*;

/**
 * 常用方法
 */
public class ComUtil {

    public static void main(String[] args) {
//        List<String> ids = new ArrayList<String>();
//        ids.add("zuidaima.com");
//        ids.add("zuidaima");
//        ids.add("最代码");
//        ids.add("javaniu");
//        ids.add("javaniu.com");
//        ids.add("www.zuidaima.com");
//        List aa = getSubRandomList(ids,3);
//        for (Object str : aa) {
//            System.out.print(str + " ");
//        }

        String sources = "0123456789ABCDEF";
        for (int i = 0; i <= 10; i++) {
//            System.out.println(getRandomN(sources, 6));

            System.out.println(getOneDayMill());
        }
        int num = 12;
        String str = leftPad(num, 4, '0');//4是针对9999以下的，类似的5针对99999
        System.out.println("After pad, num " + num + " is: " + str);

        System.out.println(getPreMonthFirstDayMill(1));
        System.out.println(getPreMonthLastDayMill(1));
    }


    public static String leftPad(int num, final int maxLen, char filledChar) {
        StringBuffer sb = new StringBuffer();
        String str = String.valueOf(num);
        for (int i = str.length(); i < maxLen; i++) {
            sb.append(filledChar);
        }
        return sb.append(str).toString();
    }

    /**
     * 格式化金额(元)：金额2位小数，四舍五入
     *
     * @param currentAmount
     * @return
     */
    public static Double formatAmouontYuan(Double currentAmount) {
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
        return Double.parseDouble(df.format(currentAmount));
    }

    /**
     * 格式化金额（元）：金额2位小数，四舍五入
     *
     * @param currentAmount
     * @return
     */
    public static Double formatAmouontYuan(String currentAmount) {
        Double amount = Double.parseDouble(currentAmount);
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
        return Double.parseDouble(df.format(amount));
    }

    /**
     * 格式化金额（分）：金额2位小数，四舍五入
     *
     * @param currentAmount
     * @return
     */
    public static Double formatAmouontFen(Double currentAmount) {
        java.text.DecimalFormat df = new java.text.DecimalFormat("0");
        return Double.parseDouble(df.format(currentAmount));
    }

    /**
     * 格式化金额（分）：金额2位小数，四舍五入
     *
     * @param currentAmount
     * @return
     */
    public static Double formatAmouontFen(String currentAmount) {
        Double amount = Double.parseDouble(currentAmount);
        java.text.DecimalFormat df = new java.text.DecimalFormat("0");
        return Double.parseDouble(df.format(amount));
    }

    /**
     * 获取上个月第一天的方法：
     *
     * @return
     */
    public static Long getPreMonthFirstDayMill(Integer num) {
        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.MONTH, -1);
        calendar.add(Calendar.MONTH, 0 - num);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTimeInMillis();
    }

    /**
     * 获取上个月最后一天的方法，这个稍微要变通一下，先将日期设置为本月的第一天，然后减去一天就变成了上个月的最后一天了：
     *
     * @return
     */
    public static Long getPreMonthLastDayMill(Integer num) {
        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.MONTH, 0);
        calendar.add(Calendar.MONTH, 1 - num);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.DATE, -1);
        return calendar.getTimeInMillis();
    }

    /**
     * 取得一天时间的毫秒数
     *
     * @return
     */
    public static Long getOneDayMill() {
        return Long.parseLong(24 * 60 * 60 * 1000 + "");
    }

    /**
     * 今天零点零分零秒的毫秒数
     *
     * @return
     */
    public static Long getTodyZeroMill() {
        long current = System.currentTimeMillis();//当前时间毫秒数
//        long zero = current / (1000 * 3600 * 24) * (1000 * 3600 * 24) - TimeZone.getDefault().getRawOffset();//今天零点零分零秒的毫秒数
        long zero = current - TimeZone.getDefault().getRawOffset();//今天零点零分零秒的毫秒数
        return zero;
    }

    /**
     * 今天23点59分59秒的毫秒数
     *
     * @return
     */
    public static Long getTodyTwelveMill() {
        return getTodyZeroMill() + getOneDayMill() - 1;//今天23点59分59秒的毫秒数
    }

    /**
     * 获取指定个数N的随机串
     *
     * @param sources "0123456789ABCDEF"; // 加上一些字母，就可以生成pc站的验证码了
     * @param num     指定个数N
     * @return
     */
    public static String getRandomN(String sources, Integer num) {
        if (num > sources.length()) {
            return null;
        }
        StringBuffer flag = new StringBuffer();
        Random rand = new Random();
        for (int j = 0; j < num; j++) {
            flag.append(sources.charAt(rand.nextInt(sources.length())) + "");
        }
        return flag.toString();
    }

    /**
     * 在数组中，随机取出指定数量的元素
     *
     * @param list 原始数组
     * @param num  取多少个元素
     * @return
     */
    public static List getSubRandomList(List list, Integer num) {
        List ret = new ArrayList();
        if (ComUtil.isEmpty(list)) {
            return new ArrayList();
        }
        if (list.size() < num) {
            return ret;
        }

        Random r = new Random();
        for (int i = 0; i < num; i++) {
            int index = r.nextInt(list.size() - i);
            ret.add(list.get(index));
            list.remove(index);
        }
        return ret;
    }

    public static boolean isEmpty(Object aObj) {
        if (aObj instanceof String) {
            return isEmpty((String) aObj);
        } else if (aObj instanceof Long) {
            return isEmpty((Long) aObj);
        } else if (aObj instanceof Date) {
            return isEmpty((Date) aObj);
        } else if (aObj instanceof Collection) {
            return isEmpty((Collection) aObj);
        } else if (aObj instanceof Map) {
            return isEmpty((Map) aObj);
        } else if (aObj != null && aObj.getClass().isArray()) {
            return isEmptyArray(aObj);
        } else {
            return isNull(aObj);
        }
    }

    private static boolean isEmptyArray(Object array) {
        int length = 0;
        if (array instanceof int[]) {
            length = ((int[]) array).length;
        } else if (array instanceof byte[]) {
            length = ((byte[]) array).length;
        } else if (array instanceof short[]) {
            length = ((short[]) array).length;
        } else if (array instanceof char[]) {
            length = ((char[]) array).length;
        } else if (array instanceof float[]) {
            length = ((float[]) array).length;
        } else if (array instanceof double[]) {
            length = ((double[]) array).length;
        } else if (array instanceof long[]) {
            length = ((long[]) array).length;
        } else if (array instanceof boolean[]) {
            length = ((boolean[]) array).length;
        } else {
            length = ((Object[]) array).length;
        }
        if (length == 0) {
            return true;
        }
        return false;
    }


    public static boolean isEmpty(Date aDate) {
        if (aDate == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEmpty(Long aLong) {
        if (aLong == null) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean isEmpty(Map m) {
        if (m == null || m.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(Collection c) {
        if (c == null || c.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(String aStr) {
        if (aStr == null || aStr.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


    public static String trim(String aStr) {
        if (aStr == null) {
            return "";
        } else {
            return aStr.trim();
        }
    }

    public static boolean isNull(Object oStr) {
        if (oStr == null) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean equals(String str1, String str2) {
        return str1 != null ? str1.equals(str2) : str2 == null;
    }

    public static boolean equals(Long L1, Long L2) {
        return L1 != null ? L1.equals(L2) : L2 == null;
    }

    public static boolean equals(Object obj1, Object obj2) {
        boolean result;
        if (obj1 != null) {
            result = obj1.equals(obj2);
        } else {
            result = (obj2 == null);
        }
        return result;
    }

    public static boolean equalsIgnoreCase(String str1, String str2) {
        return str1 != null ? str1.equalsIgnoreCase(str2) : str2 == null;
    }

}
