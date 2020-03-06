package letecodePractice;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums,int k){
        int temp,previous;
        for(int i = 0;i < k;i++){
            previous = nums[nums.length -1];
            for(int j = 0;j < nums.length;j++){
                temp = nums[j];
                nums[j] = previous ;
                previous = temp;
            }
        }
    }
}
