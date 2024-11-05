#include <stdio.h>
void main ()
{
    float p,r,t,si;
    printf("Enter the value of p :");
    scanf("%f",&p);
    printf("Enter the value of r :");
    scanf("%f",&r);
    printf("Enter the value of t :");
    scanf("%f",&t);
    si = (p*r*t)/100;
    printf("The value of si is :%f",si);
}