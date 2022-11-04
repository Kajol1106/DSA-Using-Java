import java.io.*;
import java.util.*;
class CoinSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        printDistinctSum(n, arr);
    }
    
    public static void printDistinctSum(int n, int[] arr) {
        //to get distinct sum
        HashSet<Integer> res = new HashSet<Integer>();
        
        //recursion
        distinctSum(n, arr, 0, 0, res);
        
        res.remove(0);
        
        //for sorting the set result
        TreeSet<Integer> sortedRes = new TreeSet<Integer>(res);
        
        //print result
        System.out.println(sortedRes.size());
        for(int i : sortedRes) {
            System.out.print(i + " ");
        }
    }
    
    public static void distinctSum(int n, int[] arr, int sum, int currIndex, HashSet<Integer> res) {
        if(currIndex>n) return;
        if(currIndex==n) {
            res.add(sum);
            return;
        }
        
        distinctSum(n, arr, sum+arr[currIndex], currIndex+1, res);
        
        distinctSum(n, arr, sum, currIndex+1, res);
        
    }