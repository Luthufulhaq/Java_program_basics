import java.util.Scanner;

public class Swapping_values {
	public static void main(String ar[]) {
		System.out.println("Enter any two numbers to be swapped :");
		Scanner num=new Scanner(System.in);
		int a=num.nextInt();
		int b=num.nextInt();
		System.out.println("The number you entered are :"+a+" "+b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("The values swapped are :"+a+" "+b);
		
	}
}
