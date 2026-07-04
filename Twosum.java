class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] n = new int[2];
        
        for (int i = 1;i < nums.length;i++){
            for(int j = 0;j<i;j++){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    n[0]=j;
                    n[1]=i;
                }
            }
        }
        return n;
    }
}