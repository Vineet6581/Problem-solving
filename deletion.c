#include<stdio.h>
int main()
{
    int n,a[20],i,pos;
    printf("enter the number of elements = ");
    scanf("%d",&n);
    printf("enter the elements of array: \n");
    for(i=0;i<n;i++)
    {
        printf("Element %d = ",i+1);
        scanf("%d",&a[i]);
    }
    printf("enter the position = ");
    scanf("%d",&pos);
    for(i=pos-1;i<n-1;i++)
    {
        a[i]=a[i+1];
    }
    printf("the values after the deletion = \n");
    for(i=0;i<n-1;i++)
    {
        printf("%d\t",a[i]);
    }
    return 0;
}
