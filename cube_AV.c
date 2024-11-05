// argument with returning value
#include<stdio.h>
int cube(int);
void main()
{
    int n,c;
    printf("enter any number : ");
    scanf("%d",&n);
    c = cube(n);
    printf("the cube of %d is %d",n,c);
}
int cube(int a)
{
    return a*a*a;
}