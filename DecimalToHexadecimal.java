import java.util.Scanner;
public class DecimalToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = sc.nextInt();
		int i =0;
		char Hexadec[] = new char[100];
		while(num!=0)
		{
			int temp =0;
			temp = num%16;
			if(temp<10)
			{
				Hexadec[i] = (char)(temp+48);
				i++;
			}
			else
			{
				Hexadec[i] =(char)(temp+55);
				i++;
			}
			num=num/16;
		}
		for(int j =i-1;j>=0;j--)
			System.out.print(Hexadec[j]);
		sc.close();
	}

}
