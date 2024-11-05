#include<stdio.h>
int sum(int);
void main()
{
    int n;
    printf("enter any number = ");
    scanf("%d",&n);
   int s = sum(n);
    printf("the sum of %d is %d",n,s);
}
int sum(int a)
{
    if(a==0)
    return 0;
    else
    return a%10+sum(a/10);
}