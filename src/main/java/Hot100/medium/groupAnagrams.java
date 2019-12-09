package Hot100.medium;

import java.util.*;

public class groupAnagrams{
    public static void main(String[] args) {
        String[] strs = {"abc","bca","abf","fbc"};
        List<List<String>> list = groupAnagrams(strs);
        System.out.println(list);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList();
        Map<String,List> ans = new HashMap<String,List>();
        for(String s:strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if(!ans.containsKey(key)) ans.put(key,new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
