#include<stdio.h>
#include <math.h>
int main()
{
float sum=0;
int n,digit,count=0,original_n;
printf("enter any number :");
scanf("%d",&n);
original_n=n;
while(n!=0)
{
    count++ ;
    n = n / 10;

}
n = original_n;
while(n!=0)
{
    digit = n%10;
    sum += pow(digit,count);
    n = n/10;
}
if((int)sum == original_n)
printf("number is armstrong");
else 
printf("number is not armstrong");
return 0;
}