// 1
// AB
// 123
// ABCD
// 12345
#include<stdio.h>
int main()
{
    int n,i,j;
    char d;
    printf("enter = ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        int a=1;
        for(j=1;j<=i;j++)
        {
            if(i%2==0)
            {
                 d = a+64;
                 printf("%c",d);
                 a++;
            }
            else
            {
                printf("%d",a);
                a++;
            }
            
            
        }
        printf("\n");
    }
    return 0;
}
