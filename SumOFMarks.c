#include <stdio.h>
int main()
{
    int a[20],i,n,sum=0;
    printf("enter the number_of_students");
    scanf("%d",&n);
    printf("enter the array marks\n");
    for(i=0;i<n;i++)
    {
    printf("marks%d",i+1);
    scanf("%d",&a[i]);
    }
    char gender;
    printf("gender = ");
    fflush(stdin);
    scanf("%c",&gender);
    switch(gender)
    {
        case 'b':
        printf("the sum of marks of boys\n");
        for(i=0;i<n;i+=2)
        {
            sum = sum + a[i];
        }
        printf("%d\t",sum);
        break;
        case 'g':
        printf("the sum of marks of girls\n");
        for(i=1;i<n;i+=2)
        {
            sum = sum + a[i];
        }
        printf("%d\t",sum);
        break;
        default : printf("invalid input");
        break;
    }
    return 0;   
}
