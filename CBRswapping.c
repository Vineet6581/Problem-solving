// call by reference swapping
#include<stdio.h>
void swap(int *,int *);
void main()
{
    int a,b;
    printf("enter any two numbers = ");
    scanf("%d %d",&a,&b);
    printf("the value before swapping a=%d and b=%d",a,b);
    swap(&a,&b);
    printf("\nthe value after swapping a=%d and b=%d",a,b);
}
void swap(int *p,int *q)
{
    int t;
    t=*p;
    *p=*q;
    *q=t;
}
