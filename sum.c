#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n,i,sum=0,*p;
    printf("enter the number of elements = ");
    scanf("%d",&n);
    p = (int *)malloc(n*sizeof(int));
    if(p==NULL)
    {
        printf("memory allocation failed");
        return 1;
    }
    printf("enter the data = ");
    for(i=0;i<n;i++)
    {
        scanf("%d",p+i);
    }
    for(i=0;i<n;i++)
    {
        sum = sum + *(p+i);
    }
    printf("the sum = %d",sum);
    return 0;
    free(p);
}
