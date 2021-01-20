import java.util.Scanner;
import static java.lang.Math.*;
public class Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Quadractic equation  is : ax^2 + bx + c");
		System.out.println("Enter the values of a , b, c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = b*b - 4*a*c;
		 double sqrt_val = sqrt(abs(d));
		if(d > 0)
		{
			System.out.println("Roots are real and different");
			System.out.println((double)(-b + sqrt_val)/(2*a) + "\n" + (double)(-b-sqrt_val)/(2*a) );
		}
		else if( d == 0)
		{
			System.out.println("Roots are real and same");
			System.out.println((double)(-b + sqrt_val)/(2*a) + "\n" + (double)(-b-sqrt_val)/(2*a) );
		}
		else
		{
			System.out.println("Roots are complex");
			System.out.println( -(double)b / (2*a) + " + i" + sqrt_val + "\n" + -(double)b / (2*a) + " - i" + sqrt_val );
		}
		sc.close();
	}

}
