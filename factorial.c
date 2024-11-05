#include<stdio.h>
int factorial(int);
void main()
{
    int n,f;
    printf("enter any number = ");
    scanf("%d",&n);
    f = factorial(n);
    printf("the factorial of %d is %d",n,f);
}
int factorial(int num)
{
    if(num==1)
        return 1;
    else
        return num*factorial(num-1);
}