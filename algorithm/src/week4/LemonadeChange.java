package week4;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/21 21:08
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class LemonadeChange {

    public static void main(String[] args) {
        LemonadeChange lc = new LemonadeChange();
        lc.lemonadeChange(new int[] {5,5,5,5,10,5,10,10,10,20});
    }

    public boolean lemonadeChange(int[] bills) {
        if (bills == null) {
            return false;
        }
        
        //先标记5跟10的个数
        int fiveCount = 0, tenCount = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fiveCount++;
            }else if (bills[i] == 10) {
                //如果钱币为
                if (fiveCount < 1) {
                    return false;
                }
                fiveCount --;
                tenCount ++;
            }else {
                //最后如果为20
                if (tenCount >= 1 && fiveCount >= 1) {
                    tenCount--;
                    fiveCount--;
                }else if (fiveCount >= 3) {
                    fiveCount = fiveCount - 3;
                }else {
                    return false;
                }

            }
        }
        return true;
    }

}
