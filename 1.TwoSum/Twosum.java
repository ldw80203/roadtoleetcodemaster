class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] n = new int[2];
        
        for (int i = 1;i < nums.length;i++){
            for(int j = 0;j<i;j++){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    n[0]=j;
                    n[1]=i;
                    return n;
                }
            }
        }
        return n;
    }
}
/*題目：https://leetcode.com/problems/two-sum/description/
語言：Java
我的想法：用巢狀for迴圈依次相加，最內層從1開始，最外層0開始，所以會是if(nums[0]+nums[1]==target)，如果不是就往下一個數字移動，變成nums[0]+nums[2]一路匹配
我的程式碼：如上
卡住的地方：我搞不清楚內層該放0還是外層放0,一開始的答案是錯的，兩個交換就對了
錯誤訊息：
希望獲得：提示／除錯／完整解答 */