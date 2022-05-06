package hello_world;

import java.util.Scanner;

public class ArithmeticOperation {
public static void main(String args[]) {
	//creating scanner class object
	Scanner sc = new Scanner(System.in);
	
	//input two numbers from users
	System.out.println("Enter first number:");
	int n1 = sc.nextInt();
	System.out.println("Enter second number:");
	int n2 = sc.nextInt();
	
	//Perform arithmetic operations
	int sum = n1+n2;
	int diff = n1-n2;
	int mul = n1*n2;
	int div = n1/n2;
	int mod = n1%n2;
	//Will print the result to console
	System.out.println("Sum: "+sum);
	System.out.println("Difference: "+diff);
	System.out.println("Multiplication: "+mul);
	System.out.println("Division: "+div);
	System.out.println("Modulus: "+mod);
	
}
}
