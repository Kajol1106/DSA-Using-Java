import java.util.*;

class allTwiceExceptOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int N = sc.nextInt();
            int size = 2*N-1;
            int[] arr = new int[size];
            for(int j=0; j<size; j++) {
                arr[j] = sc.nextInt();
            }
            //displayData(size, arr);
            System.out.println(allTwiceExceptOne(size, arr));
        }
    }
    
    public static void displayData(int size, int[] arr) {
        //System.out.println(size);
        for(int i=0; i<size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static int allTwiceExceptOne(int size, int[] arr) {
        int res = arr[0];
        for(int i=1; i<size; i++) {
            res = res^arr[i];
        }
        return res;
    }
}