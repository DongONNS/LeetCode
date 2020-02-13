package letecodePractice;

import java.util.*;

public class PermuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        // 修改 1：排序（升序或者降序都可以），为了剪枝方便
        Arrays.sort(nums);
        boolean[] used = new boolean[len];
        // 使用 Deque 是 Java 官方 Stack 类的建议
        Deque<Integer> path = new ArrayDeque<>(len);
        dfs(nums, len, 0, used, path, res);
        return res;
    }

    /**
     *
     * @param nums  待进行搜索的数组
     * @param len   带搜索数组的长度
     * @param depth 已经搜索的深度
     * @param used
     * @param path  存放搜索过程中的结果
     * @param res   结果数组
     */
    private void dfs(int[] nums, int len, int depth, boolean[] used, Deque<Integer> path, List<List<Integer>> res) {
        //搜索到了一条结果
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }
        // 这个 pre 值必须是整个数组中没有出现的，因此下边界 - 1 或者是上边界 + 1，均可
        // 如果数组中有 int 类型的最大值或者最小值，可能会存在问题，好在这题里没有极端数据
        int pre = nums[0] - 1;
        for (int i = 0; i < len; ++i) {
            if (!used[i] && pre != nums[i]) {
                path.addLast(nums[i]);
                used[i] = true;

                dfs(nums, len, depth + 1, used, path, res);

                used[i] = false;
                path.removeLast();

                pre = nums[i];
            }
        }
    }
}