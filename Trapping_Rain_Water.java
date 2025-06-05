class Solution {
    public int trap(int[] height) {
        int[] leftHighest = new int[height.length];
        int[] rightHighest = new int[height.length];

        int currLeftMax = 0;
        int currRightMax = 0;

        for(int i = 0; i < height.length; i++){
            leftHighest[i] = currLeftMax;
            rightHighest[height.length-1-i] = currRightMax;
            
            if(height[i] > currLeftMax){
                currLeftMax = height[i];
            }

            if(height[height.length-1 - i] > currRightMax){
                currRightMax = height[height.length-1-i];
            }
        }

        int sum = 0;
        for(int i = 0; i < height.length; i++){
            int maxWater = Math.min(leftHighest[i], rightHighest[i]) - height[i];
            if(maxWater > 0){
                sum = sum + maxWater;
            }
        }

        return sum;
    }
}
