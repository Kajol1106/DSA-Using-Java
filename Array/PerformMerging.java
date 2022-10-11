import java.util.*;

public class PerformMerging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }
        
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++) {
            arr2[i] = sc.nextInt();
        }
        performMerging(n, arr1, arr2);
    }


    //Using inbuilt sort function   (3)
    public static void performMerging(int n, int[] arr1, int[] arr2) {
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<n; i++) {
            res.add(arr1[i]);
        }
        for(int i=0; i<n; i++) {
            res.add(arr2[i]);
        }
        
        Collections.sort(res);
        res.forEach(el -> System.out.print(el+" "));

    }

    /* 
     //Using inbuilt sort function  (2)
     public static void performMerging(int n, int[] arr1, int[] arr2) {
        
        int[] res = new int[n*2];
        for(int i=0; i<n; i++) {
            res[i] = arr1[i];
        }
        for(int i=0; i<n; i++) {
            res[n+i] = arr2[i];
        }
        
        Arrays.sort(res);
        
        for(int i=0; i<n*2; i++) {
            System.out.print(res[i]+" ");
        }
    }
    */

    /* 
    //Brute force approach  (1)
     public static void performMerging(int n, int[] arr1, int[] arr2) {
        
        int[] res = new int[n*2];
        for(int i=0; i<n; i++) {
            res[i] = arr1[i];
        }
        for(int i=0; i<n; i++) {
            res[n+i] = arr2[i];
        }
        
        for(int i=0; i<n*2; i++) {
            for(int j=i+1; j<n*2; j++) {
                int temp = 0;
                if(res[j]<res[i]) {
                    temp = res[j];
                    res[j] = res[i];
                    res[i] = temp;
                }
            }
        }
        
        for(int i=0; i<n*2; i++) {
            System.out.print(res[i]+" ");
        }
    }
    */



    /*
     //Using inbuilt Collection sort function print array in descending order
     //import java.util.Collections;
    public static void performMerging(int n, int[] arr1, int[] arr2) {
        
        Integer[] res = new Integer[n*2];
        for(int i=0; i<n; i++) {
            res[i] = arr1[i];
        }
        for(int i=0; i<n; i++) {
            res[n+i] = arr2[i];
        }
        
        Arrays.sort(res, Collections.reverseOrder());
        System.out.println(Arrays.toString(res));

    } 
     
     */

}
