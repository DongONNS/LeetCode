package letecodePractice.onetothirty;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode start = pre, end = pre;
        while(n != 0) {
            start = start.next;
            n--;
        }
        while(start.next != null) {
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return pre.next;
    }
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        int length  = 0;
//        ListNode first = head;
//        while (first != null) {
//            length++;
//            first = first.next;
//        }
//        length -= n;
//        first = dummy;
//        while (length > 0) {
//            length--;
//            first = first.next;
//        }
//        first.next = first.next.next;
//        return dummy.next;
//    }
}
