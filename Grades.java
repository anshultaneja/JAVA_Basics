import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects:");
		int arr[] = new int[5];
		for(int i = 0 ; i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i =0;i<5;i++)
		{
			if(arr[i] > 80  && arr[i] <= 100 )
				System.out.println(arr[i] + ": Grade A");
			else if(arr[i] > 60 && arr[i] <= 80)
				System.out.println(arr[i] + ": Grade B");
			else if(arr[i] > 40 && arr[i] <= 60)
				System.out.println(arr[i] + ": Grade C");
			else if(arr[i] > 0 && arr[i] <= 40)
				System.out.println(arr[i] + ": Grade D");
			else
				System.out.println("Enter a valid number");
		}
		sc.close();
	}

}
