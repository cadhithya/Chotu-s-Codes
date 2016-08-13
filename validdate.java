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
	    String s = reader.readLine();
	    
	    int flag=1; 
	    String[] s1= s.split("-"); //Splitting the date string using delimiter hyphen ( - )
	    
	    int date    = Integer.parseInt(s1[0]); // Obtaining Date by spliting the given String
	    int month   = Integer.parseInt(s1[1]); // Obtaining month by spliting the given String
	    int year    = Integer.parseInt(s1[2]); // Obtaining year by splitting the given String
	    
	    if(month<1 || month > 12 ) // Checking if valid month
	    {flag=0;}
	    
	    if(date<1 || date>31) // Checking if valid date 
	    {flag=0;}
	    
	    if(year%400==0) // Leap year checking date for FEB month
	    {if(month==2)
	        {if(date>29)
	            {flag=0;}
	       }
	    }
	    
	    if(year%4==0) // Leap year checking date for FEB month
	    {if(month==2)
	        {if(date>29)
	            {flag=0;}
	        }
	    }
	    
	    if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month ==12) // 31 days months
	    {if(date>31)
	     {flag=0;}}
	     
	     if(month==4 || month==6 || month==9 || month==11) /// 30 days months 
	     {if(date>30)
	     {flag=0;} 
	     } 
	     
	     if(month==2) // FEB month days check
	     {if(date>28)
	     {flag=0;}}
	    
	    
	    if(flag==1)
	    {System.out.println("TRUE");}
	    else
	    {System.out.println("FALSE");} //Initally flag is 0 , so if above conditions true , flag will change to 0 
 
	
	}
}
