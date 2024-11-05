 #include<stdio.h>
 int main()
 {
    int i,j,n,k;
    printf("enter n = ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        for(k=i;k<n;k++)
        {
            printf(" ");
        }
        for(j=1;j<=2*i-1;j++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
 }