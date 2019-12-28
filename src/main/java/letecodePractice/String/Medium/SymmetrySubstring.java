package letecodePractice.String.Medium;

/*
����һ���ַ�������������Ǽ�������ַ������ж��ٸ������Ӵ���
        ���в�ͬ��ʼλ�û����λ�õ��Ӵ�����ʹ������ͬ���ַ���ɣ�Ҳ�ᱻ��Ϊ�ǲ�ͬ���Ӵ���
        ʾ�� 1:
        ����: "abc"
        ���: 3
        ����: ���������Ӵ�: "a", "b", "c".

        ʾ�� 2:
        ����: "aaa"
        ���: 6
        ˵��: 6�������Ӵ�: "a", "a", "a", "aa", "aa", "aaa".
        ע��:

        ������ַ������Ȳ��ᳬ��1000��
*/

/**
 * ���ö�̬�滮��������ִ�����
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
        //ע��i ��j �ı߽磬ֻ�����ϰ벿�֣�j - i <= 1��Ϊ�˴���߽磬dp[i + 1][j - 1]��dp[i][j]��ͷȥβ����Ƿ��ǻ���
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








// �����㷨���ؼ�������������...
//public class SymmetrySubstring {
//    public static void main(letecodePractice.String[] args){
//        letecodePractice.String s = "aaa";
//        int num = countSubstrings(s);
//        System.out.println(num);
//
//    }
//
//    public static int countSubstrings(letecodePractice.String s) {
//        int num = 0;
//        StringBuilder sb = new StringBuilder(s);
//        //�����ִ�����ʼλ��
//        for(int i=0;i<s.length();i++){
//            //��������ʼλ�õ���β���г����ִ����ж��Ƿ�Ϊ�����ַ���
//            for(int j=i;j<s.length();j++){
//                letecodePractice.String string = sb.substring(i,j+1);
//                if (isSymmetryString(string)){
//                    num++;
//                }
//            }
//        }
//        return num;
//    }
//
//    public static Boolean isSymmetryString(letecodePractice.String str){
//        //�Ƚ�ǰ����ַ��Ƿ���ȣ������Ӧλ���ֲ����Ԫ�ؾͷ���false��
//        for(int i=0;i<str.length()/2;i++){
//            if(str.charAt(i)!=str.charAt(str.length()-i)){
//                return false;
//            }
//        }
//        return true;
//    }
//}


