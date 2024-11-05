// ******
// *    *
// *    *
// ******
#include<stdio.h>
int main()
{
    int i,j;
    for(i=1;i<=4;i++)
    {
        for(j=1;j<=6;j++)
        {
            if(i==1 || i==4 || j==1 || j==6)
            {
                printf("*",j);
            }
            else{
                printf(" ",j);
            }
        }
        printf("\n");
    }
    return 0;
}