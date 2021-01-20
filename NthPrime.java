import java.util.Scanner;
public class NthPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int nth = sc.nextInt();
		int num=1,count=0,i;
		while(count < nth)
		{
			num = num+1;
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					break;
				}
			}
			if(i==num)
			{
				count++;
			}
		}
		System.out.println(num);
		sc.close();
	}

}
