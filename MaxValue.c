#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n,i,max,*p;
    printf("enter the number of values = ");
    scanf("%d",&n);
    p=(int *)calloc(n,sizeof(int));
    printf("enter the data = ");
    for(i=0;i<n;i++)
    {
        scanf("%d",p+i);
    }
    max = *p;
    for(i=0;i<n;i++)
    {
        if(max<*(p+i))
        {
            max = *(p+i);
        }
        
    }
    printf("the maximum value is %d",max);
    return 0;
    free(p);
}
