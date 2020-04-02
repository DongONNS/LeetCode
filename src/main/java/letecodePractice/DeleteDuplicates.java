package letecodePractice;

public class DeleteDuplicates {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        head.next = node1; node1.next = node2; node2.next = node3;
        node3.next = node4;node4.next = node5;node5.next = node6;
        ListNode node = head;
        while(node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
        deleteDuplicates(head);
        ListNode noden = head;
        while(noden != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr.next != null && curr.next.next != null){
            if (curr.next.val == curr.next.next.val ){
                ListNode temp = curr.next;
                while(temp != null &&temp.next != null && temp.val == temp.next.val){
                    temp = temp.next;
                }
                curr.next = temp.next;
            }else curr = curr.next;
        }
        return dummy.next;
    }


//    public static ListNode deleteDuplicates(ListNode head) {
//        if(head == null) return head;
//        while(head == head.next){
//            head = head.next.next;
//        }
//        ListNode curr = head;
//        while(curr.next != null){
//            if(curr.val == curr.next.val){
//                curr = curr.next.next;
//            }else{
//                curr = curr.next;
//            }
//        }
//        return head;
//    }
}
