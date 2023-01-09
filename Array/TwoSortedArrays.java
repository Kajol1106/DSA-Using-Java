import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    
     static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int tc = sc.nextInt();
        while(tc--> 0) {
            int n = sc.nextInt();
            int[] A = new int[n];
            for(int i=0; i<n; i++) {
                A[i] = sc.nextInt();
            }
            int[] B = new int[n];
            for(int i=0; i<n; i++) {
                B[i] = sc.nextInt();
            }
            twoSortedArrays(n, A, B);
        }
    }
    
    public static void twoSortedArrays(int n, int[] A, int[] B) {
        int count = 0;
        int left = 0;
        int right = n-1;
        while(left<n && right>=0) {
            if(A[left]<B[right]) {
                left++;
            }
            else if(A[left]>B[right]) {
                right--;
            }
            else {
                count++;
                left++;
                right--;
            }
        }
        System.out.println(count);
    }
}