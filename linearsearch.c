#include <stdio.h>
int main()
{
    int a[20],n,i,value,count=0;
    printf("enter the number of element ");
    scanf("%d",&n);
    printf("enter the element of array\n ");
    for(i=0;i<n;i++)
    {
        printf("enter the element number %d ",i+1);
        scanf("%d",&a[i]);
    }
    printf("enter the value to search: ");
    scanf("%d",&value);
    for(i=0;i<n;i++)
    {
        if(a[i]==value)
        {
            printf("the value %d is found at %d position",value,i+1);
            count++;
        }
    }
    if(count==0)
    {
        printf("unsuccessfull search");
    }

    return 0;
}


