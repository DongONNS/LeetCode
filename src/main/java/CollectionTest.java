import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionTest {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> orinSet = new HashSet<Integer>();
        Set<Integer> resSet  = new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            if(!orinSet.contains(nums1[i]))
                orinSet.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(orinSet.contains(nums2[i])){
                resSet.add(nums2[i]);
                orinSet.remove(nums2[i]);
            }
        }
        int[] arr = new int[resSet.size()];
        int count=0;
        Iterator<Integer> it = resSet.iterator();
        while(it.hasNext()){
            arr[count++]=it.next();
        }
        return arr;
    }
}
