package letecodePractice;

public class SetZeros {
    public void setZeroes(int[][] matrix) {
        int R = matrix.length;   //行数
        int C = matrix[0].length;//列数
        //判断当前元素是否是被动改为0的；
        boolean[][] isChanged = new boolean[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                isChanged[i][j] = false;
            }
        }
        int[][] result = new int[R][C];
        for(int i = 0;i < R;i++){
            for(int j = 0;j < C;j++){
                if(!isChanged[i][j] && matrix[i][j]==0){
                    setZero(matrix,i,j);
                }
            }
        }
    }
    public void setZero(int[][] matrix,int i,int j){
        int R = matrix.length;   //行数
        int C = matrix[0].length;//列数
        for(int k = 0;k < R;k++){
            matrix[k][j] = 0;
        }
        for(int k = 0;k < C;k++){
            matrix[i][k] = 0;
        }
    }
}
