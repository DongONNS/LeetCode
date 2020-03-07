package letecodePractice;

public class ReverseBits {

    public static void main(String[] args) {
        int n = 43261596;
        int ans = reverseBits(n);
        System.out.println(ans);
    }
    public static int reverseBits(int n) {
        int[] reverse = numToBinary(n);
        int result = binaryToNum(reverse);
        return result;
    }

    /**
     * 将一个整数转化成为一个含32位的数组
     * @param n
     * @return
     */
    public static int[] numToBinary(int n) {
        int[] arr = new int[32];
        int i=0;
        while (n > 0) {
            int remainder = n % 2;
            arr[i] = remainder;
            n /= 2;
            i++;
        }
        return arr;
    }

    /**
     * 将一个二进制的数组转换成为一个int整数
     * @param arr
     * @return
     */
    public static int binaryToNum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++)
            result = result * 2 + (arr[i]);
        return result;
    }
}
