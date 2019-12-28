package letecodePractice.LinkedListType.Medium;

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
//        //ͨ������ָ���õ��м�Ľڵ�
//        ListNode fast = head.next;
//        ListNode slow = head;
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        ListNode temp = slow.next;
//        // //�ж��е����ĵ�
//        slow.next = null;
//        // //�����ָ��м�ڵ�����
//        ListNode left = sortList(head);
//        // //�����ָ��м�ڵ���ұ�
//        ListNode right = sortList(temp);
//        // �õ��鲢����ı�ͷ
//        ListNode h = new ListNode(0);
//        // //��h�����ø���res;
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