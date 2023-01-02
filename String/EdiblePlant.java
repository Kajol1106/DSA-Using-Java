import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = sc.next();
        int m = sc.nextInt();
        String str2 = sc.next();
        ediblePlant(n, str1, m, str2);
        
    }
    
    public static void ediblePlant(int n, String str1, int m, String str2) {
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(str1.charAt(i)==str2.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}