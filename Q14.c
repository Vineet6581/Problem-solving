// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
#include<stdio.h>
int main()
{
    int i,j,n,a;
    printf("enter n = ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
      if(i%2!=0) a=1;
       else a=0;
        for(j=1;j<=i;j++)
        {
              printf("%d ",a);   
              if(a==0) a=1;
              else  a=0;
        }
        printf("\n");

    }
}
