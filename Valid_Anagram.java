class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null){
            if(s == null && t == null){
                return true;
            }
            else return false;
        }

        if(s.length() != t.length()){
            return false;
        }

        else{
           int[] arr = new int[26];
           for(int i = 0; i < s.length(); i++){
                arr[s.charAt(i) - 'a']++;
                arr[t.charAt(i) - 'a']--;
           }

            for(int i = 0; i < 26; i++){
                if(arr[i] != 0){
                    return false;
                }
            }
        }

        return true;
    }
}


