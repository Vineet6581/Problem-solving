#include<stdio.h>
int main()
{
    int i,n;
    // 100,97,94,91 upto all positive terms of a
    int a = 100;
    for(i=1;a>0;i++)
    {
        printf("%d\t",a);
        a = a-3;
    }
    return 0;
}