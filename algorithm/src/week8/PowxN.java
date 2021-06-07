package week8;

/**
 * 50. Pow(x, n)
 * @author: xiongyayun
 * @date: 2021/6/4 11:13 下午
 */
public class PowxN {

    public double myPow(double x, int n) {
        if(x == 0.0f) return 0.0d;

        long b = n;
        double res = 1.0;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }

        while(b > 0) {
            if((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
