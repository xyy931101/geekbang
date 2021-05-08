package week6;

import java.util.Arrays;

/**
 * 45. 跳跃游戏 II
 * @author xiongyayun
 * @date 2021/5/7 8:24
 */
public class JumpGameII {

    public static void main(String[] args) {
        System.out.println(jump(new int[] {2,3,1,1,4}));
    }

    public static int jump(int[] nums) {
        int end = 0; //上次跳跃能到达的最大距离
        int maxPosition = 0;
        int steps = 0;
        for(int i = 0; i < nums.length - 1; i++){
            //找能跳的最远的
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if( i == end){ //遇到边界，就更新边界，并且步数加一
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
