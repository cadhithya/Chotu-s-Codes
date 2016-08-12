import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;

 

public class Solution {

 

    public static void main(String[] args) {

        Scanner in = new Scanner ( System.in );

        int T = in.nextInt(); // Get the number of testcases

       

        int i=0,j=0;  // For Loop variables

        int x1=0,x2=0,x3=0;   // X coordinates of Lines

        int y1=0,y2=0, y3=0;  // Y coordinates of Lines

        int[][] values = new int[T][4];  // Size of the input values.

        for(i=0;i<T;i++)

        {

            for(j=0;j<4;j++)

            {

                values[i][j]=in.nextInt();  // Obtaining the values in an integer array

                //System.out.print( values[i][j]+" ");  For checking if values are being stored.

            }

            // System.out.println(); For printing next line values

        }

       

        for(i=0;i<T;i++)

        {

            x1 = values[i][0];  // Storing first value in x1

            y1 = values[i][1]; ///Storing first value in  y1

            x2 = values[i][2]; // Storing first value in x2

            y2 = values[i][3]; // Storing first value in y2

           

            x3 = 2*x2 - x1 ; // ( x1+x2 ) / 2 =midpoint .. So  x2= 2*midpoint – x1

            y3 = 2*y2 - y1 ;// ( y1+y2 ) / 2 =midpoint .. So  y2= 2*midpoint – y1

           

            System.out.println(x3 + " " + y3);

               

        }   

       

    }

}
