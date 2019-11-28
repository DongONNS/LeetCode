package LinkedList.Medium;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//
//public class SortLinedList {
//    public ListNode sortList(ListNode head) {
//        if(head == null || head.next == null) return head;
//        //通过快慢指针拿到中间的节点
//        ListNode fast = head.next;
//        ListNode slow = head;
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        ListNode temp = slow.next;
//        // //切断中点后面的点
//        slow.next = null;
//        // //继续分割中间节点的左边
//        ListNode left = sortList(head);
//        // //继续分割中间节点的右边
//        ListNode right = sortList(temp);
//        // 得到归并链表的表头
//        ListNode h = new ListNode(0);
//        // //将h的引用赋给res;
//        ListNode res = h;
//
//        while(left!=null&&right!=null){
//            if(left.val<right.val){
//                h.next = left;
//                left = left.next;
//            }else{
//                h.next = right;
//                right = right.next;
//            }
//            h = h.next;
//        }
//        h.next = left!=null?left:right;
//        return res.next;
//    }
//}