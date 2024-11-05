#include <stdio.h>
int main  ()
{
    int i,n;
    float sum=1,x,term=1;
    printf("enter the value of n :");
    scanf("%d",&n);
    printf("enter the value of x :");
    scanf("%f",&x);
    term = 1;
    for(i=1;i<=n;i++)
    {
        term = (term*x*-1)/i;
        sum =sum+term;
    }
    printf("the sum of the series  is %f",sum);
    return 0;
}