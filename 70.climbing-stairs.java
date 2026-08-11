/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int current = 0;
        int one = 1;
        int two = 2;
        for (int i = 3;i <= n;i++){
            current = one + two;
            one = two;
            two = current;
        }
        return current;
    }
}
// @lc code=end

