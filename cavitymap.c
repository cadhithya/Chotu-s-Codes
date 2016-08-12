#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n; 
    scanf("%d",&n);
    char* grid[n];
    int i=0;
    int j=0;
    for(i = 0; i < n; i++){
       grid[i] = (char *)malloc(1024 * sizeof(char));
       scanf("%s",grid[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(i!=0 && j!=0 && i!=n-1 && j!=n-1)
            {
              if(grid[i][j]>grid[i+1][j] && grid[i][j]>grid[i][j+1] && grid[i][j]>grid[i-1][j] && grid[i][j]>grid[i][j-1])
              {
                  grid[i][j]='X';
              }    
            }    
        }    
    }
    for(i=0;i<n;i++)
    {
        printf("%s \n",grid[i]);
    }    
    return 0;
}
