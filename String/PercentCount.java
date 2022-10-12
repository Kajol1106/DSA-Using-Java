import java.util.*;

public class PercentCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int n = sc.nextInt();
            String str = sc.next();
            char ch = sc.next().charAt(0);
            percentCount(n, str, ch);
        }
    }
    
    public static void percentCount(int n, String str, char ch) {
        double count = 0;
        double tot = 0;
        for(int i=0; i<n; i++) {
            if(str.charAt(i) == ch) {
                count++;
            }
            tot++;
        }
        
        int res = (int)((count/tot)*100);
        System.out.println(res);
    }
}
