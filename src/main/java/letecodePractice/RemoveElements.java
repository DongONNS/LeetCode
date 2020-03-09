package letecodePractice;

public class RemoveElements {
    public static void main(String[] args) {

    }
    public static ListNode removeElements(ListNode head, int val){
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode prev = sentinel,curr = head;
        while(curr != null){
            if(curr.val == val) prev.next = curr.next;
            else prev = curr;
            curr = curr.next;
        }
        return sentinel.next;
    }
}
