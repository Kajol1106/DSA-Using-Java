import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            long n = sc.nextLong();
            if(hacks(n, 1)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
    
    public static boolean hacks(long n,long num) {
        boolean flag=false;
        if(num<n)
        {
            flag=hacks(n,num*10) || hacks(n,num*20);
        }
        else if(num==n) {
            flag=true;
        }
        else {
            flag=false;
        }
        return flag;
    }
}