
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() < 2){
            return s.length();
        }

        int maxCount = 0;
        int left = 0;
        int right = 0;
        HashSet<Character> set = new HashSet<>();
        while(right < s.length()){
            int count = right - left;
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                if(count > maxCount){
                    maxCount = count;
                }
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }

        return ++maxCount;
    }
}