package letecodePractice.hot100.medium;
//
//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
//
//给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。

//输入："23"
//输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    public static void main(String[] args) {
        String num = "23";
        LetterCombinations lc = new LetterCombinations();
        List<String> arr = lc.letterCombination(num);
        System.out.println(arr.toString());

    }
    Map<String,String> phone = new HashMap<String,String>(){{
        put("2","abc");
        put("3","def");
        put("4","ghi");
        put("5","jkl");
        put("6","mno");
        put("7","pqrs");
        put("8","tuv");
        put("9","wxyz");
    }};
    List<String> output = new ArrayList<String>();

    public List<String> letterCombination(String digits){
        if(digits.length()!=0) backtrack("",digits);
        return output;
    }

    public void backtrack(String combination,String next_digits){
        //若是已经没有元素要检查了
        if (next_digits.length()==0){
            output.add(combination);
        }else{
            //若是还有元素需要检查
            String digit = next_digits.substring(0,1);
            String letters = phone.get(digit);
            for(int i=0;i<letters.length();i++){
                //获取对应位的
                String letter = phone.get(digit).substring(i,i+1);
                backtrack(combination+letter,next_digits.substring(1));
            }
        }
    }

}
