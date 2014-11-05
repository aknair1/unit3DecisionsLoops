import java.util.Scanner;
import java.util.Random;


public class Diamond
{
   public static void main(String[] args)
   {
       Scanner s2 = new Scanner(System.in);
       System.out.println("Enter a number of sides: ");
       int s = s2.nextInt();
       int longSide = 2*s - 1;
       for(int i = 1;i<=s;i++)
       {
           for (int p = s - i; p > 0;p--)
           {
               System.out.print(" ");
           }
           for (int c = 2*i; c > 1; c--)
           {
               System.out.print("*");
           }
           System.out.println(" ");
       }
       for(int i = 1;i<=s-1;i++)
       {
           for (int p = i; p >= 1; p--)
           {
               System.out.print(" ");
           }
           for (int c = 2*(s-i); c > 1; c--)
           {
               System.out.print("*");
           }
           System.out.println(" ");
       }
     
   }
}