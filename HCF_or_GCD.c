#include<stdio.h>
int hcf(int,int);
void main()
{
    int a,b;
    printf("enter any two numbers = ");
    scanf("%d %d",&a,&b);
    printf("the HCF of %d,%d = %d",a,b,hcf(a,b));
}
int hcf(int n1, int n2)
{
    if(n2==0)
    return n1;
    else 
    return hcf(n2,n1%n2);
}
