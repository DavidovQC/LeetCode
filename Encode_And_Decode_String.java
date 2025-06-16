
import java.util.ArrayList;
import java.util.List;

class Solution{

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";

        StringBuilder encodedString = new StringBuilder();
        for(String str : strs){
            encodedString.append(String.valueOf(str.length()) + "#");
            encodedString.append(str);
        }

        String finalString = encodedString.toString();
        return finalString;
    }

    public List<String> decode(String str) {
        if(str == null || str.length() == 0){
        ArrayList<String> list = new ArrayList<>();
        return list;
        }

        ArrayList<String> list = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            StringBuilder word = new StringBuilder();
            j++;

            int end = j + length;
            while(j < end){
                word.append(str.charAt(j));
                j++;
            }
            list.add(word.toString());
            i = j;
        }

        return list;
    }
}
