package letecodePractice;

public class TitleToNumber {


    public static void main(String[] args) {
        String s = "ZY";
        int result = titleToNum(s);
        System.out.println(result);
    }
    public static int titleToNumber(String s){
        int result = 0;
        int[] nums = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};

        int len = 0;
        int max = s.length()-1;
        while(len < s.length()){
            int c = (int)s.charAt(max - len);
            int index = c - 64;
            result += nums[index]*Math.pow(26,len);
            len++;
        }
        return result;
    }

    public static int titleToNum(String s){
        int result = 0;
        for(int i = 0;i < s.length();i++){
            int num = s.charAt(i) - 'A' + 1;
            result = result*26 + num;
        }
        return result;
    }
}