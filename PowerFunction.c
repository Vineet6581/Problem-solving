// x raise to the power y
#include <stdio.h>
int power(int,int);
void main()
{
    int x,y;
    printf("enter the value of x and y : ");
    scanf("%d %d",&x,&y);
    printf("%d raise to the power %d is %d",x,y,power(x,y));
}
    int power(int a , int b)
    {
        int i,p=1;
        for(i=1;i<=b;i++)
        {
            p=p*a;
        }
        return p;
    }