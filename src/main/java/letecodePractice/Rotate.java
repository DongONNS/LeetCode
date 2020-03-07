package letecodePractice;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }
//    public static void rotate(int[] nums,int k){
//        int temp,previous;
//        for(int i = 0;i < k;i++){
//            previous = nums[nums.length -1];
//            for(int j = 0;j < nums.length;j++){
//                temp = nums[j];
//                nums[j] = previous ;
//                previous = temp;
//            }
//        }
//    }

//    public static void rotate(int[] nums,int k){
//        k = k % nums.length;
//        int count = 0;
//        for(int start = 0;count < nums.length; start++){
//            int current = start;
//            int prev = nums[start];
//            do {
//                int next = (current + k) % nums.length;
//                int temp = nums[next];
//                nums[next] = prev;
//                prev = temp;
//                current = next;
//                count ++;
//            }while(start != current);
//
//        }
//    }

    public static void rotate(int[] nums,int k){
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public static void reverse(int[] arr,int start,int end){
        while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
        }
    }
}
