import java.util.Scanner;
class ternary{
public static void main(String args[]){
int age;
Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Age : ");
age = sc.nextInt();
String msg = (age >= 18)? " You are eligible to Vote " : 
					      " You are Not eligible to Vote ";
System.out.println(msg);
}
}