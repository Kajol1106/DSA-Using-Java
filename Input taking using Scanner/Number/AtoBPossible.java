import java.util.*;

class AtoBPossible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(possible(a, b)) {
                System.out.println("Possible");
            }
            else {
                System.out.println("Not Possible");
            }
        }
    }
    
    public static boolean possible(int a, int b) {
        if(a>b) return false;
        if(a==b) return true;
        return possible(a*2, b) || possible((a*10)+1, b);
    }
}
