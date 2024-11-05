#include<stdio.h>
int main()
{
    double x1,x2,x3,y1,y2,y3,m1,m2;
    printf("enter the 1st points :");
    scanf("%d%d",&x1,&y1);
    printf("enter the 2nd points :");
    scanf("%d%d",&x2,&y2);
    printf("enter the 3rd points :");
    scanf("%d%d",&x3,&y3);
    m1=(y2-y1)/(x2-x1);
    m2=(y3-y2)/(x3-x2);
    if(m1=m2)
    printf("straight line");
    else
    printf("not a straight line");
    return 0;
}