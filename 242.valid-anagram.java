/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
import java.util.Arrays;


class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int [] s2 = toint(s1);
        int [] t2 = toint(t1);
        sort(s2);
        sort(t2);
        boolean result = Arrays.equals(s2, t2);
        return result;
    }
    private int[] toint(char[] cha){
        int[] x = new int[cha.length];
        for(int i = 0;i < cha.length;i++){
            x[i] = (int)cha[i];
        }
        return x;
    }

    private void sort(int[] nums){
        for(int i = 1;i < nums.length;i++){
            int temp = nums[i];
            int j = i - 1;
            while(j >= 0  && nums[j] > temp){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }
    }
}
// @lc code=end

