import java.util.Scanner;
public class NumbersInWords {
	static void printValue(char digit) {
		switch(digit) {
		case '0' :
		{
			System.out.print(" zero");
			break;
		}
		case '1' :
		{
			System.out.print(" one");
			break;
		}
		case '2' :
		{
			System.out.print(" two");
			break;
		}
		case '3' :
		{
			System.out.print(" three");
			break;
		}
		case '4' :
		{
			System.out.print(" four");
			break;
		}
		case '5' :
		{
			System.out.print(" five");
			break;
		}
		case '6' :
		{
			System.out.print(" six");
			break;
		}
		case '7' :
		{
			System.out.print(" seven");
			break;
		}
		case '8' :
		{
			System.out.print(" eight");
			break;
		}
		case '9' :
		{
			System.out.print("nine");
			break;
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		 String num = sc.next();
		 int length = num.length();
		 for(int i =0;i<length;i++)
		 {
			 printValue(num.charAt(i));
		 }
		 sc.close();		
	}

}

