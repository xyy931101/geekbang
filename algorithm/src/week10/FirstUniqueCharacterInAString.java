package week10;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xiongyayun
 * @date: 2021/6/9 11:14 下午
 */
public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) return 0;
        Map<Character, Integer> countMap = new HashMap<>(s.length());
        char[] chars = s.toCharArray();
        //先把所有的字符的出现次数统计出来
        for (char ch : chars) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        //查找出现1次的字符
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(chars[i]) == 1) return i;
        }
        return -1;
    }
}
