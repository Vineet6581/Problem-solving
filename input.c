#include <stdio.h>
int main()
{
    int a[10],i;
    printf("enter th elements of array \n");
    for(i=0;i<=9;i++)
    {
        printf("enter the element number %d\n :",i+1);
        scanf("%d",&a[i]);
    }
    printf("the value in the array \n");
    for(i=0;i<=9;i++)
    {
        printf("%d\t",a[i]);
    }
    return 0;
}