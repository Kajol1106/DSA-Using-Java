import java.util.*;

public class BinarySearchIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        binarySearch(n, k, arr);
    }
    
    public static void binarySearch(int n, int k, int[] arr) {
        int li = 0;
        int hi = n-1;
        while(li<=hi) {
            int mi = (li+hi)/2;
            if(arr[mi]==k) {
                System.out.println("1");
                return;
            }
            else if(arr[mi]<k) {
                li = mi+1;
            }
            else {
                hi = mi-1;
            }
        }
        if(li>hi) {
            System.out.println("-1");
        }
    }
}
