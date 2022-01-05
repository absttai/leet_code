package Solution01;

import java.util.HashSet;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 * <p>
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 * @author Regesi
 * @date 2021/12/30 22:49
 **/
public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 5};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> newArray = new HashSet<>();
        for (int num : nums) {
            if (!newArray.add(num)) {
                return true;
            }
        }
        return false;
    }
}
