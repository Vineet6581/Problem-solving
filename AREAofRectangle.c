#include<stdio.h>
float area_rectangle(float,float);
void main()
{
    float l,b;
    printf("enter the lenght and breadth = ");
    scanf("%f %f",&l,&b);
    printf("the area of the ractangle = %.2f",area_rectangle(l,b));
}
float area_rectangle(float a,float b)
{
    return a*b;
}