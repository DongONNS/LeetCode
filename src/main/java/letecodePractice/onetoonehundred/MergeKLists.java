package letecodePractice.onetoonehundred;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists){
        int len = lists.length;
        if (len == 0) return null;
        //将n个链表以中间为对称，并用合并函数进行合并;
        while(len>1){
            for (int i=0;i<len/2;i++){
                lists[i] = mergeTwoLists(lists[i],lists[len-1-i]);
            }
            //将链表数量减半后继续合并链表;
            len = (len+1)/2;
        }
        return lists[0];
    }
    //合并两个链表，按照链表元素从小到大的顺序进行排列;
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode p = head;
        while(l1 != null && l2!=null){
            if (l1.val<l2.val){
                p.next = l1;
                l1 = l1.next;
            } else{
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return head.next;
    }
}
