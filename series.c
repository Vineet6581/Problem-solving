#include<stdio.h>
int main()
{
    int i,n;
    float sum=0,x,term=1;
    printf("enter the value of n :");
    scanf("%d",&n);
    printf("enter the value of x :");
    scanf("%f",&x);
    term = x;
    for(i=1;i<=n;i=i+2)
    {
        sum = sum+term;
        term = (term*x*x*-1)/((i+1)*(i+2));
    }
    printf("the sum of the series is %f",sum);
    return 0;
}