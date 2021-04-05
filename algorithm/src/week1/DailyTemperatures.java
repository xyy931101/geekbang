package week1;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/4 10:46
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {
        if(T == null || T.length < 2){
            return new int[]{};
        }
        int[] res = new int[T.length];
        for (int i = 0; i < T.length - 1; i++) {
            for (int j = i + 1; j < T.length; j++) {
                if (T[i] < T[j]) {
                    res[i] = j - i;
                    break;
                }
            }
        }
        return res;
    }
}
