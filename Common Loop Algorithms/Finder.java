import java.util.Scanner;
public class Finder
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String input = in.nextLine();
       for(int i = 0; i < input.length(); i ++)
       {
           if( input.charAt(i) == ' ')
           {
               System.out.println(i);
               break;               
            }
        }
    }
}
