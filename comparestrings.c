#include <stdio.h>
#include <string.h>




int main(void) {
	char a[50];
	char b[50];
	
	int len1,len2;
	scanf("%s%s",a,b);
	
	len1=strlen(a);
	len2=strlen(b);
	
	if(len1==len2)
	{
	    int count = comparestr(a,b,len1);
	    if(count==1)
	{
	    printf("Strings are equal"); 
	}
	else
	{
	    printf("Strings are not equal");
	}
	}
	else
	{
	   printf("Strings are not equal"); 
	}
	
	
	
	return 0;
}

int comparestr( char* s1 , char* s2 , int x )
{
    int i=0;
    int flag=0;
    for(i=0;i<x;i++)
    {
        if(s1[i]!=s2[i])
        {
            flag=0;
        }
        else
        {
            flag=1;
            break;
        }
    }
    return flag;
    
}
