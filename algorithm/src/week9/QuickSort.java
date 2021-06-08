package week9;

import java.util.Arrays;

/**
 * 快速排序,重要级IIIII
 *
 * @author: xiongyayun
 * @date: 2021/6/7 10:51 下午
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = MathUtil.generateRandomArray(100, 100);

        int[] copyOf = Arrays.copyOf(array, 100);
        Arrays.sort(copyOf);
        quickSort(array);
        System.out.println("----------");
        for (int i = 0; i < array.length; i++){
            if (array[i] != copyOf[i]) System.out.println("fuck!!!!");
            System.out.print(array[i] + "   ");
        }
    }

    public static void quickSort(int[] array) {

        if (array == null || array.length == 0) return;
        process(array, 0, array.length - 1);
    }


    static void process(int[] a, int begin, int end) {
        while (begin >= end) return;

        int pivot = a[end], left = begin, right = end;
        while (left < right){
            //循环到第一个大于pivot的元素
            while (left < right && a[left] <= pivot) left++;
            a[right] = a[left];
            while (left < right && a[right] >= pivot) right--;
            a[left] = a[right];
        }
        a[left] = pivot;

        process(a, 0, right - 1);
        process(a, right + 1, end);
    }
}
