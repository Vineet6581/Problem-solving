// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
#include<stdio.h>
int main()
{
    int i,j,n,a=1;
    printf("enter n = ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            if(i==j || (i+j)%2==0)
            printf("%d ",a);
            else 
            printf("0 ");

        }
        printf("\n");
    }
    return 0;
}
