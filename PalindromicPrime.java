import java.util.Scanner;
public class PalindromicPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		int revNum=0, LastDigit,OriginalNumber;
		Boolean Prime = false;
		OriginalNumber = num;
		while(num != 0);
		{
			LastDigit = num%10;
			revNum = revNum*10+LastDigit;
			num = num/10;
		}
		if(OriginalNumber == revNum)
		{
			for(int i = 2; i<OriginalNumber;i++)
			{
				if((OriginalNumber%i)==0)
				{
					Prime = true;
					break;
				}
			}
			if(Prime==true)
			{
				System.out.println("Not Prime Palindrome");
			}
			else
			{
				System.out.println("Prime Palindrome");
			}
		}
		else
			System.out.println("Not Prime Palindrome");
	}

}
