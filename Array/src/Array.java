import java.util.Scanner;

public class Array {
	public static void main(String ar[]) {
	
		System.out.println("Enter the array size :");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		
		int[] a= new int [limit];
		System.out.println("Enter the array values :");
		for(int i=0;i<limit;i++) {
			 a[i]=sc.nextInt();
		}
		 System.out.println("The Entered array is:");
		 for(int i=0;i<limit;i++) {
			 System.out.println(a[i]);
		 }
		
		
		}
		
	}
