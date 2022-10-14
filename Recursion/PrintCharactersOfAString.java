import java.util.*;

public class PrintCharactersOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        printCharacter(str);
    }
    
    public static void printCharacter(String str) {
        if(str.length() == 0) {
            return;
        }
        else {
            System.out.println(str.charAt(0));
            printCharacter(str.substring(1));
        }
    }
}
