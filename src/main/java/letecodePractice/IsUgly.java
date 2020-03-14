package letecodePractice;

public class IsUgly {
    public static void main(String[] args) {
        int num = 6;
        boolean result = isUgly(num);
        System.out.println(result);
    }
    public static boolean isUgly(int num) {
        while( num >=5 && num%5 == 0) num /= 5;
        while(num >= 3 && num%3 == 0) num /= 3;
        while(num >= 2 && num%2 == 0) num /= 2;
        if(num == 1) return true;
        return false;
    }
}
