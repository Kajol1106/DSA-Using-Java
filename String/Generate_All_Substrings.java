import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--> 0) {
            int n = sc.nextInt();
            String str = sc.next();
            subStrings(n, str);
        }
    }
    
    public static void subStrings(int n, String str) {
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<=n; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}