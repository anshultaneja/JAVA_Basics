import java.util.Scanner;
public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		 int sum = 0;
		for(int i =num1; i<= num2;i++)
		{
			if(i%2!=0)
			{
				sum = sum + i;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
