import java.util.Scanner;
public class SalaryBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary:");
		int sal = sc.nextInt();
		System.out.println("Enter your gender(M/F):");
		String str = sc.next();
		char gd = str.charAt(0);
		int bonus = 0;
		if(sal <10000)
			bonus = bonus + (sal*2)/100;
		
		if(gd == 'F')
			bonus = bonus + (sal*10)/100;
		else
			bonus = bonus +(sal*5)/100;
		
		int total_sal = sal + bonus;
		System.out.println("Total Salary :" + total_sal);
		sc.close();
	}

}
