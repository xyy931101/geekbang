package week4;

import java.util.Arrays;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/21 23:24
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int indexG = 0, indexS = 0, count = 0;

        while (indexG < g.length && indexS < s.length) {
            if (g[indexG] < s[indexS]) {
                count++;
                indexG++;
            }
            indexS++;
        }

        return count;
    }
}
