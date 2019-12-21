package chapter2;

public class SelectionSort {
    public static void main(String[] args) {

    }

    /**
     * 选择排序，找到数组中的最小值，放到相应的循环轮数处；
     * @param array
     * @return
     */
    public static int[] selectionSort(int[] array){
        if (array.length == 0) return array;
        for (int i=0;i<array.length;i++){
            int minIndex = i;
            //找到最小的元素的索引
            for (int j = i+1;j<array.length;j++){
                if (array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            swap(array,i,minIndex);
        }
        return array;
    }
    public static void swap(int[] array,int i,int j){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

}
