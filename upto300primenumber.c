#include<stdio.h>
int main()
{
    int i,n,flag=0;
    for (n=1;n<=300;n++){
        flag=0;
    if(n==1)
    {
        flag=1;
    }
    else
    {
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
    }
    if(flag==0)
    {
        printf("%d\t",n);
    }
}
    return 0;
}