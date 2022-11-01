import java.util.*;

class MaximumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        maximumInArray(n, arr);
    }
    
    // 1st Approach (TC=O(n), SC=O(1))
    public static void maximumInArray(int n, int[] arr) {
        int max = arr[0];
        for(int i=0; i<n; i++) {
            if(arr[i]>=max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }


    // 2nd Approach (TC=O(n), SC=O(1))
    // public static void maximumInArray(int n, int[] arr) {
    //     int max = Arrays.stream(arr).max().getAsInt();
    //     System.out.println(max);
    // }

    // 3rd Approach (TC=O(n logn), SC=O(1))
    // public static void maximumInArray(int n, int[] arr) {
    //     Arrays.sort(arr);
    //     System.out.println(arr[n-1]);
    // }


    //Using Collections 
    // public static void maximumInArray(int n, int[] arr) {
    //     List<Integer> list = new ArrayList<>();
    //     for(int i=0; i<n; i++) {
    //         list.add(arr[i]);
    //     }
    //     System.out.println(Collections.max(list));
    // }
}
