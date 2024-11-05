#include <stdio.h>
int main()
{
    int i,n;
    printf("enter the value of n");
    scanf("%d",&n);
    int a = 1;
    for(i=1;i<=n;i++)
    {
        printf("%d\t",a);
        a = a + 2;
    }
    return 0;
}