package week4;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/23 0:15
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class Sqrtx {


    public static void main(String[] args) {
        Sqrtx s = new Sqrtx();
        System.out.println(s.mySqrt(8));
    }

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 0, right = x, res = -1;

        while (left <= right) {
            int temp = left + (right - left) / 2;
            if ((long)temp * temp <= x) {
                res = temp;
                left = temp + 1;
            }else {
                right = temp - 1;
            }
        }
        return res;
    }
}
