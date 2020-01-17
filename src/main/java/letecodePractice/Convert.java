package letecodePractice;

import java.util.ArrayList;
import java.util.List;

public class Convert {
    public String convert(String s, int numRows) {
//        那说明没有折角
        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());
//      从0行开始，goingDown代表的含义是是向上折还是向下折;
        int curRow = 0;
        boolean goingDown = false;
//      从左往右迭代，每当到了一行的行底或行顶就进行折角
        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }
//      将这个列表转换为字符串，分两步，先是转换成StringBuilder,再将StringBuilder转换为String;
        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }
}
