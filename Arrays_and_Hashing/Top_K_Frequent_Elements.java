import java.util.HashMap;
import java.util.HashSet;

class Solution{
    public int[] topKFrequent(int[] nums, int k) {

        int length = nums.length;
        
        HashMap<Integer, HashSet<Integer>> freqMap = new HashMap<>();
        HashMap<Integer, Integer> countMap = new HashMap<>();
        //count up occurences
        for(int i : nums){
            countMap.put(i, countMap.getOrDefault(i, 0)+1);
        }
        //build freqMap
        for(int i : nums){
            int freq = countMap.get(i);
            if(freqMap.containsKey(freq)){
                freqMap.get(freq).add(i);
            }
            else{
                HashSet<Integer> set = new HashSet<>();
                set.add(i);
                freqMap.put(freq, set);
            }
        }

        HashSet<Integer> finalSet = new HashSet<>();

        int counted = 0; 
        int pointer = length;
        
        while(counted < k){
            if(freqMap.containsKey(pointer)){
                finalSet.addAll(freqMap.get(pointer));
                counted = counted + freqMap.get(pointer).size();
                pointer--;
            }
            
            else{
                pointer--;
            }
        }

        int ans[] = new int[k];
        int i = 0;
        for(int s : finalSet){
            ans[i] = s;
            i++;
        }

        return ans;
      
 }
}
