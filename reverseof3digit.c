#include <stdio.h>
int main()
{
    int n,digit,rev=0;
    printf("Enter a three digit number :");
    scanf("%d",&n);
    digit = n%10;
    rev = rev*10 + digit;
    n = n/10;
    digit = n%10;
    rev = rev*10 + digit;
    n = n/10;
    digit = n%10;
    rev = rev*10 + digit;
    n = n/10;
    digit = n%10;
    rev = rev*10 + digit;
    printf("The reverse of the number is %d",rev);
    return 0;



}