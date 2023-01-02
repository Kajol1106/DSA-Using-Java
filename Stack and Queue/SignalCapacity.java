import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
  
public class Main {
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
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            signalCapacity(n, arr);
            System.out.println();
        }
    }
    
    //Stack Approach
    //the reason behind using stack is to remember purpose
    //TC : O(N)
    //SC : O(N)
    public static void signalCapacity(int n, int[] arr) {
        int[] res = new int[n];
        res[0] = 1;
        
        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        for(int i=1; i<n; i++) {
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]) {
                st.pop();
            }
            
            // if(!st.isEmpty()) {
            //     res[i] = i-st.peek();
            // }
            // else {
            //     res[i] = i+1;
            // }
            res[i] = (st.isEmpty()) ? (i+1) : (i-st.peek());
            
            st.push(i);
        }
        
        //printing res
        for(int i:res) {
            System.out.print(i+" ");
        }
    }
}
