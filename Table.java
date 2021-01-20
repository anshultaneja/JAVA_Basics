import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println("Enter the number upto which table is required:");
		int n = sc.nextInt();
		for(int i = 1; i<=n ;i++)
		{
			System.out.print(num*i+" ");
		}
		sc.close();
	}

}
