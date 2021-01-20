import java.util.Scanner;
public class SquareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		for(int i = num1; i<=num2;i++)
		{
			for(int j =num1+1; j<=num2; j++)
			{
				if(i*i==j)
				{
					System.out.println(i);
				}
			}
		}
		sc.close();
	}

}
