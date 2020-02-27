package algorithm;

public class CanJump {

    //贪婪法
//    public boolean canJump(int[] nums){
//        int lastPos = nums.length - 1;
//        for (int i = nums.length-1;i >= 0;i--){
//            if (i + nums[i] >= lastPos){
//                lastPos = i;
//            }
//        }
//        return lastPos == 0;
//    }

    //1.回溯法
    public boolean canJumpFromPosition(int position,int[] nums){
        if (position == nums.length -1 ){
            return true;
        }
        int furthestJump = Math.min(position + nums[position],nums.length-1);
        for (int nextPosition = position+1 ;nextPosition <= furthestJump;nextPosition++){
            if (canJumpFromPosition(nextPosition,nums)){
                return true;
            }
        }
        return false;
    }
    public boolean canJump(int[] nums){
        return canJumpFromPosition(0,nums);
    }


}
