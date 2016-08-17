import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		String string2 = sc.nextLine();
		int length1 = string1.length(); 
		int length2 = string2.length();
		
		
		
	        	if(length1==length2){  // IF length are same, printing 'a' and then 'd'
	        	    
	        	for(int i=0;i<length1;i++){  
	        	    System.out.print(string1.charAt(i));
		            System.out.print(string2.charAt(i));
		    }}
	        	
	        	else if(length1>length2){ //IF str1>str2 , printing 'a' and then 'd' 
	        	    
	        	    for(int i=0;i<length2;i++){   
	        	        System.out.print(string1.charAt(i));
		                System.out.print(string2.charAt(i));
		                }   
		                
		        for(int i=length2;i<length1;i++){   
		                System.out.print(string1.charAt(i)); // Printing the last unbalanced char
		                }
	        	    
	        	}	
		                
		        else{	  //IF str2>str1 , printing 'd' and then printing 'a'
		                for(int i=0;i<length1;i++){ 
		                System.out.print(string1.charAt(i));
		                System.out.print(string2.charAt(i));
		                		    }    
		                		    
		      for(int i=length1;i<length2;i++){   
		            System.out.print(string2.charAt(i)); //Printing the last unbalanced char
		    }
		            
		        }
	    
	}
    
}
