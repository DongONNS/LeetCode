package letecodePractice;

//给定一个数的底数和指数，计算其值，不能调用库函数
//这里使用的是快速幂的解法
public class MyPow {
    public static double myPow(double x ,int n){
        if (x == 0) return 0;
        long b = n;
        double res = 1-0;
        if (b < 0){
            b = -b;
            x = 1/x;
        }
        while(b > 0){
            if ((b&1)==1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
