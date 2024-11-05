#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n,i,*p,sum=0;
    printf("enter the number of elements = ");
    scanf("%d",&n);
    p=(int *)calloc(n,sizeof(int));
    printf("enter the data = ");
    for(i=0;i<n;i++)
    {
        scanf("%d",p+i);
    }
    for(i=0;i<n;i++)
    {
        sum+=*(p+i);
    }
    printf("sum  = %d",sum);
    free(p);
    return 0;
}