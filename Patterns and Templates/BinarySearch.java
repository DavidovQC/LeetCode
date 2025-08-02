// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 17, 22, 33};
        int pick = 7;
        System.out.println(binarySearch(arr, pick, 0, arr.length-1));
        printArr(arr);
        for(int i = 0; i < 33; i++){
            System.out.println("ceil(" + String.valueOf(i) + ")" + " = " + ceil(arr, i, 0, arr.length-1));
            System.out.println("floor(" + String.valueOf(i) + ")" + " = " + floor(arr, i, 0, arr.length-1));
            System.out.println();
        }

        System.out.println(floor(arr, pick, 0, arr.length-1));
    }
    
    public static boolean binarySearch(int[] arr, int target, int left, int right){
        if(right < left){
            return false;
        }
        
        int mid = (left+right)/2;
        
        if(arr[mid] == target){
            return true;
        } else if(arr[mid] < target){
            return binarySearch(arr, target, mid+1, right);
        } else{
            return binarySearch(arr, target, left, mid-1);
        }
    }
    
    public static int ceil(int[] arr, int target, int left, int right){
        // int last = arr.length-1;
        // if(target > arr[last]) return -1;
        
        if(right <= left){
            return arr[right];
        }
        
        int mid = (left+right)/2;
        
        if(arr[mid] == target) return arr[mid];
        else if(arr[mid] < target){
            return ceil(arr, target, mid+1, right);
        } else{//arr[mid] > target, arr[mid] is a possible candidate
            if(arr[mid-1] < target) return arr[mid];
            //arr[mid] is not a possible candidate, so:
            else return ceil(arr, target, left, mid-1);
        }
    }
    
    public static int floor(int[] arr, int target, int left, int right){
        if(right <= left){
            return arr[left];
        }
        
        int mid = (left+right)/2;
        
        if(arr[mid] == target) return arr[mid];
        if(target < arr[mid]){
            return floor(arr, target, left, mid-1);
        } else{ //target > arr[mid], arr[mid] is a candidate
            if(arr[mid+1] > target) return arr[mid];
            else return floor(arr, target, mid+1, right);
        }
    }
    
    public static void printArr(int[] arr){
        for(int x : arr){
            System.out.print(x + ", ");
        }
        System.out.println();
        System.out.println();
    }    

}