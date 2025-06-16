
import java.util.HashSet;

class Solution{
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        int currLargest = 1;

        for(int elt : nums){
            if(!(set.contains(elt-1))){
                int currCount = 1;
                int pointer = elt;

                while(set.contains(pointer+1)){
                    currCount++;
                    pointer++;
                }
                if(currCount > currLargest){
                    currLargest = currCount;
                }
            }
        }

        return currLargest;

    }
}
