import java.util.Scanner;
public class Positive_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num >0)
			System.out.println("Positive Number");
		else if(num<0)
			System.out.println("Negative Number");
		else
			System.out.println("Zero");
		sc.close();
	}

}