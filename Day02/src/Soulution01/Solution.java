package Soulution01;

import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 6, 9};
        int target = 16;

        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        //新建map key为数组的值，value为数组的下标
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //如果target减去当前数组的值不存在map中说明还没有两个数相加能等于target，将当前的下标和值存入map中
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("没有答案");
    }
}