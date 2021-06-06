package week8;

/**
 * 190. 颠倒二进制位
 * @author: xiongyayun
 * @date: 2021/6/6 12:11
 */
public class ReverseBits {

    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans = ans << 1;
            ans = ans + (n & 1);
            n = n >> 1;
        }
        return ans;
    }
}
