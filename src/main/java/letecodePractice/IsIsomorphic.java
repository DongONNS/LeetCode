package letecodePractice;

import java.util.HashMap;

public class IsIsomorphic {
    // public boolean isIsomorphic(String s, String t) {
    // return isIsomorphicHelper(s, t) && isIsomorphicHelper(t, s);
    // }
    // private boolean isIsomorphicHelper(String s, String t) {
    //     int n = s.length();
    //     HashMap<Character, Character> map = new HashMap<>();
    //     for (int i = 0; i < n; i++) {
    //         char c1 = s.charAt(i);
    //         char c2 = t.charAt(i);
    //         if (map.containsKey(c1)) {
    //             if (map.get(c1) != c2) {
    //                 return false;
    //             }
    //         } else {
    //             map.put(c1, c2);
    //         }
    //     }
    //     return true;
    // }
    public boolean isIsomorphic(String s, String t) {
        return isIsomorphicHelper(s).equals(isIsomorphicHelper(t));
    }
    private String isIsomorphicHelper(String s) {
        int[] map = new int[128];
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            //当前字母第一次出现,赋值
            if (map[c] == 0) {
                map[c] = i + 1;
            }
            sb.append(map[c]);
        }
        return sb.toString();
    }
}
