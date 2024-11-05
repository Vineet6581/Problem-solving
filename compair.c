#include<stdio.h>
#include<stdlib.h>
struct date
{
    int dd,mm,yy;
};
typedef struct date dt;
void main()
{
    dt d1,d2;
    printf("enter the 1st date = ");
    scanf("%d %d %d",&d1.dd,&d1.mm,&d1.yy);
    printf("enter the 2nd date = ");
    scanf("%d %d %d",&d2.dd,&d2.mm,&d2.yy);
    if(d1.dd==d2.dd && d1.mm==d2.mm && d1.yy==d2.yy)
    printf("EQUAL");
    else
    printf("not equal");
}