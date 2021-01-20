import java.util.Scanner;
public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int n1=0, n2=1,n3,i;
		System.out.print(n1+" "+ n2);
		for(i=2;i<num;i++)
		{
			n3 = n2+n1;
			System.out.print(" "+ n3);
			n1=n2;
			n2=n3;
		}
		sc.close();
	}

}
