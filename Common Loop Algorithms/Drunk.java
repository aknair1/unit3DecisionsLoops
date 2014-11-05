
import java.util.Random;

public class Drunk
{
    public static void main(String[] args)
    {
        int x = 0;
        int y = 0;
        Random r = new Random();
        for (int i = 0; i < 100; i++)
        {
            int c = r.nextInt(3);
            if(c == 0)
            {
                x --;
            }
            else if(c == 1)
            {
                y ++;
            }
            else if(c == 2)
            {
                x ++;
            }
            else if(c == 3)
            {
                y --;
            }
        }
        System.out.println(x);
        System.out.println(y);
    }
}
