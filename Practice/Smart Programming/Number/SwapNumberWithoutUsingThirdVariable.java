import java.util.*;

public class SwapNumberWithoutUsingThirdVariable {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int num1 = s1.nextInt();
		
		System.out.print("Enter second number : ");
		int num2 = s1.nextInt();
		
		System.out.println("\n");

        //WAP to swap number without using third variable
		System.out.println("WAP to swap number without using third variable");
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("First number is " + num1);
		System.out.println("second number is " + num2);
				
	}
		
}
