package letecodePractice;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.temporal.ChronoUnit;

public class MyAtoi {
    public static void main(String[] args) {
        String num = "-2147483647";
        int result = myAtoi(num);
        System.out.println(result);
    }

    public static int myAtoi(String str){
        int len = str.length();
        int index = 0;
        //去除前导空格
        while(index < len){
            if (str.charAt(index) != ' ')
                break;
            index++;
        }
        if (index == len) return 0;
        int sign = 1;
        char firstChar = str.charAt(index);
        if (firstChar == '+'){
            sign = 1;
            index++;
        }
        else if (firstChar == '-'){
            sign = -1;
            index++;
        }
        //将数字截留出来
        int res = 0;
        while(index < len){
            char currChar = str.charAt(index);
            if (currChar < '0' || currChar > '9')
                break;
            //如果数字溢出了，那就直接返回int的边界值
            if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && (currChar-'0') > Integer.MAX_VALUE%10))
                return Integer.MAX_VALUE;

            if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10 && (currChar-'0') > -(Integer.MIN_VALUE%10)))
                return Integer.MIN_VALUE;
            res = res*10 + sign*(currChar-'0');
            index++;
        }
        return res;
    }
//    public static String myAtoi(String str){
//        String strTrim = str.trim();//去除字符的前后空格
//        char start = strTrim.charAt(0);
//        //如果开头不是数字或者正负号，那么直接返回0;
//        if (start!='-' || start!='+' || !(start>='0'&&start<='9'))
//            return 0+"";
//        StringBuilder sb = new StringBuilder();
//        sb.append(strTrim.charAt(0));//先将第一个字符留下来，后面的字符则必须是数字了
//        for (int i = 1;i<strTrim.length();i++){
//            char temp = strTrim.charAt(i);
//            if (!(temp>='0'&&temp<='9')) break;
//            sb.append(temp);
//        }
//        //将得到的子串转换成有效的位数。
//        String validSubstring = sb.toString();
//
//        return null;
//    }
}
