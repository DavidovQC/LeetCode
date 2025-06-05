
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {  
        Arrays.sort(nums);
        List<List<Integer>> finalList = new ArrayList<>();

        for(int i = 0; i < nums.length-1; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            else{
                helper(nums, i + 1, nums.length - 1, -nums[i], finalList); 
            }
        }

        return finalList;

    }

    public void helper(int[] nums, int start, int end, int target, List<List<Integer>> finalList){
        if(start >= end){
            return;
        }

        if(nums[start] + nums[end] > target){
            helper(nums, start, end-1, target, finalList);
        }

        if(nums[start] + nums[end] < target){
            helper(nums, start+1, end, target, finalList);
        }

        if(nums[start] + nums[end] == target){
            List<Integer> list = new ArrayList<>();
            list.add(nums[start]);
            list.add(nums[end]);
            list.add(-target);
            finalList.add(list);

            while(start < end && nums[start] == nums[start+1]){
                start++;
            }

            while(start < end && nums[end] == nums[end-1]){
                end--;
            }

            helper(nums, start+1, end-1, target, finalList);
        }
    }
}
