import java.util.*;
import java.lang.Math;

public class DivisionTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        //System.out.println(n);
        
        int x = (int)Math.floor(32/n);  //downcasting
        //System.out.println(x);
        
        if(x == 0) {
            System.out.println("Too Low");
        }
        else if(n == 0) {
            System.out.println("-1");
        }
        else {
            System.out.println(x);
        }
    }
}
