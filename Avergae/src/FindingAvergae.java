import java.util.Scanner;

public class FindingAvergae {
	public static void main(String ar[]) {
		System.out.println("Enter any 3 numbers :");
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		double num3=sc.nextDouble();
		
		System.out.println("The numbers you entered are :" +num1+" "+num2+" "+num3);
		double avg=(num1+num2+num3)/3;
		System.out.println("The Average of the numbers are :"+avg);
	}
}
