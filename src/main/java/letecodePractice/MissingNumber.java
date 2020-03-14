package letecodePractice;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {3,0,1};
        int ans = missingNumber(array);
        System.out.println(ans);
    }
//    public static int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int result = -1;
//        for(int i=0;i <= nums.length;i++){
//            if(nums[i] != i){
//                result = i;
//                break;
//            }
//        }
//        return result;
//    }

    public static int missingNumber(int[] nums){
        int len = nums.length;
        int expectedSum = len*(len+1)/2;
        int actualSum = 0;
        for(int i : nums) actualSum+=i;
        return expectedSum - actualSum;
    }



}
