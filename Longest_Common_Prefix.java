class Solution{
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        if(strs.length == 1){
            return strs[0];
        }

        String firstString = strs[0];
        int currLeast = firstString.length();

        for(int i = 1; i < strs.length; i++){
            int currCount = 0;
            int j = 0;
            while(j < firstString.length() && j < strs[i].length()){
                if(firstString.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                currCount++;
                j++;
            }

            if(currCount < currLeast){
                currLeast = currCount;
            }
        }

        return strs[0].substring(0, currLeast);


    }
}