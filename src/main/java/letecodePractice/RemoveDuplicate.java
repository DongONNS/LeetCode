package letecodePractice;

public class RemoveDuplicate {
    public int removeDuplicate(int[] nums){
        int j = 1,count = 1;//初始化计数器和第二指针
        //从数组的第二个元素开始处理并且逐个处理元素
        for (int i = 1;i < nums.length;i++){
            //如果当前元素是一个重复元素，增加数量
            if (nums[i] == nums[i-1]) count++;
            else  count = 1;
            if (count <= 2) nums[j++] = nums[i];
        }
        return j;
    }



//    public int removeDuplicates(int[] nums){
//        int i = 1,count = 1,length = nums.length;
//        //从第二个元素开始逐个元素处理数组
//        while(i < length){
//            if (nums[i] == nums[i-1]){
//                count++;
//                if (count > 2){
//                    this.remElement(nums,i);
//                    i--;
//                    length--;
//                }
//            }else{
//                count = 1;//重写开始元素计数;
//            }
//            i++;
//        }
//        return length;
//    }
//    //删除数组中的指定位置元素
//    public int[] remElement(int[] arr,int index){
//        for (int i = index;i < arr.length;i++){
//            arr[i-1] = arr[i];
//        }
//        return arr;
//    }
}
