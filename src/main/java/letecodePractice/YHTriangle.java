package letecodePractice;

import java.util.ArrayList;
import java.util.List;

public class YHTriangle {
    public static void main(String[] args) {
        System.out.println(getRow(4));
    }
    public static List<Integer> getRow(Integer num){
        List<Integer> pre = new ArrayList<Integer>();
        List<Integer> cur = new ArrayList<Integer>();
        for (int i=0;i<=num;i++){
            cur = new ArrayList<Integer>();
            for (int j=0;j<=i;j++){
                if (j==0||j==i) cur.add(1);
                else cur.add(pre.get(j-1)+pre.get(j));
            }
            pre = cur;
        }
        return cur;
    }
}
