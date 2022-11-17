import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);   //first of all we have to sort the array
        wave(n, arr);
    }
    
    public static void wave(int n, int[] arr) {
        for(int i=0; i<n-1; i=i+2) {
            swap(arr, i, i+1);
        }
        
        for(int i: arr) {
            System.out.print(i+" ");
        }
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}