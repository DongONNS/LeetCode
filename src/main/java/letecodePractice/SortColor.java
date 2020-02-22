package letecodePractice;

public class SortColor {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[]{2,0,2,1,1,0};
        quick3Way(nums,0,nums.length-1);
        show(nums);
    }

    public static void quick3Way(int[] nums,int lo,int hi){
        if (hi <= lo) return;
        int medium = nums[lo];
        int lt = lo,gt = hi;
        int i = lo+1;
        while(i <= gt){
            if(nums[i] < medium){
                exch(nums,i++,lt++);
            }else if(nums[i] > medium){
                exch(nums,i,gt--);
            }else{
                i++;
            }
        }
         quick3Way(nums,lo,lt-1);
         quick3Way(nums,gt+1,hi);
    }
    public static void exch(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void show(int[] nums){
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}