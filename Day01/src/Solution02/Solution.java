package Solution02;

class Solution {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }

    /**
     * 动态规划解法
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        //数组长度
        int len = nums.length;
        //新数组用来存子序列的和
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            if (dp[i - 1] > 0) {
                //dp[i]表示以nums中以nums[i]结尾的最大子序列的和
                //如果为复数下一个元素与当前元素相加不能大于下一个元素，所以抛弃
                dp[i] = dp[i - 1] + nums[i];
            }else{
                dp[i]=nums[i];
            }
        }
        int res=dp[0];
        for (int i = 0; i < len; i++) {
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}