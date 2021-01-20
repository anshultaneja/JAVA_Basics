import java.util.Scanner;
public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your income");
		int num = sc.nextInt();
		int tax = 0;
		if(num < 150000)
		{
			System.out.println("No taxes for you");
		}
		else if(num > 150000 && num <= 300000)
		{
			tax = tax + (num*10)/100;
		}
		else if(num > 300000 && num <= 500000)
		{
			tax = tax + (num*20)/100;
		}
		else
		{
			tax = tax + (num*30)/100;
		}
		System.out.println(tax);
		sc.close();
	}

}
