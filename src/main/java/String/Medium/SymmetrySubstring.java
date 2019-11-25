package String.Medium;

/*
给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
        具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
        示例 1:
        输入: "abc"
        输出: 3
        解释: 三个回文子串: "a", "b", "c".

        示例 2:
        输入: "aaa"
        输出: 6
        说明: 6个回文子串: "a", "a", "a", "aa", "aa", "aaa".
        注意:

        输入的字符串长度不会超过1000。
*/

/**
 * 采用动态规划解决回文字串问题
 */
class Solution {

    public static void main(String[] args) {
        String string = "aaa";
        int num = countSubstrings(string);
        System.out.println(num);
    }


    public static int countSubstrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int result = 0;
        boolean[][] dp = buildDPForCountSubstrings(s);
        for (int j = 0; j < dp.length; j++) {
            for (int i = 0; i <= j; i++) {
                if (dp[i][j]) {
                    result++;
                }
            }
        }
        return result;
    }

    private static boolean[][] buildDPForCountSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        //注意i 和j 的边界，只计算上半部分，j - i <= 1是为了处理边界，dp[i + 1][j - 1]是dp[i][j]砍头去尾后的是否是回文
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                if (i == j) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i <= 1 || dp[i + 1][j - 1]);
                }
            }
        }
        return dp;
    }
}








// 暴力算法，关键还暴力不出来...
//public class SymmetrySubstring {
//    public static void main(String[] args){
//        String s = "aaa";
//        int num = countSubstrings(s);
//        System.out.println(num);
//
//    }
//
//    public static int countSubstrings(String s) {
//        int num = 0;
//        StringBuilder sb = new StringBuilder(s);
//        //控制字串的起始位置
//        for(int i=0;i<s.length();i++){
//            //遍历从起始位置到结尾所有长度字串，判断是否为回文字符串
//            for(int j=i;j<s.length();j++){
//                String string = sb.substring(i,j+1);
//                if (isSymmetryString(string)){
//                    num++;
//                }
//            }
//        }
//        return num;
//    }
//
//    public static Boolean isSymmetryString(String str){
//        //比较前后的字符是否相等，如果对应位置又不想的元素就返回false；
//        for(int i=0;i<str.length()/2;i++){
//            if(str.charAt(i)!=str.charAt(str.length()-i)){
//                return false;
//            }
//        }
//        return true;
//    }
//}


