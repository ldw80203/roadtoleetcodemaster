/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int right = numbers.length - 1;
        int left = 0;
        while(right > left){
            int sum =numbers[left] + numbers[right];
            if(sum == target){
                ans[0] = left+1;
                ans[1] = right+1;
                return ans;
            }
            else if(sum > target){
                right -= 1;
            }
            else if(sum < target){
                left += 1;
            }
        }
        return ans;

    }
}
// @lc code=end

