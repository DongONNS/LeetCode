package letecodePractice.tree;

//给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
//
//        二叉树的根是数组中的最大元素。
//        左子树是通过数组中最大值左边部分构造出的最大二叉树。
//        右子树是通过数组中最大值右边部分构造出的最大二叉树。
//        通过给定的数组构建最大二叉树，并且输出这个树的根节点。

import java.util.Arrays;

public class ConstructMaximumBinaryTree {
    private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        //设置第一个元素为当前最大的节点，也就是root节点；
        TreeNode node = new TreeNode(nums[0]);
        TreeNode curMax = node;
        int curIndex = 0;

        for(int i = 1; i < nums.length ; i++){
            //大于则将原来最大的节点置于其左
            if(nums[i] > nums[curIndex]){
                TreeNode temp = new TreeNode(nums[i]);
                temp.left = curMax;
                curMax = temp;
                curIndex = i;
            } else {
                //小于则遍历原最大节点的右子树，找到其合适的位置。
                TreeNode temp = curMax;
                while(temp.right != null){
                    TreeNode right = temp.right;
                    if(right.val > nums[i]){
                        temp = temp.right;
                    } else {
                        TreeNode temp1 = new TreeNode(nums[i]);
                        temp1.left = right;
                        temp.right = temp1;
                        break;
                    }
                }
                if(temp.right == null){
                    temp.right = new TreeNode(nums[i]);
                }
            }
        }
        return curMax;
    }
}


