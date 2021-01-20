import java.util.Scanner;
import java.lang.Math;
public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(Math.pow(num1, num2));
		sc.close();
	}

}
