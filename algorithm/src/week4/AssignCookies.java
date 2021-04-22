package week4;

import java.util.Arrays;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/21 23:24
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class AssignCookies {

    public static void main(String[] args) {
        AssignCookies as = new AssignCookies();
        int[] ints = {87, 38, 88, 69, 4, 81, 45, 49, 65, 23};
        as.quickSort(ints, 0, 9);
        for (int i = 0; i < ints.length - 1; i++) {
            System.out.print(ints[i] + ",");
        }
    }

    public int findContentChildren(int[] g, int[] s) {
        quickSort(g, 0, g.length);
        quickSort(s, 0, s.length);
        int indexG = 0, indexS = 0, count = 0;

        while (indexG < g.length && indexS < s.length) {
            if (g[indexG] < s[indexS]) {
                count++;
                indexG++;
            }
            indexS++;
        }

        return count;
    }

    //利用快排
    private void quickSort(int[] nums, int start, int end){
        if (start >= end) {
            return;
        }

        int temp = nums[end], left = start, right = end;

        while (left < right) {
            while (left < right && nums[left] <= temp) {
                left++;
            }
            nums[right] = nums[left];

            while (left < right && nums[right] >= temp) {
                right--;
            }
            nums[left] = nums[right];
        }
        nums[left] = temp;
        quickSort(nums,  0,left - 1);
        quickSort(nums, left + 1, end);
    }
}
