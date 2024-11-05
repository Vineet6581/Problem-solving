#include<stdio.h>
int main()
{
    int i,j,n,a=1,k;
    printf("enter n = ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        for(k=i;k<n;k++)
        {
            printf(" ");
        }
        for(j=1;j<=a;j++)
        {
            printf("*");
        }
          a += 2;
        printf("\n");
    }
    return 0;
}