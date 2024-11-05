//   *
//   *
// *****
//   *
//   *
#include<stdio.h>
int main()
{
    int i,j,n;
    printf("enter n = ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        int a = n/2 +1;
        for(j=1;j<=n;j++)
        {
            if(i%a==0 || j%a==0)
            {
                printf("*");
            }
            else 
            {
                printf(" ");
            }
        }
        printf("\n");
    }
    return 0;
}