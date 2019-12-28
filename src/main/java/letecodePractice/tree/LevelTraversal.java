package letecodePractice.tree;

import java.util.ArrayList;
import java.util.List;

public class LevelTraversal {
    List<List<Integer>> levels = new ArrayList<List<Integer>>();
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ val = x;}
    }

    public List<List<Integer>> inorderTraversal(TreeNode root){
        if (root == null) return levels;
        traversal(root,0);
        return levels;
    }

    public void traversal(TreeNode node,int level){
        //开始当前层的遍历
        if (levels.size() == level){
            levels.add(new ArrayList<Integer>());
        }

        //添加当前层节点的值
        levels.get(level).add(node.val);

        //处理下一层的子节点；
        if (node.left!=null){
            traversal(node.left,level+1);
        }
        if (node.right!=null){
            traversal(node.right,level+1);
        }
    }
}
