import java.util.Scanner;

public class SumAndAverageValue
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double total = 0;
        int  count =  0;
        System.out.println("Enter one number at a tiem or q to quit");        
        while(in.hasNextDouble())
        {
            double value = in.nextDouble();
            total += value;
            count++;            
        }
        double average = 0;
        if( count > 0 )
        average = total / count;
        System.out.println(average);
        System.out.println(total);
    }

}
