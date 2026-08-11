/*
變體題：Two Sum Pair Count

你做過原題：1. Two Sum

題目：
給你一個整數陣列 nums 和一個整數 target。
請回傳有幾組不同的 index pair (i, j) 可以讓：

nums[i] + nums[j] == target

規則：
1. i 必須小於 j。
2. 同一個 index 不能重複使用在同一組 pair。
3. 如果 nums 裡有重複數字，只要 index 不同，就算不同 pair。

範例：
nums = [1, 2, 3, 2, 4], target = 5
合法 pair：
nums[0] + nums[4] = 1 + 4
nums[1] + nums[2] = 2 + 3
nums[2] + nums[3] = 3 + 2
return 3

練習重點：
- 巢狀迴圈
- i, j 的 index 範圍
- 不要重複算同一組 pair
*/
class Review01TwoSumPairCount {
    public int countPairs(int[] nums, int target) {
        int times = 0;
        for(int j= 1;j < nums.length;j++){
            for(int i = 0;i<j;i++ ){
                if(nums[i]+nums[j]==target){
                    times+=1;
                }
            }
        }
        return times;
    }
}
