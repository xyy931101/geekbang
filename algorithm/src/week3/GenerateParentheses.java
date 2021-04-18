package week3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * @Author: Xiongyy
 * @Date: 2021/4/16 22:52
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<List<String>> dp = new LinkedList<>();
        LinkedList<String> list0 = new LinkedList<String>();
        list0.add("");
        dp.add(list0);
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("()");
        dp.add(list1);

        for (int i = 2; i < n; i++) {
            List<String> temp = new LinkedList<>();
            for (int j = 0; j < i; j++) {
                List<String> leftRes = dp.get(j);
                List<String> rightRes = dp.get(i - j);
                //其中左边加右边能成对的
                for (String left : leftRes) {
                    //右边可能出现的字符串  也就是上面的q
                    for (String right :  rightRes) {
                        String el = "(" + left + ")" + right;
                        temp.add(el);
                    }
                }
            }
        }

        return dp.get(n);
    }
}
