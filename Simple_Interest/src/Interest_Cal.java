import java.util.Scanner;

public class Interest_Cal {
	public static void main(String ar[]) {
		System.out.println("Enter the Principal amount :");
		Scanner val=new Scanner(System.in);
		int p=val.nextInt();
		System.out.println("Enter the Interest Rate :");
		double r=val.nextDouble();
		System.out.println("Enter the tenure in years :");
		double y=val.nextDouble();
		System.out.println("You have Entered "+p+" principal amount with "+r+" interest rate for "+y+" years.");
		double si=(p*r*y)/100;
		System.out.println("Total interest will be : "+si);
		System.out.println("Tthe total amount with the interest : "+(si+p));
		System.out.println("Your monthly EMI will be : "+(si+p)/(y*12));
		
	}
}
