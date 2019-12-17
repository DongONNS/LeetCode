import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//public class CollectionTest {

//    public int[] intersection(int[] nums1, int[] nums2) {
//        Set<Integer> orinSet = new HashSet<Integer>();
//        Set<Integer> resSet  = new HashSet<Integer>();
//        for(int i=0;i<nums1.length;i++){
//            if(!orinSet.contains(nums1[i]))
//                orinSet.add(nums1[i]);
//        }
//        for(int i=0;i<nums2.length;i++){
//            if(orinSet.contains(nums2[i])){
//                resSet.add(nums2[i]);
//                orinSet.remove(nums2[i]);
//            }
//        }
//        int[] arr = new int[resSet.size()];
//        int count=0;
//        Iterator<Integer> it = resSet.iterator();
//        while(it.hasNext()){
//            arr[count++]=it.next();
//        }
//        return arr;
//    }
//}

class CollectionTest {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,1};
        int[] intersection = intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (Integer n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer n : nums2) set2.add(n);

        set1.retainAll(set2);

        int[] output = new int[set1.size()];
        int idx = 0;
        for (int s : set1) output[idx++] = s;
        return output;
    }
}

