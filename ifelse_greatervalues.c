#include<stdio.h>
void main()
    {
        int a,b,c;
        printf("enter the value of a,b,c :");
        scanf("%d%d%d",&a,&b,&c);
        if (a>b)
        {
            if(a>c)
            {
                printf("%d is the greater",a);
            }
            else
            {
                printf("%d is the greatest",c);
            }
        }
        else
        {
            if(b>c)
            {
                printf("%d is the greatest",b);
            }
            else
            {
                printf("%d is the greatest",c);
            }
        }


    }