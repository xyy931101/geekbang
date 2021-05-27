package week7;

/**
 * 461. 汉明距离
 * @author: xiongyayun
 * @date: 2021/5/27 9:41 下午
 */
public class HammingDistance461 {

    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int res = 0;
        while (xor != 0) {
            if (xor % 2 != 0) {
                res++;
            }
            xor = xor / 2;
        }
        return res;
    }
}
