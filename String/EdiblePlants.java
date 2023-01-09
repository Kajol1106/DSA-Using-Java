import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String edible = sc.next();
        int m = sc.nextInt();
        String plants = sc.next();
        
        ediblePlants(n, edible, m, plants);
    }
    
    public static void ediblePlants(int n, String edible, int m, String plants) {
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(edible.charAt(i) == plants.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}