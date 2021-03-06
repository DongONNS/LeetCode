package letecodePractice.hot100.medium;
/*
根据每日 气温 列表，请重新生成一个列表，对应位置的输入是你需要再等待多久温度才会升高超过该日的天数。如果之后都不会升高，请在该位置用?0 来代替。

        例如，给定一个列表?temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是?[1, 1, 4, 2, 1, 1, 0, 0]。

        提示：气温 列表长度的范围是?[1, 30000]。每个气温的值的均为华氏度，都是在?[30, 100]?范围内的整数。
*/

import java.util.Arrays;

public class WarmmerIndex {
    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(arr);
        System.out.println(Arrays.toString(result));
    }

    //实现思路比较简单，就是对你当前温度后面的温度进行遍历，找到一个最近的位置，将他们呢两个的下标相减得到结果。
    //但是因为需要每次都遍历 所以比较耗时
    public static int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            int current = T[i];
            if (current < 100) {
                for (int j = i + 1; j < length; j++) {
                    if (T[j] > current) {
                        result[i] = j - i;
                        break;
                    }
                }
            }
        }

        return result;
    }
}
