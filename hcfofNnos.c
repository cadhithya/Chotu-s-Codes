#include <stdio.h>

 int i,j,h,n,array[100];
    int hcf(int,int);
    
    
   
    int main() 
    {
    
    scanf("%d",& n);
    for(i=0;i<n;i++)
        {
            
            scanf("%d",& array[i]);
        }
            for(i=0;i<n-1;i++)
                {
                     h=hcf(a[i],a[i+1]);
                     array[i+1]=h;
                }
                     printf("%d",h);
                     return 0;
    }                 
                     
  
   int hcf(int a,int b)
         {
              if(a%b==0)
               {
                      return b;
               }
              else
              {
                      return(hcf(b,a%b));
              }
         } 
