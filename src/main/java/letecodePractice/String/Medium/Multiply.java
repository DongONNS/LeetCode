package letecodePractice.String.Medium;

public class Multiply {
    public String multiply(String num1,String num2){
        if(num1.equals("") || num2.equals("")) return "0";
        //用于存储计算结果
        String res = "";
        //num2 逐位与num1相乘
        for (int i = num2.length() - 1;i>=0;i--){
            int carry = 0;
            StringBuilder temp = new StringBuilder();

            //补0
            for (int j =0;j<num2.length()-1-i;j++){
                temp.append(0);
            }
            int n2 = num2.charAt(i) - '0';
            //num2 的第i 位数字n2 与num1相乘
            for (int j = num1.length()-1;j>0 || carry != 0;j--){
                int n1 = j < 0 ? 0:num1.charAt(j) - '0';
                int product = (n1 * n2 + carry) % 10;
                temp.append(product);
                carry = (n1 * n2 + carry) / 10;
            }
            //将当前结果与新计算的结果求和作为新的结果
            res = addStrings(res,temp.reverse().toString());
        }
        return res;
    }
    public String addStrings(String num1,String num2){
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        for (int i = num1.length()-1,j = num2.length()-1;i >= 0 || j >= 0 || carry!=0;i--,j--){
            int x = i<0?0:num1.charAt(i) - '0';
            int y = j<0?0:num2.charAt(j) - '0';
            int sum = (x + y + carry) % 10;
            builder.append(sum);
            carry = (x + y + carry) / 10;

        }
        return builder.reverse().toString();
    }
}
