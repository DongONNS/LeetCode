package letecodePractice;
//要求再O(1)时间内删除一个节点
public class DeleteNode2 {
    public static ListNode deleteNode(ListNode head,ListNode val){
        if (head == null || val == null) return null;
        if (val.next != null){ //待删除的节点不是尾节点
            ListNode next = val.next;
            val.val = next.val;
            val.next = next.next;
        }else if(head.next == null){ //我们的链表只有一个节点
            return null;
        }else{                  //待删除的节点位于链表的尾部
            ListNode curr = head;
            while(curr.next != val){
                curr = curr.next;
            }
            curr.next = null;
        }
        return head;
    }
}
