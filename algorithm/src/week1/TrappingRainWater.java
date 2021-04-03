package week1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/3 13:50
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        //处理极限值
        int n = height.length;
        if (height == null || n < 3) {
            return 0;
        }
        int ans = 0, current = 0;
        Deque<Integer> stack = new LinkedList<Integer>();
        //从左往右遍历
        for (int i = 0; i < n; ++i) {
            //维护单调栈（维护）
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int left = stack.peek();
                int currWidth = i - left - 1;
                //算出往右移动的时候，能增加的容器的面积
                int currHeight = Math.min(height[left], height[i]) - height[top];
                //增加的高度(左右两边最小值)
                ans += currWidth * currHeight;
            }
            stack.push(i);
        }
        return ans;
    }

}
