import java.util.*;

class Main {
    
    //input display method
    public static void displayData(int size, int[] arr) {
        int[] res = new int[size];
        res[0] = arr[0];
        for(int i=1; i<size; i++) {
            //System.out.print(arr[i]+" ");
            res[i] = res[i-1]+arr[i];
        }
        //System.out.print(Arrays.toString(res));
        for(int i=0; i<size; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int j=0; j<size; j++) {
                arr[j] = sc.nextInt();
            }
            displayData(size, arr);
            
        }
    }
    
}
