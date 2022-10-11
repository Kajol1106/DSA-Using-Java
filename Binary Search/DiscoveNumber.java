import java.util.*;
import java.util.Arrays;

public class DiscoveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int querySize = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<querySize; i++) {
            int query = sc.nextInt();
            check(n ,arr, query);
        }
    }
    
    public static void check(int n, int[] arr, int query) {
        int li = 0;
        int hi = n-1;
        while(li<=hi) {
            int mi = (li+hi)/2;
            if(arr[mi]==query) {
                System.out.println("YES");
                return;
            }
            else if(arr[mi]<query) {
                li = mi+1;
            }
            else {
                hi = mi-1;
            }
        }
        if(li>hi) {
            System.out.println("NO");
        }
    }
}
