package String;

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

class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int i;
        for(i = 0; i < s.length(); i++){
            count += countPalindrome(s, i, i);
            count += countPalindrome(s, i, i + 1);
        }
        return count;
    }
    public int countPalindrome (String s, int left, int right){
        int count = 0;
        while(left >= 0 && right < s.length() && s.charAt(left--) == s.charAt(right++)){
            count++;
        }
        return count;
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


