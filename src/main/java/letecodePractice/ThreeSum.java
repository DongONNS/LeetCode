package letecodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] data = new int[]{-1,0,1,2,-1,-4};
        System.out.println(Arrays.toString(data));
        List<List<Integer>> lists = threeSum(data);
        System.out.println(lists.size());
        for (List ans : lists){
            System.out.println(ans.toString());
        }
    }
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int len = nums.length;
        if (nums==null || nums.length<3) return ans;
        Arrays.sort(nums);
        for (int i=0;i<len;i++){
            if (nums[i]>0) break;
            if (i>0&&nums[i]==nums[i-1]) continue;
            int L = i+1;
            int R = len - 1;
            while(L< R){
                int sum = nums[i]+nums[L]+nums[R];
                if (sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while(L<R && nums[L] == nums[L+1]) L++;
                    while(L<R && nums[R] == nums[R-1]) R--;
                    L++;
                    R--;
                }
                else if(sum<0) L++;
                else if(sum>0) R--;
            }
        }
        return ans;
    }
}
