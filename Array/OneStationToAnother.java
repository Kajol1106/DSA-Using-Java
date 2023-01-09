import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--> 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int start = sc.nextInt();
            int end = sc.nextInt();
            station(n, arr, start, end);
        }
    }
    
    public static void station(int n, int[] arr, int start, int end) {
       int sIndex = 0;
       for(int i=0; i<n; i++) {
           if(arr[i]==start) {
               sIndex = i;
               break;
           }
       }
       
       int eIndex = 0;
       for(int i=0; i<n; i++) {
           if(arr[i]==end) {
               eIndex = i;
               break;
           }
       }
       //System.out.println(sIndex + " " + eIndex);
      int res = 35*(eIndex-sIndex);
      System.out.println(res);



      //OR
       /* 
        ArrayList<Integer> arrList = new ArrayList<Integer>();
       for(int i:arr) {
           arrList.add(i);
       }
       
       System.out.println(35*(arrList.indexOf(end)-arrList.indexOf(start)));
       */
      
    }
}