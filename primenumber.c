#include<stdio.h>

int main()
{
    int i,n,flag=0;
    printf("enter any number");
    scanf("%d",&n);
    if(n==0||n==1)
    {
        flag=1;
    }
    else
    {
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }

        }
    }
    if(flag==1)
    {
        printf("not a prime");
    }
    else
    {
        printf("prime");
    }
    return 0;
}