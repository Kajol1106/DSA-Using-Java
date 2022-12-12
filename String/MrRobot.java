import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
          int n = sc.nextInt();
          String str = sc.next();
          System.out.println(mrRobot(str, 0, n-1, ""));
        }
    }
    
    public static String mrRobot(String str, int l, int r, String res) {
        if(l>r) {
            return "";
        }
        int mid = (l+r)/2;
        res = res+str.charAt(mid)+mrRobot(str, l, mid-1, res)+mrRobot(str, mid+1, r, res);
        return res;
    }
}
