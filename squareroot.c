#include <stdio.h>
#include<math.h>
int main()
{
    float r1,r2,a,c,b,d;
    printf("enter the value of a,b,c:");
    scanf("%f%f%f",&a,&b,&c);
    d = b*b-4*a*c;
    if(d>0)
    {
        printf("roots are real and distinct");
        printf("\n");
        r1 = (-b+sqrt(d))/(2*a);
        printf("the 1st root is %f\n",r1);
        r2 = (-b-sqrt(d))/(2*a);
        printf("the 2nd root is %f",r2);
    }
    else if(d==0)
    {
        printf("roots are equal");
        printf("\n");
        r1 = -b/(2*a);
        printf("the 1st root %f\n",r1);
        r2 = -b/(2*a);
        printf("the 2nd root %f",r2);
    }
    else
    {
        printf("the roots are imaginary");
    }
return 0;
    
}