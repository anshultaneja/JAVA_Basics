import java.util.Scanner;
public class Largest_Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1>num2)
		{
			System.out.println(num1 +" is larger");
			System.out.println(num2 + " is smaller");
		}
		else
		{
			System.out.println(num2 + " is larger");
			System.out.println(num1 + " is smaller");
		}
		
		sc.close();
	}

}
