package letecodePractice;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix){
        List ans = new ArrayList();
        if (matrix.length == 0) return ans;
        int C = matrix[0].length;//列数
        int R = matrix.length;//行数
        int[] dr = {0,1,0,-1};//行的变化
        int[] dc = {1,0,-1,0};//列的变化
        boolean[][] seen = new boolean[R][C];
        int r = 0,c = 0,di = 0;
        for (int i = 0;i < R*C; i++){
            ans.add(matrix[r][c]);
            seen[r][c] = true;
            int cr = r + dr[di];
            int cc = c + dc[di];
            //如果没有发生越界，那么就继续按着原来的方向前进
            if (cr>=0 && cr < R && cc >=0 && cc < C && !seen[cr][cc]){
                r = cr;
                c = cc;
            } else{
            //如果数组发生了越界的行为，那么就按照从左至右 从上至下 从右至左 从下至上的顺序进行数组的遍历
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }
        return ans;
    }
}
