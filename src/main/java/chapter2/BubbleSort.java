package chapter2;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2,4,5,8,3,5,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] bubbleSort(int[] array){
        if (array.length == 0) return array;
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[j]<array[i]){
                    swap(array,i,j);
                }
            }
        }
        return array;
    }
    private static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
