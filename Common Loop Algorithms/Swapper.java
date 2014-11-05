import java.util.Scanner;
import java.util.Random;


public class Swapper
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a string: ");
       String answer = s.nextLine();
       int length = answer.length();
       String last = "";
       Random r = new Random();
       for (int c = 0; c < length; c++)
       {
           int i = r.nextInt(length-1);
           System.out.println(i);
           int j = r.nextInt(length-i)+i+1;
           System.out.println(j);
           
           if(j >= length)
           {
             String first = answer.substring(0, i);
             String middle = answer.substring(i+1, j-1);  
             last = answer.substring(j); 
             answer = first+answer.charAt(j-1)+middle+answer.charAt(i)+last;
            }
           else
           {
              String first = answer.substring(0, i);
              String middle = answer.substring(i+1, j); 
              last = answer.substring(j+1); 
              answer = first+answer.charAt(j)+middle+answer.charAt(i)+last;
            }
           
           System.out.println(answer);
       }    
       
     
   }
}
