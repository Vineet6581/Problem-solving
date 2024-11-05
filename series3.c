// 1-2+3-4+5-6...
#include <stdio.h>
int main()
{
    int i,n,sum=0;
    printf("enter the number of terms : ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        if(i%2==0)
        {
            sum += -i ;
        }
        else
        {
            sum += i;
        }
    }
    printf("series = %d",sum);
    return 0;
}