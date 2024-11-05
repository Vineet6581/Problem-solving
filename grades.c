#include <stdio.h>
int main()
{
    int a,b,c,d,e,p;
    printf("enter the marks of maths :");
    scanf("%d",&a);
    printf("enter the marks of physics :");
    scanf("%d",&b);
    printf("enter the marks of chemistry :");
    scanf("%d",&c);
    printf("enter the marks of english :");
    scanf("%d",&d);
    printf("enter the marks of hindi :");
    scanf("%d",&e);
    p=(a+b+c+d+e)/5;
    printf("percentage is %d",p);
    printf("\n");
    if(p>=90&&p<=100)
    {
        printf(" grade A");
    }
    else if(p>=80)
    {
        printf("grade B");
    }
    else if(p>=60)
    {
        printf("grade C");
    }
    else 
    {
        printf("grade d");
    }
return 0;
}
