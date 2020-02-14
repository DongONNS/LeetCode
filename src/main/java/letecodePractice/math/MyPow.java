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

class FastPow{
    private double fastPow(double x,long n){
        if (n == 0) return 1.0;
        double half = fastPow(x,n/2);
        if (n % 2 == 0) return half * half;
        else return half*half*x;
    }

    public double myPow(double x,int n){
        long N = n;
        if (N < 0){
            N = -N;
            x = 1/x;
        }
        return fastPow(x,N);
    }
}
