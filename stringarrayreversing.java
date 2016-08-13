/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine(); // Reading the String
		
		String reverse[] = s.split(" "); // Split the S string which has space and saving in REVERSE
        
        int length=reverse.length-1; // Getting the length of the split string REVERSE
        
        while(length>=0)
        {
            System.out.print(reverse[length]+" ");
            length--;
        }
        	}
}
