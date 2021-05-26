package week7;

import javax.sound.midi.Soundbank;

/**
 * 367. 有效的完全平方数
 * @author: xiongyayun
 * @date: 2021/5/25 11:28 下午
 */
public class ValidPerfectSquare367 {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
    }

    public static boolean isPerfectSquare(int num) {
        if (num  <= 1) {
            return true;
        }
        long left = 2, right = num / 2, x, avg;
        while (left <= right){
            x = left + (right - left) / 2;
            avg = x * x;
            if (avg == num) {
                return true;
            }else if (avg > num) {
                right = x - 1;
            }else {
                left = x + 1;
            }
        }
        return false;
    }
}
