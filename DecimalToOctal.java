import java.util.Scanner;
public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		int decimal = sc.nextInt();
		int octal[] = new int[100];
		int  i =0;
		while(decimal>0)
		{
			octal[i] = decimal%8;
			decimal = decimal/8;
			i++;
		}
		for(int j = i-1;j>=0;j--)
		System.out.print(octal[j]);
		sc.close();
	}

}
