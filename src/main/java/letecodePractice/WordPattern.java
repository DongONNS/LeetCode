package letecodePractice;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String string = "dog cat cat dog";
        boolean result = wordPattern(pattern, string);
        System.out.println(result);
    }
    public boolean wordPattern(String pattern,String string){
        String[] strArr = string.split(" ");
        if (pattern.length() != strArr.length) return false;
        for(int i=0;i < pattern.length();i++){
            if (pattern.indexOf(pattern.charAt(i)) != indexOf(strArr,strArr[i]))
                return false;
        }
        return true;
    }

    public static int indexOf(String[] arr,String searchString){
        int ans = -1;
        for(int i=0;i < arr.length;i++){
            if (arr[i].equals(searchString)){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
