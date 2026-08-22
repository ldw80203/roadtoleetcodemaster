/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int num : nums){
            if(k < 2 || num != nums[k - 2]){
                nums[k] = num;
                k++;
            }
        }
        return k;
    }
}
// @lc code=end

