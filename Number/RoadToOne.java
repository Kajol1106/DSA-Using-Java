import java.util.*;

public class RoadToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int n = sc.nextInt();
            System.out.println(roadToOne(n));
        }
    }

    public static int roadToOne(int n) {
        int count = 0;
        while(n>1) {
                if(n%2 == 0) {
                n = n/2;
                count++;
            }
            else if(n%3 == 0) {
                n = (2*n)/3;
                count++;
            }
            else if(n%5 == 0){
                n = (4*n)/5;
                count++;
            }
            else {
                return -1;
            }
        }
        return count;
    }
}
