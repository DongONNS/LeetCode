package letecodePractice;

import java.util.ArrayList;
import java.util.List;

public class GenerateTrees {
    public static void main(String[] args) {
        GenerateTrees generateTrees = new GenerateTrees();
        List<TreeNode> treeNodes = generateTrees.generateTrees(3);
    }
    public List<TreeNode> generateTrees(int n){
        List<TreeNode> ans = new ArrayList<TreeNode>();
        if (n <= 0)
            return ans;
        return getAns(1,n);
    }
    private List<TreeNode> getAns(int start,int end){
        List<TreeNode> ans = new ArrayList<TreeNode>();
        //此时没有数字，将Null加入到结果中
        if (start > end){
            ans.add(null);
            return ans;
        }
        //只有一个数字，将该节点当作一棵树假如结果中
        if (start == end){
            TreeNode tree = new TreeNode(start);
            ans.add(tree);
            return ans;
        }
        //尝试每个数字作为根节点
        for (int i = start;i <= end;i++){
            //得到所有可能的左子树
            List<TreeNode> leftTrees = getAns(start,i-1);
            //得到所有可能的右子树
            List<TreeNode> rightTrees = getAns(i+1,end);
            //左子树右子树两两结合
            for (TreeNode leftTree : leftTrees){
                for (TreeNode rightTree : rightTrees){
                    TreeNode root = new TreeNode(i);
                    root.left = leftTree;
                    root.right = rightTree;
                    //加入到最终结果中
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}
