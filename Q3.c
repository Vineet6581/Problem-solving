//star triangle 
//*
//**
//***
//**** upto n times with n stars
#include <stdio.h>
int main()
{
    int n;
        printf("enter the number of rows and columns : ");
        scanf("%d",&n);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                printf("*",j);
            }
            printf("\n");
        }
    return 0;
}