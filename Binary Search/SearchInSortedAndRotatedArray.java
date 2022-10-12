import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(searchInSortedAndRotatedArray(n, k, arr));
    }
    
    public static int searchInSortedAndRotatedArray(int n, int k, int[] arr) {
        int low = 0; 
        int high = n - 1; 

        while (low<=high) { 
            int mid = (low+high) >> 1; 
            if (arr[mid]==k)
                return mid; 

            if (arr[low]<=arr[mid]) { 
                if (arr[low]<=k && arr[mid]>=k) {
                    high = mid-1; 
                }
                else {
                    low = mid+1;
                }
            } 
            else { 
                if (arr[mid]<=k&& k<=arr[high]) {
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }
        }
        return -1; 
    }
}