package Hot100.medium;
/*
����ÿ�� ���� �б�����������һ���б���Ӧλ�õ�����������Ҫ�ٵȴ�����¶ȲŻ����߳������յ����������֮�󶼲������ߣ����ڸ�λ����?0 �����档

        ���磬����һ���б�?temperatures = [73, 74, 75, 71, 69, 72, 76, 73]��������Ӧ����?[1, 1, 4, 2, 1, 1, 0, 0]��

        ��ʾ������ �б��ȵķ�Χ��?[1, 30000]��ÿ�����µ�ֵ�ľ�Ϊ���϶ȣ�������?[30, 100]?��Χ�ڵ�������
*/

import java.util.Arrays;

public class WarmmerIndex {
    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(arr);
        System.out.println(Arrays.toString(result));
    }

    //ʵ��˼·�Ƚϼ򵥣����Ƕ��㵱ǰ�¶Ⱥ�����¶Ƚ��б������ҵ�һ�������λ�ã����������������±�����õ������
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
