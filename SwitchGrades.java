import java.util.Scanner;
public class SwitchGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int avg = 0;
		System.out.println("Enter marks of 5 subjects:");
		for(int i =0;i<5;i++)
		{
			arr[i] = sc.nextInt();
			avg = avg + arr[i];
		}
		avg = avg/5;
		 switch(avg/10) {
		 case 9 : {
			 System.out.println("Grade O");
			 break;
		 }
		 case 8: {
			 System.out.println("Grade A");
			 break;
		 }
		 case 7 : {
			 System.out.println("Grade B");
			 break;
		 }
		 case 6 : {
			 System.out.println("Grade C");
			 break;
		 }
		 case 5 : {
			 System.out.println("Grade D");
			 break;
		 }
		 case 4 : {
			 System.out.println("Grade E");
			 break;
		 }
		 default : {
			 System.out.println("Fail");
		 }
		 }
		sc.close();
	}

}
