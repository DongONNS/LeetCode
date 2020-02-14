package letecodePractice.math;

public class MyPow {
    public static void main(String[] args) {
        double value = myPow(3, 4);
        System.out.println(value);

    }
    public static double myPow(double x,int n){
        long N = n;
        if( N < 0){
            x = 1/x;
            N = -N;
        }
        double ans = 1;
        for (int i= 0;i<N;i++)  ans = ans * x;
        return ans;
    }
}
