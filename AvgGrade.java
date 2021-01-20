import java.util.Scanner;
public class AvgGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects:");
		int arr[] = new int[5];
		int avg = 0;
		for(int i = 0 ; i<5;i++)
		{
			arr[i] = sc.nextInt();
			avg += arr[i];
		}
		avg = avg/5;
		System.out.println("The average score of the Student = "+ avg);
		
			if(avg > 80  && avg <= 100 )
				System.out.println( " Grade A");
			else if(avg > 60 && avg <= 80)
				System.out.println( "Grade B");
			else if(avg > 40 && avg <= 60)
				System.out.println(avg + "Grade C");
			else if(avg > 0 && avg <= 40)
				System.out.println(avg + ": Grade D");
			else
				System.out.println("Enter a valid number");
		sc.close();
	}

}
