import java.util.*;

class DistinctSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int n = sc.nextInt();
            String str = sc.next();
            //System.out.println(n);
            //System.out.println(str);
            System.out.println(distinctSubstring(n,str).size());
        }
        
    }
    
    public static Set<String> distinctSubstring(int n, String str)
    {
 
        // Put all distinct substring in a HashSet
        Set<String> result = new HashSet<String>();
 
        // List All Substrings
        for (int i=0; i<=n; i++) {
            for (int j=i+1; j<=n; j++) {
                // Add each substring in Set
                result.add(str.substring(i, j));
            }
        }
 
        // Return the HashSet
        return result;
    }
}