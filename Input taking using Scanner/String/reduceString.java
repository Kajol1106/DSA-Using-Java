//Enter code here
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int c=0;

        while(c< sb.length()-1){
            if(sb.charAt(c) == sb.charAt(c+1)){
                sb.delete(c,c+2);
                c=0;
            }
            else{
                c+=1;
            }
        }
        if(sb.length() == 0)
            System.out.println("Empty String");
        else
            System.out.println(sb.toString());

    }
}




// class Main {
//     public static void main(String[] args) {
        
//         boolean canReduce = true;
        
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         //System.out.println(str);
//         StringBuilder sb = new StringBuilder(str);
        
//         while(sb.length()>0 && canReduce) {
//             for(int i=0; i<sb.length()-1; i++) {
//                 if(sb.charAt(i) == sb.charAt(i+1)) {
//                     sb.delete(i, i+2);
//                     canReduce = true;
//                     continue;
//                 }
//                 else {
//                     canReduce = false;
//                 }
//             }
//         }
        
//         if(sb.length() == 0) {
//             System.out.println("Empty String");
//         }
//         else {
//             System.out.println(sb);
//         }
        
//     }

// }
