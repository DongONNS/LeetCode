package letecodePractice;

public class RebuildBinaryTree {
    public static BinaryTreeNode construct(int[] preOrder,int[] inOrder){
        if (preOrder==null||inOrder==null||preOrder.length!=inOrder.length||inOrder.length<1){
            return null;
        }
        return construct(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);
    }
    public static BinaryTreeNode construct(int[] preOrder,int ps,int pe,int[] inOrder,int is,int ie){
        if (ps > pe) return null;
        //前序遍历中的第一个位置就是当前的根节点
        int value = preOrder[ps];
        int index = is;
        while(index <= ie && inOrder[index]!=value){
            index++;
        }
        //如果在整个中序遍历的数组中没有找到，说明输入的参数是不合法的，抛出异常
        if (index > ie){
            throw new RuntimeException("invalid input");
        }
        BinaryTreeNode node = new BinaryTreeNode();
        node.value = value;
        node.left =  construct(preOrder,ps+1,ps+index-is,inOrder,is,index-1);
        node.right = construct(preOrder,ps+index-is+1,pe,inOrder,index+1,ie);
        return node;
    }
}
//树节点
class BinaryTreeNode{
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;
}
