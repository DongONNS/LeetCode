package letecodePractice;


//删除一个指定的节点，该节点不是链表的最后一个节点
public class DeleteNode {
    public void deleteNode(TreeNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
    private class TreeNode{
        int val;
        TreeNode next;
        public TreeNode(int val){
            this.val = val;
        }
    }
}
