package algorithm;

public class CanJump {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        boolean result = canJump(nums);
        System.out.println(result);
    }

    public static boolean canJump(int[] nums){
        int k = 0;
        for (int i = 0;i < nums.length; i++){
            if (i > k) return false;
            k = Math.max(k,i+nums[i]);
        }
        return true;
    }

//    //贪婪法，速度较快
//    public static boolean canJump(int[] nums){
//        int lastPos = nums.length - 1;
//        for (int i = nums.length-1;i >= 0;i--){
//            if (i + nums[i] >= lastPos){
//                lastPos = i;
//            }
//        }
//        return lastPos == 0;
//    }

    //1.回溯法,超时了
//    public boolean canJumpFromPosition(int position,int[] nums){
//        if (position == nums.length -1 ){
//            return true;
//        }
//        int furthestJump = Math.min(position + nums[position],nums.length-1);
//        for (int nextPosition = position+1 ;nextPosition <= furthestJump;nextPosition++){
//            if (canJumpFromPosition(nextPosition,nums)){
//                return true;
//            }
//        }
//        return false;
//    }
//    public boolean canJump(int[] nums){
//        return canJumpFromPosition(0,nums);
//    }


}
