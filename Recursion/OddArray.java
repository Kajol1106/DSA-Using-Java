import java.util.*;

public class OddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(0, arr);
    }
    
    public static void printArray(int index,int[] arr){
        if(index == arr.length) {
            return;
        }
        
        if(arr[index]%2 != 0) {
            System.out.println(arr[index]);
        }
        
        printArray(index+1, arr);
    }
}
