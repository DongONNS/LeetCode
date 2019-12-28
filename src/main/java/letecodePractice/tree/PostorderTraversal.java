package letecodePractice.tree;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        traversal(root,res);
        return res;
    }
    public void traversal(TreeNode root, List<Integer> res){
        if(root != null){
            res.add(root.val);
            if(root.left != null){
                traversal(root.left,res);
            }
            if(root.right != null){
                traversal(root.right,res);
            }
        }
    }
}
