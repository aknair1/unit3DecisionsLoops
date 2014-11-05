import java.util.Scanner;
public class CountMatches
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String input = in.nextLine();
       int spaces = 0;
       for( int i = 0; i < input.length(); i ++)
       {
           char ch = input.charAt(i);
           if( ch == ' ')
           {
               spaces ++;
            }
        }
       System.out.println("Number of spaces in string: " + spaces);
    }
}
