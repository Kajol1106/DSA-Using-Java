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
            int target = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] res = towSum(n, target, arr);
            for(int i:res) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
    public static int[] towSum(int n, int target, int[] arr) {
        int left = 0;
        int right = n-1;
        int sum = 0;
        int[] res = {-1, -1};
        while(left<right) {
            sum = arr[left]+arr[right];
            if(sum == target) {
                res[0] = left;
                res[1] = right;
                return res;
            }
            else if(sum<target) {
                left++;
            }
            else {
                right--;
            }
        }
        
        return res;
    }
}

