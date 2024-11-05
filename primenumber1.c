#include <stdio.h>
int main()
{
    int i,n;
    printf("enter any number :");
    scanf("%d",&n);
    int a=0;
    if(n==0||n==1)
    {
        a=1;
    }
    else {
    for(i=2;i<=n-1;i++)
    {
        if(n%i==0) // i is the factor of n
        {
            a = 1;
            break;
        }
    }
    }
    if(a==0)
    {
        printf("prime number");
    }
    
    else{
        printf("not a prime");
    }
    return 0;
}