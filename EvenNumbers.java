import java.util.Scanner;
public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		for(int i = num1; i<num2;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}

}
