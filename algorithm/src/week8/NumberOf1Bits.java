package week8;

/**
 * 191. 位1的个数
 * @author: xiongyayun
 * @date: 2021/6/6 12:08
 */
public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0){
            ans = ans + (n & 1);
            n = n >>> 1;
        }
        return ans;
    }
}
