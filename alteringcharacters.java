import java.util.Scanner;


public class Solution{

       
       public static void main(String[] args) {
              

              Scanner sc = new Scanner(System.in);

              int T = sc.nextInt();
              for (int c = 0; c < T; c++) {
                     char[] charac= sc.next().toCharArray();
                      int Count=0;
                     for(int i=0;i<charac.length-1;i++)
                     {
                           if(charac[i]==charac[i+1])
                           {
                                  Count++;
                           }
                          
                     }
                     System.out.println(Count);
                    
              }

              
       }

}
