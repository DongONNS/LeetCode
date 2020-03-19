package letecodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        List<List<Integer>> lists = combinationSum2(candidates, 8);
        Iterator<List<Integer>> iterator = lists.iterator();
        while(iterator.hasNext()){
            List<Integer> elements = iterator.next();
            Iterator<Integer> iterator1 = elements.iterator();
            while(iterator1.hasNext()){
                System.out.print(iterator1.next()+" ");
            }
            System.out.println("=====================");
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, candidates, new ArrayList<>(), target, 0);
        return res;
    }

    /**
     *
     * @param res 结果集。
     * @param candidates 用于查找相关数字的数组。
     * @param temp  用于暂时存储合适的组合。
     * @param target 目标和。
     * @param nextIndex 下一位索引。
     */
    public static void dfs(List<List<Integer>> res, int[] candidates, List<Integer> temp, int target, int nextIndex) {
        if (target == 0) {
            //如果target已经为0了，那么就将这个序列存入到我们的结果集中
            if (!res.contains(temp)) {
                res.add(temp);
            }
            return;
        }
        //倘若数组越界或者超过目标值或者是下一个元素不符要求，直接结束方法
        if (nextIndex >= candidates.length || target < 0 || candidates[nextIndex] > target) {
            return;
        }
        for (int i = nextIndex; i < candidates.length; i++) {
            //倘若后面的元素已经大于我们的目标值了，那么直接结束方法
            if (candidates[i] > target) {
                return;
            }
            List<Integer> list = new ArrayList<>(temp);
            list.add(candidates[i]);
            dfs(res, candidates, list, target - candidates[i], ++nextIndex);
        }
    }
}