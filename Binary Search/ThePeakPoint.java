import java.util.*;

public class ThePeakPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(thePeakPoint(n, arr));
        }
    }
    
    public static int thePeakPoint(int n, int[] arr) {
        int low = 0;
        int high = n-1;
        int mid;
        
        while(low<high) {
            mid = low+(high-low)/2;
            if(arr[mid]>=arr[mid+1]) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}
