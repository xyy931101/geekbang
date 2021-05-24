package week7;

/**
 * 231. 2的幂
 * @author: xiongyayun
 * @date: 2021/5/24 10:44 下午
 */
public class PowerOfTwo231 {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
