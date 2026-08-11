/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        else if(x == 0){
            return true;
        }
        int reverse = 0;
        int y = x;
        while(y != 0){
            reverse += y % 10;
            if(y > 10){
            reverse *= 10;}
            y /= 10;
        }
        if (reverse == x){
            return true;
        }
        return false;

    }
}
// @lc code=end

