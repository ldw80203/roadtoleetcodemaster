/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(k == 1){
            double max = -10000;
            for(int i = 0;i < nums.length;i++){
                if(nums[i] > max){
                    max = nums[i];
                }
            }
            return max;
        }
        double max = 0;
        double windowavg = 0;
        for(int i = 0;i < k;i++){
            windowavg +=nums[i];
        }
        max = windowavg / k;
        for(int i = k;i < nums.length;i++){
            windowavg += nums[i] - nums[i - k];
            max = Math.max(max,windowavg / k);
        }
        return max;
    }
}
/*test case 126 TLT,the O() need to be O(n) */
// @lc code=end

