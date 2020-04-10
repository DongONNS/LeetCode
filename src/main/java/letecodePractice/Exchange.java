package letecodePractice;
//给定一个数组，讲数组中的所有奇数放在偶数前面，不要求奇偶之间的顺序;
public class Exchange {
    public int[] exchange(int[] nums) {
        int slow = 0,fast = 0;
        while(fast < nums.length){
            if((nums[fast]&1)==1){
                swap(nums,slow,fast);
                slow++;
            }
            fast++;
        }
        return nums;
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]  = nums[j];
        nums[j]  = temp;
    }
}
