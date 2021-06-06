package week8;

/**
 * 231. 2 的幂
 * @author: xiongyayun
 * @date: 2021/6/6 12:09
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

}
