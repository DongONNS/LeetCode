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
//    public static ListNode rotateRight(ListNode head,int k){
//        if (head == null) return null;
//        if (head.next == null) return head;
//        //将链表形成闭环;
//        ListNode end = head;
//        int size;
//        for (size = 1;end.next != null;size++)
//            end = end.next;
//        end.next = head;
//        //将我们的闭环斩断;
//        ListNode new_end = head;
//        for (int i =0;i < size - k%size -1;i++)  new_end = new_end.next;
//        ListNode start = new_end.next;
//        new_end.next = null;
//        return start;
//    }

    //写完发现似乎传递的结果不对，我们的返回的结果无法进行输出......
    //看了下官方解答，思路是一致的，但是在第一轮循环的时候，将它变成了一个闭环。

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
        end.next = head;
        k = k%size;
        ListNode cut = head;
        //将我们的队列从size - k的位置分为左右两边;
        for (int i = 0;i < size - k - 1;i++){
            cut = cut.next;
        }
        //这个start就是新的头节点
        ListNode start = cut.next;
        cut.next = null;

        return start;
    }
}
