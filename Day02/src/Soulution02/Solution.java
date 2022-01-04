package Soulution02;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        while (n >= 0) {
            if (m >= 0 && (nums1[m] > nums2[n])) {
                nums1[(m + n + 1)] = nums1[m--];
            } else {
                nums1[(m + n + 1)] = nums2[n--];
            }
        }
    }
}
