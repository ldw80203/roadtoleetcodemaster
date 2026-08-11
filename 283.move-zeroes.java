
import java.util.function.IntUnaryOperator;

/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
/*用insertion sort排序，不過小的放後面(錯誤版本，題目要求0往後但保持原本數字的順序所以用insertion順序會亂)
解法：把insertion做改變，本來判斷式是nums[j]>temp改成nums[j] == 0*/
class Solution {
    public void moveZeroes(int[] nums) {
        sort(nums);
    }
    private void sort(int[] nums){
        for(int i = 1;i < nums.length;i++){
            int temp = nums[i];
            int j = i - 1;
            while(j >= 0  && nums[j] == 0){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }
    }
}
// @lc code=end

