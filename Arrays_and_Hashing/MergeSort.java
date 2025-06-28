class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public static void mergeSort(int[] nums, int left, int right){
        if(left >= right){
            return;
        }

        int mid = (left+right)/2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid+1, right);

        merge(nums, left, mid, right);
    }

    public static void merge(int[] nums, int left, int mid, int right){
        int p1 = left;
        int p2 = mid+1;
        int index = 0;
        int[] temp = new int[right-left+1];

        while(p1 <= mid && p2 <= right){
            temp[index++] = (nums[p1] <= nums[p2]) ? nums[p1++] : nums[p2++];
        }

        while(p1 <= mid){
            temp[index++] = nums[p1++];
        }

        while(p2 <= right){
            temp[index++] = nums[p2++];
        }

        for(int i = left; i <= right; i++){
            nums[i] = temp[i-left];
        }
    }
}
