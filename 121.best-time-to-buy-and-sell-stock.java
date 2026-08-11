/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 1;i < prices.length;i++){
            for(int j = 0;j < i;j++){
                if(-(prices[j] - prices[i]) > max){
                    max = -(prices[j] - prices[i]);
                }
            }
        }
        if(max > 0){
            return max;
        }
        return 0;
    }
}
// @lc code=end

