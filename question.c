// two numbers are entered through the keyboard. write a program to find the value of one number raised to the power of another.
#include <stdio.h>
#include<math.h>
int main()
{
    int a,b,c=1;
    printf("enter the base = ");
    scanf("%d",&a);
    printf("enter the power = ");
    scanf("%d",&b);
    for(int i = 1;i<=b;i++)
    {
        c = c*a;
    }
    printf("%d raised to the power %d is %d",a,b,c);
    return 0;
    

}