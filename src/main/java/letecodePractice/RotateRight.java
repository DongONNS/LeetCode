package letecodePractice;

import java.util.ListIterator;

public class RotateRight {
    public static void main(String[] args) {
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        first.next = second;
        second.next = third;
        third.next = null;
        for (ListNode node = first;node != null;node = node.next){
            System.out.print(node.val+" ");
        }
        System.out.println("将链表进行旋转");
        rotateRight(first,4);
        for (ListNode node = first;node != null;node = node.next){
            System.out.print(node.val+" ");
        }
    }
    public static ListNode rotateRight(ListNode head,int k){
        //得到我们的链表的大小;
        int size = 0;
        ListNode end = null;
        for (ListNode node = head;node!=null;node = node.next){
            size++;
            //得到我们的最后一个元素;
            if (node.next == null)
                end = node;
        }
        k = k%size;
        ListNode cut = head;
        //将我们的队列从size - k的位置分为左右两边;
        for (int i = 0;i < size - k;i++){
            cut = cut.next;
        }
        //这个start就是新的头节点
        ListNode start = cut.next;
        cut.next = null;
        end.next = head;
        return start;
    }
}
