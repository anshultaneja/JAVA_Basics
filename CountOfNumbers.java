import java.util.Scanner;
public class CountOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the range of the numbers:");
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		  int count1 = 0;
		  int count2 = 0;
		   for(int i = num1; i<=num2; i++)
		   {
			   if(i%2==0)
				   count1++;
			   else
				   count2++;
		   }
		   System.out.println("Even: "+count1+ "\n" + "Odd: "+count2);
		   sc.close();
	}

}
