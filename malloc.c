#include<stdio.h>
#include<stdlib.h>
void main()
{
    int *a,i,n;
    printf("enter size for memory allocation: ");
    scanf("%d",&n);
    a=(int*)malloc(n*sizeof(int));
    printf("the allocated memory: ");
    for(i=0;i<n;i++)
    {
        printf("%u\t",a+i);
    }
    free(a);
}