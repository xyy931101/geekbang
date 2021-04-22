package week2;

import java.util.*;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/5 11:07
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
//        int[] ints = topKFrequentElements.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        int[] ints = topKFrequentElements.topKFrequent(new int[]{1, 1, 2}, 2);
        for(int i : ints){
//            System.out.print(i + ", ");
        }
    }


    //桶排序法
    public int[] topKFrequent(int[] nums, int k) {
        //排除边界值情况
        if (k < 1 || nums == null || nums.length < 1 || k > nums.length) {
            return new int[0];
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        //对所有元素进行出现次数的计算
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        //把出现次数作为下标(变相的作为一个出现频次的排序),同时因为可能出现相同的频次,所以要用list
        List<Integer>[] list = new List[nums.length+1];
        for(int key : countMap.keySet()){
            // 获取出现的次数作为下标
            int i = countMap.get(key);
            if(list[i] == null){
                list[i] = new ArrayList();
            }
            list[i].add(key);
        }

        int[] res = new int[k];
        int k1 = 0;
        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] != null) {
                for (int j = 0; j < list[i].size(); j++) {
                    if(k1 < k){
                        res[k1++] = list[i].get(j);
                    }
                }

            }
        }
        return res;
    }


    //根据堆排序(个人认为是相对较好的)
    public int[] topKFrequentByHeap(int[] nums, int k) {
        //排除边界值情况
        if (k < 1 || nums == null || nums.length < 1 || k > nums.length) {
            return new int[0];
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        //对所有元素进行出现次数的计算
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries = countMap.entrySet();
        //构建优先级堆
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a,b) ->{
            return b.getValue() - a.getValue();
        });

        for (Map.Entry<Integer, Integer>  entry: countMap.entrySet()) {
            queue.add(entry);
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            if (!queue.isEmpty()) {
                res[i++] = queue.remove().getKey();
            }
        }
        return res;
    }

}
