import java.util.Scanner;
public class CompareAdjacent
{
    public static void main(String[] args)
    {
        final double EPSILON = 1e-7;       ;;;;;;;;;;;;;;;;;;;;;;;;;;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a series of numbers");
        double prevValue = 0;
        double currentValue = in.nextDouble();
        while(in.hasNextDouble())
        {
           prevValue = currentValue;
           currentValue = in.nextDouble();
           if(Math.abs(currentValue - prevValue)<EPSILON)
           {
               System.out.println("Duplicate numbers");;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
           }
        }
    }
}
