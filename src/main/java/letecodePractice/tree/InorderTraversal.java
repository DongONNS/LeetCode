package letecodePractice.tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    //定义私有内部类TreeNode
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    //中续遍历
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        traversal(root,res);
        return res;
    }

    //实现对链表的中序遍历
    public void traversal(TreeNode root,List<Integer> res){
        if (root != null){
            if (root.left != null){
                traversal(root.left,res);
            }
            res.add(root.val);
            if (root.right!=null){
                traversal(root.right,res);
            }
        }
    }
}
