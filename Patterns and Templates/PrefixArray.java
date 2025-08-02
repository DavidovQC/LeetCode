// "static void main" must be defined in a public class.
public class PrefixArray {
    public static void main(String[] args) {
        int[] arr = {3, 9, 13, -2};
        print(arr);
        print(makePreArr(arr));
        print(makePostArr(arr));
    }
    
    public static int[] makePreArr(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        
        return prefix;
    }
    
    public static int[] makePostArr(int[] arr){
        int[] postfix = new int[arr.length];
        postfix[arr.length-1] = arr[arr.length-1];
        
        for(int i = arr.length-2; i >= 0; i--){
            postfix[i] = postfix[i+1] + arr[i];
        }
        
        return postfix;
    }
    
    public static void print(int[] arr){
        for(int x : arr){
            System.out.print(x);
            System.out.print(", ");
        }
        
        System.out.println("");
    }
}