#include <stdio.h>
int main()
{
    int sum,rev=0,digit=0,n,b;
    printf("enter any number = ");
    scanf("%d",&n);
    b=n;
    while(n!=0)
    {
        digit = n%10;
        rev = rev*10 +digit;
        n=n/10;
    }
    n=b;
    sum = n + rev ;
   
    printf("Rev = %d and Sum = %d",rev,sum);
    return 0;
}