package letecodePractice;

public class MySqrt {
    public static void main(String[] args) {
        int ans = mySqrt(9);
        System.out.println(ans);
    }
    public static int mySqrt(int x){
        if (x == 0) return 0;
        long left = 1,right = x/2;
        while(left < right){
            //这里是右中点，如果是左中点的话可能会陷入死循环
            long mid = (left + right + 1)/2;
            long square = mid * mid;
            if (square > x) right = mid - 1;
            else left = mid;
        }
        //这里注意返回的是left，而不是right，如果你的x为1的时候，left = 1,right = 0;
        return (int)left;
    }
}
