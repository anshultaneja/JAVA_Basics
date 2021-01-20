import java.util.Scanner;
public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count = 0;
		int temp;
		while(num>0)
		{
			temp = num%10;
			count++;
			num = num/10;
		}
		System.out.println(count);
		sc.close();
	}

}
