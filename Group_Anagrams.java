
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution{
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashSet<Integer> collected = new HashSet<>();

        for(int i=0; i < strs.length; i++){
            //If we have not yet collected strs[i] into a list
            if(!collected.contains(i)){
                List<String> currList = new ArrayList<>();

                currList.add(strs[i]);
                
                collected.add(i);
                
                for(int j = i+1; j < strs.length; j++){
                    if(isAnagram(strs[i], strs[j])){
                        currList.add(strs[j]);
                        collected.add(j);
                    }
                }
            
                list.add(currList);
            
            }
        }

        return list;
    }

    private boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
    
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
    
        return true;
    }    
}


