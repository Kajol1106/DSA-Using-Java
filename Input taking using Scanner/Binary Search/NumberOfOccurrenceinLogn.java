import java.util.*;
import java.util.Arrays;

public class NumberOfOccurrenceinLogn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        // Arrays.sort(arr);
        // for(int i=0; i<n; i++) {
        //     System.out.println(arr[i]);
        // }
        System.out.println(count(n, k, arr));
        
    }
    
    
    public static int count(int n, int k, int[] arr) {
        int res = upperBound(n, k, arr)-lowerBound(n, k, arr)+1;
        return res;
    }
    
    public static int lowerBound(int n, int k, int[] arr) {
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high) {
           int mid = low+(high-low)/2;
           if(arr[mid]==k) {
               ans = mid;
               high = mid-1;
           }
           else if(arr[mid]>k) {
               high = mid-1;
           }
           else {
               low = mid+1;
           }
        }
        return ans;
    }
    
    public static int upperBound(int n, int k, int[] arr) {
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high) {
           int mid = low+(high-low)/2;
           if(arr[mid]==k) {
               ans = mid;
               low = mid+1;
           }
           else if(arr[mid]>k) {
               high = mid-1;
           }
           else {
               low = mid+1;
           }
        }
        return ans;
    }
}
