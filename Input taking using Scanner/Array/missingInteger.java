import java.util.*;


class Main
{
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] str = sc.nextLine().split(" ");    //here length is not given so to find length we have to do this process
        //System.out.println(str.length);
        
        int[] arr = new int[str.length];
        for(int i=0; i<str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
            //System.out.print(arr[i]+" ");
        }
        System.out.println(getMissingInteger(arr));
    }
    
    public static int getMissingInteger(int[] arr) {
        
      int size = arr.length;
       
      int sum = ((size+1)*(size+2))/2;
      for(int i=0; i<size; i++) {
          sum -= arr[i];
      }
      return sum;
            
    }
}