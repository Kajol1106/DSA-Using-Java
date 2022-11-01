import java.util.*;

class MinimumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        maximumInArray(n, arr);
    }
    
    1st Approach (TC=O(n), SC=O(1))
    public static void maximumInArray(int n, int[] arr) {
        int min = arr[0];
        for(int i=0; i<n; i++) {
            if(arr[i]<=min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    // 2nd Approach (TC=O(n), SC=O(1))
    // public static void maximumInArray(int n, int[] arr) {
    //     int min = Arrays.stream(arr).min().getAsInt();
    //     System.out.println(min);
    // }

    // 3rd Approach (TC=O(n logn), SC=O(1))
    // public static void maximumInArray(int n, int[] arr) {
    //     Arrays.sort(arr);
    //     System.out.println(arr[0]);
    // }

    // Using Collection
    // public static void maximumInArray(int n, int[] arr) {
    //     List<Integer> list = new ArrayList<>();
    //     for(int i=0; i<n; i++) {
    //          list.add(arr[i]);
    //      }
    //      System.out.println(Collections.min(list));
    // }
}
