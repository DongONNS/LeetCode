package letecodePractice;

public class GenerateMatrix {
    public static void main(String[] args) {
        int n = 3;
        int[][] ints = generateMatrix(n);
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                System.out.print(ints[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n){
        int left = 0,right = n-1,top = 0,bottom =n-1;
        int[][] nums = new int[n][n];
        int num = 1,sum = n*n;
        while(num <= sum){
            for (int i = left;i <= right;i++) nums[top][i] = num++;
            top++;
            for (int i = top;i <= bottom;i++) nums[i][right] = num++;
            right--;
            for (int i = right;i >= left;i--) nums[bottom][i] = num++;
            bottom--;
            for (int i = bottom;i >= top;i--) nums[i][left] = num++;
            left++;
        }
        return nums;
    }
}
