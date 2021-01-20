import java.util.Scanner;
public class SwitchEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		switch (num%2) {
		case 0 : {
			System.out.println("Even");
			break;
		}
		case 1 : {
			System.out.println("Odd");
			break;
		}
		}
		sc.close();
	}

}
