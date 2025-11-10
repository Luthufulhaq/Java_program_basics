import java.util.Scanner;

public class MultiArray {
	public static void main(String ar[]) {
		System.out.println("Enter the Array Size :");
		Scanner n=new Scanner(System.in);
		int limit=n.nextInt();
		int[][] a=new int [limit][limit];
		System.out.println("Enter the array values :");
		for(int i=0;i<limit;i++) {
			for(int j=0;j<limit;j++) {
				a[i][j]=n.nextInt();
			}
			
		}
		System.out.println("The array you entered is : ");
		for(int i=0;i<limit;i++) {
			for(int j=0;j<limit;j++) {
				System.out.print(a[i][j]+"\t");
			}
			
		}
		
	}
}
