import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(gcd(num1,num2));
		sc.close();
	}
	static int gcd(int a, int  b)
	{
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a>b)
			return gcd(a-b,b);
		return gcd(a,b-a);
	}
	

}
