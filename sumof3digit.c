#include <stdio.h>
int main()
{
    int n,digit,n1,n2,n3,sum;
    printf("Enter a three digit number :");
    scanf("%d",&n);
    digit = n%10;
    n1 = digit;
    n = n/10;
    digit = n%10;
    n2 = digit;
    n = n/10;
    digit = n%10;
    n3 = digit;
    sum = n1 + n2 + n3;
    printf("The sum of the number is %d",sum);
    return 0;



}