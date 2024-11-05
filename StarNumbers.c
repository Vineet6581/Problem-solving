#include<stdio.h>
int main()
{
    int n,j,i,k;
    printf("enter n = ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        for(j=i;j<=n;j++)
        {
            printf(" ");
        }
        for(k=1;k<=2*i-1;k++)
        {
            printf("%d",k);
        }
        printf("\n");
    }
    return 0;
}
