import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = 0;
		while(num>0)
		{
			int r = num%10;
			sum = sum + r;
			num = num/10;
		}
		System.out.println(sum);
		sc.close();
	}

}
