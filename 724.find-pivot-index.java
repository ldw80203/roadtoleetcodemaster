/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        int x = 0;
        while(x < nums.length){
            int sum = 0;
            int sum1 = 0;
            for(int i = x-1;i >= 0;i--){
                sum1 += nums[i];
            }
            for(int j = x + 1;j < nums.length;j++){
                sum += nums[j];
            }
            if(x == 0 && sum == 0){
                return 0;
            }
            else if(x == nums.length - 1 && sum1 == 0){
                return nums.length-1;
            }
            if(sum1 == sum){
                return x;
            }
            x++;
        }
        return -1;
    }
}
// @lc code=end

