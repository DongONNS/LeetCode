public class TwoSum2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,7,11,15};
        int[] ints = twoSum(numbers, 9);
        for (int a : ints){
            System.out.print(a+"  ");
        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i = 0;i < numbers.length;i++){
            for(int j = i+1;j < numbers.length;j++){
                if((numbers[i] + numbers[j]) == target){
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return null;
    }

    //采用双指针法实现
    public int[] twoSum2(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0,right = numbers.length-1;
        while(left < right){
            int tempSum = numbers[left] + numbers[right];
            if(tempSum == target){
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            }else if(tempSum < target)  left++;
            else right--;
        }
        return null;
    }
}
