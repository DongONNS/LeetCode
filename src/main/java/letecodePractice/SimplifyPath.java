package letecodePractice;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        String result = simplifyPath(path);
        System.out.println(result);
    }

    public static String simplifyPath(String path){
        String[] s= path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0;i < s.length;i++){
            if (!stack.empty() && s[i].equals(".."))
                stack.pop();
            else if (!s[i].equals("") && !s[i].equals(".") && !s.equals(".."))
                stack.push(s[i]);
        }
        if (stack.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < stack.size();i++)
            sb.append("/"+stack.get(i));
        return sb.toString();
    }
}
