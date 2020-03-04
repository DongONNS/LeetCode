package letecodePractice;

public class ConvertToTitle {

    public static void main(String[] args) {
        int n = 701;
        String result = convertToTitle(n);
        System.out.println(result);
    }
    public static String convertToTitle(int n){
        char[] chars = {' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int remainder = n % 26;
            n /= 26;
            if (remainder == 0){
                remainder = 26;
                n -= 1;
            }
            sb.append(chars[remainder]);
        }
        return sb.reverse().toString();
    }
}
