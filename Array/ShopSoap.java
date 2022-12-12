import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int q = sc.nextInt();
        while(q--> 0) {
            int m = sc.nextInt();
            shopSoap(m, n, arr);
        }
    }
    
    public static void shopSoap(int m, int n, int[] arr) {
        int l = 0;
        int r = n-1;
        int count = 0;
        
        //binary search
        while(l<=r) {
            int mid = (l+r)/2;
            if(arr[mid]<m) {
                count = mid+1;
                l = mid+1;
            }
            else {
                r = mid-1;
            }
        }
        System.out.println(count);
    }
}
