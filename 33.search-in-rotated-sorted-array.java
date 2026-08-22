/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int m = (left  + right) / 2;
            if(nums[m] == target){
                return m;
            }
            if(nums[m] >= nums[left]){
                if(target < nums[m] && target >= nums[left]){
                    right = m - 1;
                }
                else{
                    left = m + 1;
                }
            }
            else if(nums[m] < nums[right]){
                if(target > nums[m] && target <= nums[right]){
                    left = m + 1;}
                else{
                    right = m - 1;
                }
            }
            

        }
        return -1;
    }
}
// @lc code=end

