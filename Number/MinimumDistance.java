import java.util.*;

public class MinimumDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int n = sc.nextInt();
            minimumDistance(n);
        }
    }

    public static void minimumDistance(int n) {
        //1,2,3,4,5...n
        int count = 0;
        while(n>1) {
            if(n%2 == 0) {
                count++;
                n = n/2;
            }
            else {
                count++;
                n = n-1;
            }
        }
        System.out.println(count);
    }
}
