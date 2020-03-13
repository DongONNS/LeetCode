package letecodePractice;

import java.util.Arrays;

public class IsAngram {
    public boolean isAngram(String s,String t){
        if (s.length()!=t.length()) return false;
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1,chars2);
    }
}
