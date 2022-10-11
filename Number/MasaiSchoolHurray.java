import java.util.*;

public class MasaiSchoolHurray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int start=1;
        while(start<=n) {
            if(start%5==0 && start%7==0) {
                System.out.println("Masai School");
            }
            else if(start%7==0) {
                System.out.println("Masai");
            }
            else if(start%5==0) {
                System.out.println("School");
            }
            else {
                System.out.println("Hurray!");
            }
       
            start++;
        }
    }
}
