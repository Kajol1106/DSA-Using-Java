import java.util.*;

public class MinimumInSortedAndRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimumInSortedArray(n, arr));
    }
    
    public static int minimumInSortedArray(int n, int[] arr) {
        int low = 0;
        int high = n-1;
        if(arr[0]<arr[high]) {
            return arr[0];
        }
        
        while(low<=high) {
            int mid = low+(high-low)/2;
            
            if(low<mid && arr[mid]<arr[mid-1]) {
                return arr[mid];
            }
            else if(high>mid && arr[mid+1]<arr[mid] ) {
                return arr[mid+1];
            }
            else if(arr[high]>arr[mid]) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }
}
