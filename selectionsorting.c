#include <stdio.h>
int main()
{
    int a[20],i,j,n,temp,loc,min;
    printf("enter the number of elements ");
    scanf("%d",&n);
    printf("enter the unsorted array \n");
    for(i=0;i<n;i++)
    {
        printf("enter the elements %d ",i+1);
        scanf("%d",&a[i]);
    }
    for(i=0;i<n-1;i++)
    {
        min=a[i];
        loc=i;
    }
    for(j=i+1;j<n;j++)
    {
        if(min>a[j])
        {
            min=a[j];
            loc=j;
        }
        if(loc!=i)
         {   temp = a[i];
             a[i]=a[loc];
             a[loc]=temp;
         }
    }
    printf("the sorted array elements are : ");
    for(i=0;i<n;i++)
    {
        printf("%d\t",a[i]);
    }
    return 0;
}
