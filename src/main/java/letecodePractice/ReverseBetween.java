package letecodePractice;

public class ReverseBetween {
    private boolean stop;
    private ListNode left;

    public ListNode reverseBetween(ListNode head,int m,int n){
        this.left = head;
        this.stop = false;
        recurseAndReverse(head,m,n);
        return head;
    }
    public void recurseAndReverse(ListNode right,int m,int n){
        //递归的终止条件
        if (n == 1) return;
        //继续向前移动右指针，直到n==1为止
        right = right.next;
        //继续向前移动左指针，直到我们的m==1为止
        if (m > 1) this.left = this.left.next;

        this.recurseAndReverse(right,m-1,n-1);
        //当两个指针互相穿过或者两者相等的时候，我们就停止数据的交换
        if (this.left == right || right.next == this.left)
            this.stop = true;
        //交换两个指针指向区域的数据
        if (!this.stop){
            int t = this.left.val;
            //将左指针向右移动一步
            //我们的右指针的向左移动是通过回溯实现的
            this.left.val = right.val;
            right.val = t;
            this.left = this.left.next;
        }
    }
}
