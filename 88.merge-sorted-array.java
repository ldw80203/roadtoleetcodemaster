/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0){
            for(int i = 0;i < n;i++){
                nums1[i] = nums2[i];
                return;
            }
        }
        for(int j = m;j < m + n;j++){
            nums1[j] = nums2[j-m];
        }
        for(int x = 1;x < m + n;x ++){
            int y = 1;
            while(y > 0 && nums1[y-1] > nums1[y]){
                nums1[y] = nums1[y-1];
            }
            y = y - 1;
        }

    }
}
// @lc code=end

