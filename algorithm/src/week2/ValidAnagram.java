package week2;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/5 14:01
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class ValidAnagram {


    /**
     * 利用hashMap,运行时间比较差
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        //如果两个字符长度不一,就不用比较了
        if (s == null || t ==null || s.length() != t.length()) {
            return false;
        }
        //t中字符出现一次就-1,s出现一次就+1
        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i), 0) + 1);
            countMap.put(t.charAt(i), countMap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int count: countMap.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 利用数组做hashMap
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram2(String s, String t) {
        //如果两个字符长度不一,就不用比较了
        if (s == null || t ==null || s.length() != t.length()) {
            return false;
        }
        //符串只包含小写字母,所以可以里面其与'a'的相差做数组下标
        int[] countArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            countArray[s.charAt(i) - 'a']++;
            countArray[t.charAt(i) - 'a']--;
        }

        for (int count: countArray) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
