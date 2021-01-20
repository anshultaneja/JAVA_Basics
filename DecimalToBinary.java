import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int index = 0;
		sc.close();
		int binary [] = new int[40];
		while(num>0)
		{
			binary[index++] = num%2;
			num = num/2;
		}
		for(int i = index-1;i>=0;i--)
		{
			System.out.print(binary[i]);
		}
	}

}
