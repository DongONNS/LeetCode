package letecodePractice;

public class PrintToMaxOfNDigits {
    public static void main(String[] args) {
        printToMaxOfNDigits(3);
    }
    public static void printToMaxOfNDigits(int n){
        if (n < 0) return;
        char[] nums = new char[n];
        recuresiveProductNum(0,n,nums);
    }
    public static void recuresiveProductNum(int index,int length,char[] nums){
        if (index == length){
            printNum(nums);
            return;
        }
        for(char i = '0';i <= '9';i++){
            nums[index] = i;
            recuresiveProductNum(index+1,nums.length,nums);
        }
    }
    public static void printNum(char[] nums){
        int index = 0;
        for(;index < nums.length;index++){
            if (nums[index] != '0')
                break;
        }
        for (;index < nums.length;index++){
            System.out.print(nums[index]);
        }
        System.out.println();
    }
}
