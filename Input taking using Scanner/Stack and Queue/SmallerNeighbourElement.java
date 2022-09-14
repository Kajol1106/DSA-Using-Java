import java.util.*;


public class SmallerNeighbourElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int j=0; j<n; j++) {
            arr[j] = sc.nextInt();
        }
        smallerNeighbourElement(n, arr);
    }
    
    //Brute Force Approach
    public static void smallerNeighbourElement(int n, int[] arr) {
        int[] leftVal = new int[n];     //for store left side valu
        for(int i=0; i<n; i++) {
            int leftvalue = -1;
            for(int j=i-1; j>=0; j--) {
                if(arr[i]>arr[j]) {
                    leftvalue = arr[j];
                    break;
                }
            }
            leftVal[i] = leftvalue;
        }
        
        for(int i=0; i<n; i++) {
            System.out.print(leftVal[i]+" ");
        }
    }
}
