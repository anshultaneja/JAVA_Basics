import java.util.Scanner;
public class ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character: ");
		String str = sc.next();
		char ch = str.charAt(0);
		if(ch == 'A' || ch == 'Z')
			System.out.println((char)((int)ch+32));
		else
			System.out.println((char)((int)ch-32));
		sc.close();
		
	}

}
