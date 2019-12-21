package chapter2;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] array = {34,2,57,48,1,24,97};
        countingSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 计数排序，找到数组中的最大和最小元素，建立好桶，将数据放入桶中，并记录每个桶中数据的数量，然后按从小到大复盘
     * 显然比较适合于重复元素比较多的数组
     * @param array
     * @return
     */
    public static int[] countingSort(int[] array){
        if (array.length == 0) return array;
        int bias,min = array[0],max = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min) min = array[i];
            if (array[i]>max) max = array[i];
        }
        bias = 0-min;
        int[] bucket = new int[max-min+1];
        Arrays.fill(bucket,0);
        for (int i=0;i<array.length;i++){
            bucket[array[i]+bias]++;
        }
        int index = 0,i=0;
        while(index<array.length){
            if(bucket[i]!=0){
                array[index] = i-bias;
                bucket[i]--;
                index++;
            }else   i++;

        }
        return array;
    }
}
