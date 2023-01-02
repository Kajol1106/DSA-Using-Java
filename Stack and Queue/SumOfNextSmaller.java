//Enter code here
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--> 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] ans = sumOfNextSmaller(n, arr);
            int sum = 0;
            for(int i:ans) {
                //System.out.print(i+" ");
                sum += i;
            }
            System.out.println(sum);
        }
    }
    
    public static int[] sumOfNextSmaller(int n, int[] arr) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--) {
            while(!st.isEmpty() && st.peek()>=arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                ans[i] = 0;
            }
            else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
