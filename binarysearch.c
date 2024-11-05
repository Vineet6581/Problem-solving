// binary search
#include<stdio.h>
int main()
{
    int i,n,a[20],value,mid,end,beg;
    printf("enter the number of elemnets ");
    scanf("%d",&n);
    printf("enter the array elements\n");
    for(i=0;i<n;i++)
    {
        printf("enter the element %d= ",i+1);
        scanf("%d",&a[i]);
    }
    printf("enter the value to be searched ");
    scanf("%d",&value);
    beg=0;
    end=n-1;
    mid=(end+beg)/2;
    while(beg<=end && a[mid] != value)
    {
        if(a[mid]<value)
        beg = mid +1;
        else
        end = mid -1;
        mid = (beg+end)/2;
    }
    if(a[mid]==value)
    printf("the %d element is found at %d position",value,mid+1);
    else
    printf("unsuccessfull search");
    return 0;
}
