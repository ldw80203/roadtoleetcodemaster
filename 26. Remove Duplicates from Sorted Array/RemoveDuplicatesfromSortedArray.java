/*題目：https://leetcode.com/problems/remove-duplicates-from-sorted-array/
語言：Java
我的想法：
我的程式碼：
卡住的地方：
錯誤訊息：
希望獲得：提示／除錯／完整解答 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1){return nums.length;}
        int i = 0;
        for (int j = 0;j < nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
