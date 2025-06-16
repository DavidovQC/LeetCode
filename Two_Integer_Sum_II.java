class Solution{
    public int[] twoSum(int[] numbers, int target) {
        return Helper(numbers, target, 0, numbers.length-1);
    }

    public int[] Helper(int[] numbers, int target, int left, int right){
        
        if(numbers[left] + numbers[right] == target){
            int[] sol = new int[2];
            sol[0] = left+1;
            sol[1] = right+1;
            return sol;
        }

        if(numbers[left] + numbers[right] > target){
            return Helper(numbers, target, left, right-1);
        }

        if(numbers[left] + numbers[right] < target){
            return Helper(numbers, target, left+1, right);
        }

        return null;
    }
}
