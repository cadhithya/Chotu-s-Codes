/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int fact = printfactorial(N);
		System.out.println(fact);
	}


static int printfactorial(int x)
{
    if(x==0)
    {
        return 1;
    }
    else
    {
        return x * printfactorial(x-1);
    }
}

}

