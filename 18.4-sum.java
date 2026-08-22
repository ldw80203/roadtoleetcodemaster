/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start

import java.util.ArrayList;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        if(nums == null || nums.length < 4){
            return result;
        }
        for(int i = 0;i < nums.length-3;i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            for(int j = i + 1;j < nums.length-2;j++){
                int x = j + 1;
                int y = nums.length -1;
                while(y > x){
                    int sum = nums[i] + nums[j] + nums[x] + nums[y];
                    if(sum > target){
                        y--;
                    }
                    else if(sum < target){
                        j++;
                    }
                    else{
                        result.add(asList(nums[i],nums[j],nums[x],nums[y]));
                        j++;
                        while()
                    }

                }
            }
            
        }


        

    }
}
// @lc code=end

