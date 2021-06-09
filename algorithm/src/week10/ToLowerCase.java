package week10;

/**
 * @author: xiongyayun
 * @date: 2021/6/9 11:20 下午
 */
public class ToLowerCase {

    public String toLowerCase(String s) {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 'A' && array[i] <= 'Z') {
                array[i] += 32;
            }
        }
        return new String(array);
    }

}
