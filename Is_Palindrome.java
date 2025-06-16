class Solution{
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s == null){
            return true;
        }


        String sClean = s.replaceAll("[^a-zA-Z0-9]", "");


        int length = sClean.length();

        for(int i = 0; i < length/2; i++){
            if(Character.toLowerCase(sClean.charAt(i)) != Character.toLowerCase(sClean.charAt(length - 1 - i))){
                return false;
            }
        }

        return true;
    }
}
