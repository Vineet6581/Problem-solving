#include<stdio.h>
int main()
{
    int n;
    printf("enter any number = ");
    scanf("%d",&n);
    int rev=0, digit = 0;
    while(n!=0)
    {
        digit = n%10;
        rev = rev*10 + digit;
        n = n/10;
    }
    printf("The reverse = %d",rev);
    return 0;
}