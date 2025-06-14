
import java.util.HashSet;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        HashSet<Character> left = new HashSet<>();
        left.add('{');
        left.add('(');
        left.add('[');

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(left.contains(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            
            else {
                if(stack.isEmpty()) return false;
                switch (s.charAt(i)){
                    case '}':
                    if(stack.pop() != '{') return false;
                    break;
                    case ')':
                    if(stack.pop() != '(') return false;
                    break;
                    case ']':
                    if(stack.pop() != '[') return false;
                    break;
                }
            }
        }

        return stack.isEmpty();

    }
}
