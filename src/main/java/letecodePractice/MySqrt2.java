package letecodePractice;
//采用牛顿迭代法求解
public class MySqrt2 {
    int s;
    public int mySqrt(int x){
        s = x;
        if (x == 0) return 0;
        return (int)sqrt(x);
    }
    public double sqrt(double x){
        double res = (x + s/x)/2;
        if (res == x) return res;
        else return sqrt(res);
    }
}
