import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        //System.out.println(arr);
        takeOutMaximum(size, k, arr);
    }
    
    public static void takeOutMaximum(int size, int k, int[] arr) {
        int max = 0;
        int sum = 0;
        for(int i=0; i<k; i++) {
            sum += arr[i];
        }
        
        max = Math.max(sum, max);
        //System.out.println(max);
        
        for(int i=k; i<size; i++) {
            sum -= arr[i-k];
            sum += arr[i];
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}