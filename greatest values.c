#include<stdio.h>
int main()
{ 
    int a,b,c;
    printf("enter the three values");
    scanf("%d,%d,%d",&a,&b,&c);
    a>b?a>c?printf("greatest value is a"):printf("greatest value is c"):b>c?printf("greatest value is b"):printf("greatest value is c");
    return 0;
}