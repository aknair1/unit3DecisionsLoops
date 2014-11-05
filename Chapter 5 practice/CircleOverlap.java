
import java.util.Scanner;
public class CircleOverlap
{
   public static void main(String[] args)
   {
    
      Scanner in = new Scanner(System.in);
      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;
      double difference = Math.abs(xcenter2 - xcenter1);
      if (radius1 -  difference>= radius2 || radius2 - difference >= radius1){
          System.out.println("They are mutually contained");
        }
      else if (radius1 + radius2 > difference){
          System.out.println("They are overlapping");
        }
      else{
          System.out.println("They are disjoint");
        }
          
      
      
      
      
      
      // Your work goes here
   }
}