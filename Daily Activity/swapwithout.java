import java.util.Scanner;
class swapwithout
{
public static void main(String args[]){
int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number:");
a = sc.nextInt();
System.out.println("Enter Second Number:");
b = sc.nextInt();
System.out.println("Before Swapping : First no = "+a+" Second no= "+b);
a=a+b;
b=a-b;
a=a-b;

System.out.println("After Swapping : First no = "+a+" Second no= "+b);
}
}