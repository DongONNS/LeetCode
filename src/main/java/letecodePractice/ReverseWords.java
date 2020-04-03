package letecodePractice;

public class ReverseWords {
    public static void main(String[] args) {
        String string = new String(" ");
        String ans = reverseWords(string);
        System.out.println(ans);
    }    public static String reverseWords(String s){
        String string = trim(s);
        String[] strings = string.split("\\s+");
        int len = strings.length;
        StringBuilder sb = new StringBuilder();
        for (int i = len-1;i >= 0;i--){
            if (i != 0)
                sb.append(strings[i]+" ");
            else
                sb.append(strings[i]);
        }
        return sb.toString();
    }
    public static String trim(String string) {
        int len = string.length()-1;
        int start = 0,end = string.length()-1;
        while((start<len) && (string.charAt(start) ==' ')) start++;
        while((start<len) && (string.charAt(end) == ' '))  end--;
        return ((start > 0)||(end < string.length()-1))?string.substring(start,end+1):string;
    }
}
