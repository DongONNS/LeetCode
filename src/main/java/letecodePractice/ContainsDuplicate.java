package letecodePractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums){
        return Arrays.stream(nums).distinct().count() != nums.length;
    }

//    //采用set数组的特点进行判断
//    public static boolean containsDuplicate(int[] nums){
//        Set<Integer> numSet = new HashSet();
//        boolean flag = false;
//        for(int i : nums){
//            if (numSet.contains(i)) return true;
//            numSet.add(i);
//        }
//        return false;
//    }

//    //采用排序法
//    public static boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for(int i = 0;i < nums.length- 1;i++){
//            if(nums[i] == nums[i+1]) return true;
//        }
//        return false;
//    }

//    //暴力解法
//    public static boolean containsDuplicate(int[] nums) {
//        for(int i = 0;i < nums.length;i++){
//            for(int j = 0;j < i;j++){
//                if(nums[j]== nums[i]) return true;
//            }
//        }
//        return false;
//    }
}
