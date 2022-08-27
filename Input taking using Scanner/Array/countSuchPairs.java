import java.util.*;


  class CountSuchPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        countSuchPairs(n, target, arr);
    }

    public static void countSuchPairs(int n,int target, int[] arr){
        //write your code here
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i]+arr[j] == target) {
                    count++;
                }
            }
        }
        System.out.println(count);
      }
  }