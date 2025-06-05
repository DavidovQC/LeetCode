public class Solution {
    public int maxArea(int[] heights) {
        return helper(heights, 0, heights.length-1);
    }

    public int helper(int[] heights, int start, int end){
        if(start >= end){
            return 0;
        }
        int area = (end - start) * Math.min(heights[start], heights[end]);
        return Math.max(area, Math.max(helper(heights, start, end-1), helper(heights, start+1, end)));
    }
}


///////////////Second Solution////////////////////////////////////////////////////

// int area = (end - start) * Math.min(heights[start], heights[end]);
//         if(heights[start] < heights[end]){
//             return Math.max(area, helper(heights, start+1, end));
//         }

//         else{
//             return Math.max(area, helper(heights, start, end-1));
//         }


///////////////First Solution////////////////////////////////////////////////////



// for(int i = 0; i < heights.length; i++){
    //     for(int j = i+1; j < heights.length; j++){
    //         int curr = (j-i) * Math.min(heights[i], heights[j]);
    //         if(curr > currMax){
    //             currMax = curr;
    //         }
    //     }
    // }
 {
    
}
