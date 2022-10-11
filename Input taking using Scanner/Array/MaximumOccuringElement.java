import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        maximumOccuringElement(n, arr);
    }

    //TC = O(n)
    //SC = O(n)
    public static void maximumOccuringElement(int n, int[] arr) {
        //insert element in hashmap
        Map<Integer, Integer> hp = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++) {
            int key = arr[i];
            if(hp.containsKey(key)) {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else {
                hp.put(key, 1);
            }
        }
        
        //max freq
        int maxCount = 0;
        int res = -1;
        for(Entry<Integer, Integer> val : hp.entrySet()) {
            if(maxCount<val.getValue()) {
                res = val.getKey();
                maxCount = val.getValue();
            }
        }
        System.out.println(res);
    }


    //TC = O(nlogn)
    //SC = O(1)
    // public static void maximumOccuringElement(int n, int[] arr) {
    //     Arrays.sort(arr);
        
    //     int max_count = 1;
    //     int res = arr[0];
    //     int curr_count = 1;
    //     for(int i=1; i<n; i++) {
    //         if(arr[i]==arr[i-1]) curr_count++;
    //         else curr_count=1;
            
    //         if(curr_count>max_count) {
    //             max_count = curr_count;
    //             res = arr[i-1];
    //         }
    //     }
    //     System.out.println(res);
    // }


    
    //TC : n square
    //SC
    // public static void maximumOccuringElement(int n, int[] arr) {
    //     int maxcount = 0;
    //     int max_frq = 0;
    //     for(int i=0; i<n; i++) {
    //         int count = 0;
    //         for(int j=0; j<n; j++) {
    //             if(arr[i] == arr[j]) {
    //                 count++;
    //             }
    //         }
            
    //         if(count>maxcount) {
    //             maxcount = count;
    //             max_frq = arr[i];
    //         }
    //     }
    //     System.out.println(max_frq);
    // }
}