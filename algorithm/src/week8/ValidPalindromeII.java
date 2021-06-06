package week8;

/**
 * 680. 验证回文字符串 Ⅱ
 * @author: xiongyayun
 * @date: 2021/6/5 17:35
 */
public class ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return validPalindrome(s, left, right - 1) || validPalindrome(s, left + 1, right);
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean validPalindrome (String s, int left, int right){
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}


