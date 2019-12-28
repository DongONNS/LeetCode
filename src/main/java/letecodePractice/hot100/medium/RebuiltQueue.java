package letecodePractice.hot100.medium;

import java.util.Arrays;
import java.util.LinkedList;

public class RebuiltQueue {
    public static void main(String[] args) {
        int[][] a = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        reconstructQueue(a);
        for (int[] arr:a) {
            System.out.println(Arrays.toString(arr));
        }
    }

    /**
     * * ����˼·���������ٲ���
     * 1.������򣺰�����H�߶Ƚ���K������������
     * 2.�������������飬����K���뵽K��λ����
     *
     * ����˼�룺�߸�����վ��λ�������Ӳ��뵽Kλ���ϣ�ǰ��϶���K���߸��ӣ��������ٲ嵽ǰ��Ҳ����K��Ҫ��
     * @param people
     * @return
     */
    public static int[][] reconstructQueue(int[][] people) {

        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);

        LinkedList<int[]> list = new LinkedList<>();
        for (int[] i : people) {
            list.add(i[1], i);
        }

        return list.toArray(new int[list.size()][2]);
    }
}
