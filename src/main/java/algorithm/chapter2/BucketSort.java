package algorithm.chapter2;

import java.util.ArrayList;

public class BucketSort {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(12);
        array.add(23);
        array.add(14);
        array.add(53);
        ArrayList<Integer> result = bucketSort(array, 3);
        for (int i=0;i<result.size();i++){
            System.out.printf("%d\t",result.get(i));
        }
    }

    /**
     * 桶排序
     * @param array 待排序的数组
     * @param bucketSize 桶中可存放的不同数据的个数
     * @return 桶排序后的结果
     */
    public static ArrayList<Integer> bucketSort(ArrayList<Integer> array,int bucketSize){
        if (array==null||array.size()<2)    return array;
        int min = array.get(0),max = array.get(0);
        for (int i = 0;i<array.size();i++){
            if (array.get(i)<min) min = array.get(i);
            if (array.get(i)>max) max = array.get(i);
        }
        int bucketCount = (max-min)/bucketSize+1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketCount);
        ArrayList<Integer> resultArr = new ArrayList<>();
        for (int i=0;i<bucketCount;i++){
            bucketArr.add(new ArrayList<>());
        }
        for (int i=0;i<array.size();i++){
            bucketArr.get((array.get(i)-min)/bucketSize).add(array.get(i));
        }
        for (int i = 0;i<bucketCount;i++){
            //如果桶内都是重复元素，那么直接网结果集中存放即可
            if(bucketSize == 1){
                for (int j = 0;j<bucketArr.get(i).size();j++){
                    resultArr.add(bucketArr.get(i).get(j));
                }
            }else{
                //如果桶的数量只有一个，说明桶中指定的数据个数太多了，每次减一增加规模;
                if (bucketCount == 1) bucketSize--;
                //将每个单独的桶中的数据拿出来进行排序，得到样本的返回结果；
                ArrayList<Integer> temp = bucketSort(bucketArr.get(i),bucketSize);
                for(int j = 0;j<temp.size();j++){
                    resultArr.add(temp.get(j));
                }
            }
        }
        return resultArr;
    }
}
