import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            rotate(n, k, arr);
            System.out.println();
        }
    }
    
    public static void rotate(int n, int k, int[] arr) {
        k = k%n;                // ex., arr = [1, 2, 3] and k=1
        reverse(arr, 0, n-1);   //reverse the whole array = [3, 2, 1]
        reverse(arr, 0, k-1);   //reverse arr from 0 to k-1 = [3, 2, 1]
        reverse(arr, k, n-1);   //reverse arr from k to n-1 = [3, 1, 2]
        for(int i: arr) {
            System.out.print(i+" ");
        }
    }
    
    public static void reverse(int[] arr, int start, int end) {
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
