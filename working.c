#include<stdio.h>
void main()
{
    int *p;
    int a=10;
    p=&a;
    printf("%d",a);
    printf("\n%d",&a);
    printf("\n%d",p);
    printf("\n%d",*p);
}