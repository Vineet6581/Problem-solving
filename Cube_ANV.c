// arguments with no return value
#include<stdio.h>
void cube(int a);
void main()
{
    int n;
    printf("enter any number : ");
    scanf("%d",&n);
    cube(n);
}
void cube(int a)
{
    printf("the cube of %d is %d",a,a*a*a);
}