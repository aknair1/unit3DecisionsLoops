import java.util.Scanner;
import java.util.Random;


public class Substringer
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a string: ");
       String answer = s.nextLine();
       int length = answer.length();
       for (int i = 1; i <= length + 1; i++)
       {
           for(int c = 0; c <= length+1; c++)
           {
               if (c+i <= length)
               System.out.println(answer.substring(c,c+i));
            }
        }
       
     
   }
}
