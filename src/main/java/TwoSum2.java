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
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
