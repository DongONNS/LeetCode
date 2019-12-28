package algorithm.chapter2;

public class QuickSort {
    public void quickSort(int[] arr,int low,int high){
        int index = getIndex(arr,low,high);
        quickSort(arr,0,index-1);
        quickSort(arr,index,high);
    }
    public int getIndex(int[] arr,int low,int high){
        int tmp = arr[low];
        int index = 0;
        while(low<high){
            while(low<high && arr[high]>=tmp){
                high--;
            }
            arr[low] = arr[high];
            while(low<high && arr[low]<=tmp){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = tmp;
        return low;
    }
}
