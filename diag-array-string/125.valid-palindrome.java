/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 *
 * ---
 * 只看字母和數字（忽略大小寫、空白、標點），判斷 s 是否為回文。
 * 例："A man, a plan, a canal: Panama" -> true；"race a car" -> false；"" -> true
 * 用得到：Character.isLetterOrDigit(c)、Character.toLowerCase(c)
 * pattern：對撞雙指標（一個從頭、一個從尾往中間走）
 */

// @lc code=start
// 四問（不填完不准往下寫。array/string 沒有三格，用這個）
// 1. 我開了哪些變數／指標，每一個代表什麼：變數 String s1：把s轉為小寫並移除所有空白及標點，指標 i = 0 and j = s1.length() -1，i從頭開始 j 從尾巴開始，只要不相等就回false;
// 2. 迴圈不變式：每一輪開始的瞬間，什麼事情一定成立：
// 3. 迴圈條件跟邊界：< 還是 <=？從哪開始？到哪停？
// 4. 迴圈結束時，答案在哪個變數裡：

class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
        s1 = s1.trim();
        String s2 = "";
        for(int i = s1.length()-1;i >= 0;i --){
            s2 += s1.charAt(i);
        }
        boolean issame = s1.equals(s2);
        return issame;


    }
}
// @lc code=end
