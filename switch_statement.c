#include <stdio.h>
int main()
{
    int a,x,b,n;
    float y;
    printf("Enter the value of a,x,b,n:");
    scanf("%d%d%d%d",&a,&x,&b,&n);
    switch (n)
    {
        case 1: n=1 ;
        y=a*x%b;
        printf("y=%f",y);
        break;
        case 2: n=2;
        y=(float)a*x*x+b*b;  
        printf("y=%f",y);
        break;
        case 3: n = 3;
        y=(float)a-b*x;
        printf("y=%f",y);
        break;
        case 4: n=4;
        y=(float)a+x/b;
        printf("y=%f",y);
        break;
        default:
        printf("Invalid input");
    }
    return 0;
}