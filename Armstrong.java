import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int temp = num;
		int c =0, a;
		while(num>0)
		{
			a = num%10;
			num=num/10;
			c = c + (a*a*a); 
		}
		if(temp == c)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a Armstrong number");
		sc.close();
	}

}
