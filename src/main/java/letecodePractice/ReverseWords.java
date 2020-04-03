package letecodePractice;

import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        String string = new String(" hello world! ");
        String ans = reverseWords(string);
        System.out.println(ans);
    }
//    public static String reverseWords(String s){
//        String string = trim(s);
//        String[] strings = string.split("\\s+");
//        int len = strings.length;
//        StringBuilder sb = new StringBuilder();
//        for (int i = len-1;i >= 0;i--){
//            if (i != 0)
//                sb.append(strings[i]+" ");
//            else
//                sb.append(strings[i]);
//        }
//        return sb.toString();
//    }
//    public static String trim(String string) {
//        int len = string.length()-1;
//        int start = 0,end = string.length()-1;
//        while((start<len) && (string.charAt(start) ==' ')) start++;
//        while((start<len) && (string.charAt(end) == ' '))  end--;
//        return ((start > 0)||(end < string.length()-1))?string.substring(start,end+1):string;
//    }


//    解法2
//    public static String reverseWords(String s){
//        s = s.trim();
//        List<String> wordList = Arrays.asList(s.split("\\s+"));
//        Collections.reverse(wordList);
//        return String.join(" ",wordList);
//    }

//    解法3
    public static String reverseWords(String s) {
        int left = 0, right = s.length() - 1;
        // remove leading spaces
        while (left <= right && s.charAt(left) == ' ') ++left;

        // remove trailing spaces
        while (left <= right && s.charAt(right) == ' ') --right;

        Deque<String> d = new ArrayDeque();
        StringBuilder word = new StringBuilder();
        // push word by word in front of deque
        while (left <= right) {
            char c = s.charAt(left);

            if ((word.length() != 0) && (c == ' ')) {
                d.offerFirst(word.toString());
                word.setLength(0);
            } else if (c != ' ') {
                word.append(c);
            }
            ++left;
        }
        d.offerFirst(word.toString());

        return String.join(" ", d);
    }
}
