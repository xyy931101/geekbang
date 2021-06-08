package week9;

/**
 * 70. 爬楼梯
 * @author: xiongyayun
 * @date: 2021/6/8 9:15 下午
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        if (n <= 1) {
            return n;
        }
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
