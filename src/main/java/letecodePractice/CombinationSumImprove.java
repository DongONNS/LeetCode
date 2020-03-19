package letecodePractice;

import org.omg.CORBA.INTERNAL;

import java.util.*;

public class CombinationSumImprove {

    public static void main(String[] args) {
        int[] canditates = {10,1,2,7,6,1,5};
        List<List<Integer>> lists = combinationSum2(canditates, 8);
        Iterator<List<Integer>> iterator = lists.iterator();
        while(iterator.hasNext()){
            List<Integer> elements = iterator.next();
            Iterator<Integer> iterator1 = elements.iterator();
            while(iterator1.hasNext()){
                System.out.print(iterator1.next()+" ");
            }
            System.out.println();
        }
    }

    private static void dfs(int[] canditates, int len, int begin, int residue, Deque<Integer> path, List<List<Integer>> res){
        if (residue == 0){
            res.add(new ArrayList<>(path));
            return ;
        }
        for (int i = begin;i < canditates.length;i++){
            //如果这个候选值已经大于0了，那么后面的值就更不可能了
            if (residue - canditates[i] < 0)
                break;
            //倘若该索引的值与前一个索引的值相等，那么就不用再进行索引判断了
            if(i > begin && canditates[i] == canditates[i-1])
                continue;
            path.addLast(canditates[i]);
            //因为元素不可重复使用，所以传递下去的是i+1;
            dfs(canditates,len,i+1,residue-canditates[i],path,res);
            path.removeLast();
        }
    }
    public static List<List<Integer>> combinationSum2(int[] canditates,int target){
        int len = canditates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) return  res;
        Arrays.sort(canditates);
        Deque<Integer> path = new ArrayDeque<Integer>(len);
        dfs(canditates,len,0,target,path,res);
        return res;
    }
}
