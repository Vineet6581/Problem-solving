// no argumnets and no return values
#include<stdio.h> 
void cube();
void main()
{
    cube();
}
void cube()
{
int n;
printf("enter any number : ");
scanf("%d",&n);
printf("the cube of %d is %d",n,n*n*n);
}