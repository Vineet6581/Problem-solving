#include <stdio.h>
void main()
{
    int unit;
    float bill;
    printf("Enter the value of unit :");
    scanf("%d",&unit);
    printf("\n");
    if (unit<=50)
    {
        bill = unit*0.50;
        printf("bill is %f",bill);
    }
    else if(unit<=150)
    {
        bill = 25+(unit-50)*0.75;
        printf("bill is %f",bill);
    }
    else if(unit<=250)
    {
        bill = 100+(unit-150)*1;
        printf("bill is %f",bill);
    }
    else
    {
        bill = 200 + unit*100;
        printf("bill is %f",bill);
    }
}
