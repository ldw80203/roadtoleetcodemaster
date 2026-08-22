/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = nums[0] + nums[1] + nums[2];
        for(int i = 0;i < nums.length;i++){
            int j = i + 1;
            int k = nums.length - 1;
            
            while(k > j){
                int sum = nums[i] + nums[j] + nums[k];
                
                if(sum < target){
                    j++;
                }
                else if(sum > target){
                    k--;
                }
                else{
                    return sum;
                }
                
                if(Math.abs(sum - target) <  Math.abs(min - target)){
                    min = sum;
                }
                
                

            }
            
        }
        return min;
    }
}
// @lc code=end

