/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for(int i = 1;i < nums.length;i++){
            for(int j = 0;j < i;j++){
                if(nums[i] + nums[j] == target){
                    sum[0] = i;
                    sum[1] = j; 
                }
            }
        }
        return sum;
    }
}
// @lc code=end

