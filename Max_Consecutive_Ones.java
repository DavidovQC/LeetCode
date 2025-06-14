class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int pointer = 0;
        int count = 0;
        int maxCount = count;
        while(pointer < nums.length){
            if(nums[pointer] == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            }

            else{
                count = 0;
            }
            pointer++;
        }
        return maxCount;
    }
}