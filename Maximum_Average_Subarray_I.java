class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currMax = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < k; i++){
            currSum = currSum + nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            currMax = Math.max(currSum, currMax);
            if(i+k >= nums.length){
                break;
            }
            else{
                currSum = currSum - nums[i] + nums[i+k];
            }
         
        }
        return (double) currMax/k;
    }
}