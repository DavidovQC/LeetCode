class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prod = 1;
        int zeroCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
            }
            else{ 
                prod = prod * nums[i];
            }
        }

        int[] sol = new int[nums.length];

        if(zeroCount == 0){
            for(int i = 0; i < nums.length; i++){
                sol[i] = prod/nums[i];
            }
        }

        if(zeroCount == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                    sol[i] = prod;
                }
                else{
                    sol[i] = 0;
                }
            }
        }

        if(zeroCount > 1){
            for(int i = 0; i < nums.length; i++){
                sol[i] = 0;
            }
        }

        return sol;
    }
}  
