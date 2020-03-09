package letecodePractice;

public class CountPrime {

    public static void main(String[] args) {
        int result = countPrimes(10);
        System.out.println(result);
    }

    public static int countPrimes(int n) {
        if (n==0 || n==1)  return 0;
        if (n==2)  return 1;
        int count = 0;
        for(int i = 2 ;i < n;i++){
            if(isPrime(i)) count++;
        }
        return count;
    }
    public static boolean isPrime(int n){
        for(int i = 2;i < n;i++){
            if(n % i == 0 ) return false;
        }
        return true;
    }
}
