import java.util.*;
import java.lang.Math;

public class NearestSmallerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }
            nearestSmallerElement(n, arr);
        }
    }
    
    //Brute Force approach
    public static void nearestSmallerElement(int n, int[] arr) {
        //Nearest greater element from left side
        int[] leftIndex = new int[n];   //for store left side index
        int[] leftVal = new int[n];     //for store left side value
        
        for(int i=0; i<n; i++) {
            int leftvalue = -1;
            int currIndex = -1;
            for(int j=i-1; j>=0; j--) {
                if(arr[i]>arr[j]) {
                    leftvalue = arr[j];
                    currIndex = j;
                    break;
                }
            }
            leftVal[i] = leftvalue;
            leftIndex[i] = currIndex;
        }
        // for(int i=0; i<n; i++) {
        //     System.out.print(leftVal[i]+" ");
        //     //System.out.print(leftIndex[i]+" ");
        // }
        // System.out.println();

        //nearest greater element from right side
        int[] rightIndex = new int[n];   //for store right side index
        int[] rightVal = new int[n];     //for store right side value
        
        for(int i=0; i<n; i++) {
            int rightvalue = -1;
            int currIndex = -1;
            for(int j=i+1; j<n; j++) {
                if(arr[i]>arr[j]) {
                    rightvalue = arr[j];
                    currIndex = j;
                    break;
                }
            }
            rightVal[i] = rightvalue;
            rightIndex[i] = currIndex;
        }
        
        // for(int i=0; i<n; i++) {
        //     System.out.print(rightVal[i]+" ");
        //     //System.out.print(leftIndex[i]+" ");
        // }
        // System.out.println();

         //final solution
         int[] res = new int[n];
         for(int i=0; i<n; i++) {
             if(leftIndex[i] == rightIndex[i]) {
                 res[i] = -1;
             }
             else if(leftIndex[i] == -1) {
                 res[i] = rightVal[i];
             }
             else if(rightIndex[i] == -1) {
                 res[i] = leftVal[i];
             }
             else {
                 int l = Math.abs(i-leftIndex[i]);
                 int r = Math.abs(i-rightIndex[i]);
                 if(l>r) {
                     res[i] = rightVal[i];
                 }
                 else {
                     res[i] = leftVal[i];
                 }
             }
         }
         
         for(int i=0; i<n; i++) {
             System.out.print(res[i]+" ");
         }
         System.out.println();
     }
        
}
