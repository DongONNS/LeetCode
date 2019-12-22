package chapter3;

public class OrderSearch {
    public static void main(String[] args) {
        int[] array = {1,3,8,2,9,4};
        int index = orderSearch(array, 3);
        System.out.println(index);

    }
    public static int orderSearch(int[] array,int key){
        int index = -1;
        for (int i=0;i<array.length;i++){
            if (array[i] == key){
                index = i;
            }
        }
        return index;
    }
}
