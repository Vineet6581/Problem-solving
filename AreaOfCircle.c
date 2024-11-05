#include<stdio.h>
#define PI 3.14
float area(float);
void main()
{
    float radius;
    printf("enter the radius of circle ");
    scanf("%f",&radius);
    printf("the area is %.2f",area(radius));
}
float area(float r)
{
    return PI*r*r;
}
