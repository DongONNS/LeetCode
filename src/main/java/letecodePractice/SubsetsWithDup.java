package letecodePractice;

import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SubsetsWithDup {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> lists = subsetsWithDup(arr);
        Iterator<List<Integer>> iterator1 = lists.iterator();
        while(iterator1.hasNext()){
            List<Integer> list2 = iterator1.next();
            Iterator<Integer> iterator2 = list2.iterator();
            while(iterator2.hasNext()){
                System.out.print(iterator2.next()+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());//初始化空数组
        Arrays.sort(nums);
        int start = 1;//保存新解的开始位置
        for (int i = 0;i < nums.length;i++){
            List<List<Integer>> ans_tmp = new ArrayList<>();
            //遍历之前的结果
            for(int j = 0;j < ans.size();j++){
                List<Integer> list = ans.get(j);
                //如果出现了重复数字，就跳过所有旧解
                if (i > 0&&nums[i] == nums[i-1] && j< start){
                    continue;
                }
                List<Integer> tmp = new ArrayList<>(list);
                tmp.add(nums[i]);
                ans_tmp.add(tmp);
            }
            start = ans.size();
            ans.addAll(ans_tmp);
        }
    return ans;
    }



//    public static List<List<Integer>> subsetsWithDup(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        Arrays.sort(nums); //排序
//        getAns(nums, 0, new ArrayList<>(), ans);
//        return ans;
//    }
//
//    private static void getAns(int[] nums, int start, ArrayList<Integer> temp, List<List<Integer>> ans) {
//        ans.add(new ArrayList<>(temp));
//        for (int i = start; i < nums.length; i++) {
//            //和上个数字相等就跳过
//            if (i > start && nums[i] == nums[i - 1]) {
//                continue;
//            }
//            temp.add(nums[i]);
//            getAns(nums, i + 1, temp, ans);
//            temp.remove(temp.size() - 1);
//        }
//    }
}
