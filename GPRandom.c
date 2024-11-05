#include <stdio.h>
int main ()
{
    float a;
    int i,n;
    a = 100;
    //100,50,25,... upto n terms
    for( i=1;a>1;i++)
    {
        printf("%.2f\t",a);
        a = a/2;
    }
    return 0;
}