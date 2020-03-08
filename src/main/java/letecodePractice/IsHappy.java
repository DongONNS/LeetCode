package letecodePractice;

import javax.swing.plaf.basic.BasicListUI;

public class IsHappy {
    public static void main(String[] args) {
        int n = 19;
        boolean happy = isHappy(n);
        System.out.println(happy+"");
    }

    /**
     * 试图通过递归得到结果，但是很容易栈溢出;
     * @param n
     * @return
     */
    public static boolean isHappy(int n){
        n = power(n);
        if (n == 1) return true;
        return isHappy(n);
    }
    public static int power(int k){
        int result = 0;
        while(k > 0){
            int remainder = k % 10;
            result += (remainder * remainder);
            k = k/10;
        }
        return result;
    }
}
