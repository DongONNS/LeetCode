package letecodePractice;

import org.omg.PortableInterceptor.INACTIVE;

public class GetHint {
    public static void main(String[] args) {
        String a = "1807",b = "7810";
        String result = getHint(a, b);
        System.out.println(result);
    }

    public static String getHint(String secret,String guess){
        int[] bucket = new int[10];
        int bulls = 0,cows = 0;
        for(int i = 0;i < secret.length();i++){
            if (secret.charAt(i) == guess.charAt(i)){
                bulls++;
                continue;
            }
            bucket[secret.charAt(i) - '0'] += 1;
            bucket[guess.charAt(i) - '0'] -= 1;
        }
        //计算Bucket中正值的个数,这个正值就是两者互相没有交集的数字;
        for(int i = 0;i < 10;i++){
            if (bucket[i] > 0)
                cows++;
        }
        cows = bucket.length - bulls - cows;
        String res = bulls + "A" + cows + "B";
        return res;
    }
//    public String getHint(String secret,String guess){
//        int bulls = getBulls(secret,guess);//获得公牛；
//        int cows = getCows(secret,guess);
//        return bulls+"A"+cows+"B";
//
//    }
//
//    /**
//     * 获得位置和数都对的数字的数量
//     * @param a
//     * @param b
//     * @return
//     */
//    public static int getBulls(String a,String b){
//        int bulls = 0;
//        int len = Math.min(a.length(),b.length());
//        int i = 0;
//        while(i < len){
//            if (a.charAt(i)==b.charAt(i))
//                bulls++;
//            i++;
//        }
//        return bulls;
//    }
//
//    /**
//     * 获取数字相符的数字的数量
//     * @param a
//     * @param b
//     * @return
//     */
//    public static int getCows(String a,String b){
//        int cows = 0;
//        //我没思路了.....
//        return cows;
//    }
}
