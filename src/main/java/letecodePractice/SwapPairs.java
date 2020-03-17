package letecodePractice;

import letecodePractice.Graph.Node;

public class SwapPairs {
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        first.next = second;
        second.next = third;
        third.next = fourth;
        ListNode curr = first;
        while(curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
        System.out.println("========转换=========");
        swapPairs(first);
        curr = first;
        while(curr != null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }
    //采用非递归解法
    public static ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;//这个pre的作用就是哨兵
        ListNode temp = pre;
        while(temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }
    //采用递归解法
//    public static ListNode swapPairs(ListNode head){
//        //终止条件
//        if (head == null && head.next == null) return head;
//        //递归的执行单元
//        ListNode next = head.next;
//        head.next = swapPairs(next.next);
//        next.next = head;
//        return next;
//    }
}
