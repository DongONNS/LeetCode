package chapter2;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {2,4,6,3,1,7,2};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] shellSort(int[] array) {
        int len = array.length;
        int temp;
        int gap = len/2;
        while(gap>0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && temp < array[preIndex]) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return array;
    }
}
