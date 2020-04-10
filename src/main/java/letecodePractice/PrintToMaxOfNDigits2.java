package letecodePractice;

import java.util.Arrays;

public class PrintToMaxOfNDigits2 {
    public static void main(String[] args) {
        printToMaxOfNDigits(3);
    }
    public static void printToMaxOfNDigits(int n){
        if (n <= 0) return;
        char[] nums = new char[n+1];
        Arrays.fill(nums,'0');
        while(!increment(nums)){
            printNum(nums);
        }
    }
    public static boolean increment(char[] nums){
        int carry = 0;
        for(int i = nums.length - 1;i >= 0;i--){
            int temp = nums[i] - '0' + carry;
            if (i == nums.length - 1){
                temp++;
            }
            carry = temp / 10;
            temp %= 10;
            nums[i] =(char)(temp + '0');
        }
        return nums[0] == '1';
    }
    public static void printNum(char[] nums){
        int index = 0;
        for(; index < nums.length; index++){
            if (nums[index] != '0'){
                break;
            }
        }
        for(;index < nums.length;index++){
            System.out.print(index);
        }
        System.out.println();
    }
}
