package Hot100.medium;

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

    public static int[][] reconstructQueue(int[][] people) {

        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);

        LinkedList<int[]> list = new LinkedList<>();
        for (int[] i : people) {
            list.add(i[1], i);
        }

        return list.toArray(new int[list.size()][2]);
    }
}
