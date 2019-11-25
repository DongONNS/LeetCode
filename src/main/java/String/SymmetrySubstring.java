package String;

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






// �����㷨���ؼ�������������...
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
//        //�����ִ�����ʼλ��
//        for(int i=0;i<s.length();i++){
//            //��������ʼλ�õ���β���г����ִ����ж��Ƿ�Ϊ�����ַ���
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
//        //�Ƚ�ǰ����ַ��Ƿ���ȣ������Ӧλ���ֲ����Ԫ�ؾͷ���false��
//        for(int i=0;i<str.length()/2;i++){
//            if(str.charAt(i)!=str.charAt(str.length()-i)){
//                return false;
//            }
//        }
//        return true;
//    }
//}


