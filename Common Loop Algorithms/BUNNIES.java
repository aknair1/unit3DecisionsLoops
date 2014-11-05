
import java.util.Scanner;

public class BUNNIES
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int f1 = 1;
        int f2 = 1;
        int f3 = f2 + f1;
        for (int c = 0; !(c == n-2); c++)
        {
            f3 = f1 + f2;
            f2 = f1;
            f1 = f3;

        }
        System.out.println(f3);
    }
}
