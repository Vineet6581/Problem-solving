#include <stdio.h>
int main()
{
    int n,digit=0;
    printf("enter any number  : ");
    scanf("%d",&n);
    int sum=0;
    while(n!=0)
    {
        digit = n%10;
        sum = sum + digit;
        n = n/10;
    }
    printf("sum = %d",sum);
    return 0;
}