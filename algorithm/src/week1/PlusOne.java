package week1;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/3 13:24
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        if (digits == null) {
            return digits;
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            //加完1之后如果不为0，说明不存在进位
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
