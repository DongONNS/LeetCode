package letecodePractice;

import java.util.*;

public class ContainsNearbyDuplicate {

    public static void main(String[] args) {
        int[] nums = {99,99};
        int k = 2;
        boolean result = containsNearbyDuplicate(nums, k);
        System.out.println(result);
    }

    public static boolean containsNearbyDuplicate(int[] nums,int k){
        Set<Integer> set = new HashSet();
        for(int i = 0;i < nums.length;i++){
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() == k+1) set.remove(nums[i - k]);
        }
        return false;
    }
//
//    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        Map map = new HashMap();
//        //将数组存入到map中，map的键为数组元素，值为索引；
//        for (int i = 0; i < nums.length; i++) map.put(i, nums[i]);
//
//        Set keySet = map.keySet();
//        boolean flag = false;
//        int len = Math.min(nums.length-k,nums.length);
//        for (int i = 0; i < len; i++) {
//            for (int j = 0;j < k;j++){
//                if (map.get(i) == map.get(j)) return true;
//            }
//        }
//        return flag;
//    }
}