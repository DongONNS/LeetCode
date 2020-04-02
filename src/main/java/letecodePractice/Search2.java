package letecodePractice;

public class Search2 {
    public static void main(String[] args) {
        int[] nums = {1,3,5};
        boolean result = search(nums, 1);
        System.out.println(result);

    }
    public static boolean search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return false;
        int start = 0, end = nums.length-1;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target) return true;
            if(nums[start] == nums[mid]){
                start++;
                continue;
            }
            //前半部分有序
            if(nums[start] < nums[mid]){
                //如果目标值在前半部分
                if(nums[start] <= target && target < nums[mid]) end = mid - 1;
                else start = mid + 1;
            }else{      //后半部分有序
                if(nums[mid] < target && target <= nums[end]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return false;
    }



//    public boolean search(int[] nums, int target) {
//        if (nums == null || nums.length == 0) {
//            return false;
//        }
//        int start = 0;
//        int end = nums.length - 1;
//        int mid;
//        while (start <= end) {
//            mid = start + (end - start) / 2;
//            if (nums[mid] == target) {
//                return true;
//            }
//            if (nums[start] == nums[mid]) {
//                start++;
//                continue;
//            }
//            //前半部分有序
//            if (nums[start] < nums[mid]) {
//                //target在前半部分
//                if (nums[mid] > target && nums[start] <= target) {
//                    end = mid - 1;
//                } else {  //否则，去后半部分找
//                    start = mid + 1;
//                }
//            } else {
//                //后半部分有序
//                //target在后半部分
//                if (nums[mid] < target && nums[end] >= target) {
//                    start = mid + 1;
//                } else {  //否则，去后半部分找
//                    end = mid - 1;
//
//                }
//            }
//        }
//        //一直没找到，返回false
//        return false;
//    }
}
