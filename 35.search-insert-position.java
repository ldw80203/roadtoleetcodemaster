/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        if (nums[i] > target){
            return i;
        }
        else if(nums[j] < target){
            return j + 1;
        }
        while(i <= j){
            int m = (i+j)/2;
            if(nums[m] == target){
                return m;
            }
            else if(nums[m] > target){
                j = m - 1;
            }
            else if(nums[m] < target){
                i = m + 1;   
            }
            
        }
         return i;
    }
}
// @lc code=end

