#include <stdio.h>
void main()
{
    float a,b,c,d,e,p;
    printf("Enter the marks of math : ");
    scanf("%f",&a);
    printf("Enter the marks of physics : ");
    scanf("%f",&b);
    printf("Enter the marks of chemistry : ");
    scanf("%f",&c);
    printf("Enter the marks of hindi : ");
    scanf("%f",&d);
    printf("Enter the marks of english : ");
    scanf("%f",&e);
    p = (a+b+c+d+e)/5;
    printf("The total percentage is : %f",p);
}
