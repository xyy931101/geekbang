package week1;

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 *  说明：你不能倾斜容器。
 * @Author: Xiongyy
 * @Date: 2021/4/3 9:49
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        //处理边界值
        if(height == null || height.length < 2){
            return 0;
        }
        //默认容器的容量为0
        int result = 0;
        int left = 0, right = height.length -1;

        while (left < right){
            //现有的面积与新的面积取较大的那个
            result = Math.max(result, (right - left) * Math.max(height[left], height[right]));
            //比较小的那一边需要往里面移动
            if (height[left] < height[right]) {
                left ++;
            }else {
                right --;
            }
        }

        return result;
    }

}
