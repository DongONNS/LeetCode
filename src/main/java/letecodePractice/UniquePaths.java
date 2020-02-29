package letecodePractice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class UniquePaths {

    public int uniquePaths(int m, int n) throws ClassNotFoundException, NoSuchMethodException {

        int[] cur = new int[n];
        Arrays.fill(cur,1);
        for (int i = 1; i < m;i++){
            for (int j = 1; j < n; j++){
                cur[j] += cur[j-1] ;
            }
        }
        return cur[n-1];
    }
}