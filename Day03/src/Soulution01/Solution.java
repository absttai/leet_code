package Soulution01;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[] nums1 = new int[]{9,4,9,8,4};
        int[] nums2 = new int[]{4,9,5};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int item : nums1) {
            int count = map.getOrDefault(item, 0) + 1;
            map.put(item, count);
        }
        int[] newArray = new int[nums1.length];
        int index = 0;
        for (int item : nums2) {
            int count = map.getOrDefault(item, 0);
            if (count > 0) {
                newArray[index++] = item;
                count--;
                if (count > 0) {
                    map.put(item, count);
                } else {
                    map.remove(item);
                }
            }
        }
        return Arrays.copyOfRange(newArray,0,index);
    }
}