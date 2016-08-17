import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double semi;
        semi=(a+b+c)/2;
        double area = semi*(semi-a)*(semi-b)*(semi-c);
        double ans=Math.sqrt(area);
        if(ans-((int)(ans))!=0)
        {
            System.out.printf("%.1f",ans);
        }
        
        else
        {
            System.out.println((int)ans);
        }
        
    }
}
