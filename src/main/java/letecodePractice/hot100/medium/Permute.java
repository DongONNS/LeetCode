package letecodePractice.hot100.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Permute {
    public static void main(String[] args) {

    }
    public List<List<Integer>> permute(int[] nums) {
        //初始化输出列表
        List<List<Integer>> output = new LinkedList();
        ArrayList<Integer> nums_list = new ArrayList<Integer>();
        for(int num:nums){
            nums_list.add(num);
        }
        int len = nums.length;
        backtrack(len,nums_list,output,0);
        return output;
    }
    public void backtrack(int len,ArrayList<Integer> nums,List<List<Integer>> output,int first){
        if(first == len ){
            output.add(new ArrayList<Integer>(nums));
        }

        for(int i = first;i<len;i++){
            Collections.swap(nums,first,i);
            backtrack(len,nums,output,first+1);
            Collections.swap(nums,first,i);
        }
    }
}