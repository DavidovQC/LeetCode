// // "static void main" must be defined in a public class.
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {12, 3, 3, 3, 9, 2};
//         printArr(selectionSort(arr));
//     }
    
//     public static int[] selectionSort(int[] nums){
//         for(int i = 0; i < nums.length; i++){
//             int min = i;
//             for(int j = i+1; j < nums.length; j++){
//                 if(nums[j] < nums[min]){
//                     min = j;
//                 }
//             }
//             int temp = nums[i];
//             nums[i] = nums[min];
//             nums[min] = temp;
//         }
        
//         return nums;
//     }
    
//     public static void printArr(int[] nums){
//         for(int i = 0; i < nums.length; i++){
//             System.out.println(nums[i]);
//         }
//     }
// }

// //runs perfectly. Static methods depend on the instance of an object -- non-static methods do not.