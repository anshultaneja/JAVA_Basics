import java.util.Scanner;

import static java.lang.Math.pow;

public class SwapFirstLast {
    public static void main(String[] args) {
        System.out.print("Enter any number of two or or more digits:-");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int z = x;
        int count = 0;
        int last =0;
        int num1, num2, num3, num4;
        while(z>0)
        {
            count++;
            z = z/10;
        }
        last = x%10;

         num1 = (int) (last * pow(10,count-1));
         num2 = (int) (x /pow(10,count-1));
         num3 = num1 + num2;
         num3 = num3 - last;
         num4 = (int) (x% pow(10,count-1));
         num3 = num3+num4;
        System.out.print(num3);
        in.close();
    }
}