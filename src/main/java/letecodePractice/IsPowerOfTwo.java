package letecodePractice;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        int n = 2048;
        boolean result = isPowerOfTwo(n);
        System.out.println(result);
    }

    public static boolean isPowerOfTwo(int n){
        return n>0&&(n&(n-1))==0;
    }
}
