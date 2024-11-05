#include <stdio.h>
int main()
{
    int n,digit=0,sum=0;
    printf("enter any number = ");
    scanf("%d",&n);
    while(n!=0)
    {
        digit = n%10;
        if(digit%2==0)
        {
            sum = sum + digit;
        }
       n=n/10;
    }
    printf("sum = %d",sum);
    return 0;
}