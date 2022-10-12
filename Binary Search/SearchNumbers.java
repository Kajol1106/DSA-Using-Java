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
        // for(int i=0; i<n; i++) {
        //     System.out.println(arr[i]);
        // }
        int k = sc.nextInt();
        for(int i=0; i<k; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.print(countNumbers(n, arr, l, r)+" ");
        }
    }
    
    public static int countNumbers(int n, int[] arr, int l, int r) {
        int count = 0;
        count = higherIndex(n, arr, r)-lowIndex(n, arr, l)+1;
        return count;
    }
    
    public static int lowIndex(int n, int[] arr, int x) {
        int l = 0;
        int h= n-1;
        while(l<=h) {
            int mid = (l+h)/2;
            if(arr[mid]>=x) {
                h = mid-1;
            }
            else {
                l = mid+1;
            }
        }
        return l;
    }

    public static int higherIndex(int n, int[] arr, int y) {
        int l = 0;
        int h= n-1;
        while(l<=h) {
            int mid = (l+h)/2;
            if(arr[mid]<=y) {
                l = mid+1;
            }
            else {
                h = mid-1;
            }
        }
        return h;
    }
}