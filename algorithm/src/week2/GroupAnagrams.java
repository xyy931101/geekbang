package week2;

import java.util.*;

/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * @Author: Xiongyy
 * @Date: 2021/4/5 14:49
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length < 1) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortStr = new String(chars);
            List<String> stringList = map.getOrDefault(sortStr, new ArrayList<>());
            stringList.add(str);
            map.put(sortStr, stringList);
        }

        return new ArrayList<>(map.values());
    }
}
