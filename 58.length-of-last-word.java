/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String trim = s.trim();
        for (int i = trim.length()-1;i >= 0;i--){
            if (trim.charAt(i) == ' '){
                break;
            }
            count += 1;
        }      
        return count;
    }
}
// @lc code=end

