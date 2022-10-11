import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }
            nextGreaterElement(n, arr);
        }
        
    }
    
    //Brute Force Approach
    public static void nextGreaterElement(int n, int[] arr) {
        int[] rightVal = new int[n];     //for store left side value
        
        for(int i=0; i<n; i++) {
            int rightvalue = -1;
            for(int j=i+1; j<n; j++) {
                if(arr[i]<arr[j]) {
                    rightvalue = arr[j];
                    break;
                }
            }
            rightVal[i] = rightvalue;
        }
        
        for(int i=0; i<n; i++) {
            System.out.print(rightVal[i]+" ");
        }
        System.out.println();
    }
}
