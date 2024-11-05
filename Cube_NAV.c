// no argument but returning value
#include<stdio.h>
int cube();
void main()
{
    int c;
    c=cube();
    printf("the cube is %d",c);
}
int cube()
{
    int n;
    printf("enter any number : ");
    scanf("%d",&n);
    return n*n*n;
}