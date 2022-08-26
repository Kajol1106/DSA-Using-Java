import java.util.*;

class Main {
    
    public static void displayData(int n, int[] arr) {
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        //displayData(N, arr);
        
        int missingCount = 0;
        int count = 0;
        for(int i=0; i<N; i++) {
            if(arr[i]<=X && missingCount<=1) 
                count++;
            else
                missingCount++;
        }
        System.out.print(count);
            
        }
        
    }
