package letecodePractice;

//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
//
//        示例 1：
//
//        输入: "babad"
//        输出: "bab"
//        注意: "aba" 也是一个有效答案。
//        示例 2：
//
//        输入: "cbbd"
//        输出: "bb"

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "cbbd";
        String result = longestPalindrome(str);
        System.out.println(result);
    }

    public static String longestPalindrome(String s){
        if (s==null || s.length()==0) return "";
        String result = "";
        char[] str = s.toCharArray();
        int maxLength = 1;
        for (int i=0;i<str.length;i++){
            for (int j=i+1;j<=str.length;j++){
                String string = s.substring(i,j);
                if (isPalindrome(string)&&string.length()>=maxLength){
                    maxLength = string.length();
                    result = string;
                }
            }
        }
        return result;
    }
    public static boolean isPalindrome(String string){
        if (string == null) return false;
        if (string.length()==1) return true;
        for (int i=0;i<string.length()/2;i++){
            if (string.charAt(i)!=string.charAt(string.length()-i-1)) return false;
        }
        return true;
    }
}
