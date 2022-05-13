import java.util.Scanner;
class swapwith
{
public static void main(String args[]){
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number:");
a = sc.nextInt();
System.out.println("Enter Second Number:");
b = sc.nextInt();
System.out.println("Before Swapping : First no = "+a+" Second no= "+b);
c=a;
a=b;
b=c;

System.out.println("After Swapping : First no = "+a+" Second no= "+b);

}
}