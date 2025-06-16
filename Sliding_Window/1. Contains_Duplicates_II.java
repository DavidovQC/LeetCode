import java.util.HashSet;

class Solution{
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length <= 1 || k == 0){
            return false;
        }
        
        int left = 0;
        HashSet<Integer> seen = new HashSet<>();

        for(int right = 0; right < nums.length; right++){
            while(right - left > k){
                seen.remove(nums[left]);
                left++;
            }

             if(!seen.add(nums[right])){
                return true;
            };
        }

        return false;
    }
}