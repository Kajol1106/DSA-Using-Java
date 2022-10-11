import java.util.*;

public class NextGreaterOdd {
    //Brute Force Approach
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int j=0; j<size; j++) {
                arr[j] = sc.nextInt();
            }
            //System.out.println(nextGreaterOdd(size, arr));
            nextGreaterOdd(size, arr);
        }
    }
    
    //Brute Force Approach
    public static void nextGreaterOdd(int size, int[] arr) {
        //List l1 = new ArrayList<>();
        int[] res = new int[size];
        for(int i=0; i<size; i++) {
            int curr = -1;
            for(int j=i+1; j<size; j++) {
                if(arr[i]<arr[j]) {
                    res[i] = arr[j];
                    break;
                }
                res[i] = curr;
            }
            res[size-1] = -1;
        }
        // for(int i:res) {
        //     System.out.print(i+" ");
        // }
        
        int sum = 0;
        for(int i=0; i<size; i++) {
            if(arr[i]<res[i] && res[i]%2!=0) {
                sum += arr[i];
            }
        }
       System.out.println(sum); 
    }
}
