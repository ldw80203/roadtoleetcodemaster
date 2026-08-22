/*
 * @lc app=leetcode id=81 lang=java
 *
 * [81] Search in Rotated Sorted Array II
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(right >= left){
            int m = (left +  right) / 2;
            if(nums[m] == target){
                return true;
            }
            if(nums[m] == nums[left] && nums[m] == nums[right]){
                left += 1;
                right -= 1;
                continue;
            }
            if(nums[m] >= nums[left]){
                if(target < nums[m] && target >= nums[left]){
                    right = m - 1;
                }
                else{
                    left = m + 1;
                }
            }
            else if(nums[m] <= nums[right]){
                if(target > nums[m] && target <= nums[right]){
                    left = m + 1;
                }
                else{
                    right = m - 1;
                }
            }
        }
        return false;
    }
}
// @lc code=end

