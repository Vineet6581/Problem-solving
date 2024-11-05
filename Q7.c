// ABCD
// ABCD
// ABCD
#include <stdio.h>
int main()
{
    int n,i;
    printf("enter n = ");
    scanf("%d",&n);
    for( i=1;i<=n;i++)
    {
       char a=65;
        for( char j=1;j<=n;j++)
        {
            printf("%c",a);
            a++;
        }
        printf("\n");
    }
    return 0;
}