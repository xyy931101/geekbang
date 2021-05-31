package week7;

/**
 * @author: xiongyayun
 * @date: 2021/5/28 10:20 下午
 */
public class NumberOf1Bits191 {

    public static void main(String[] args) {
        System.out.println(hammingWeight(3));
    }


    public static int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            ans += (n & 1);
            n >>>= 1;
        }
        return ans;
    }
}
