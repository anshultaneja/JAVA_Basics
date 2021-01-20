import java.util.Scanner;
public class SuperPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int n1=0, s=0, s1=0;
		n1 = num*num;
		int a = num;
		int b = n1;
		while(num>0)
		{
			int c = num%10;
			s = s*10+c;
			num/=10;
		}
		while(n1>0)
		{
			int c = n1%10;
			s1 = s1*10+c;
			n1/=10;
		}
		if(a==s && b==s1)
			System.out.println("Super Palindrome");
		else
			System.out.println("Not a Super Palindrome");
		sc.close();
	}

}
