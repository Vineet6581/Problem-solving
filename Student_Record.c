#include<stdio.h>
#include<string.h>
struct students 
{
    char name[20];
    int rollno;
    float m1,m2,m3,sum;
};
typedef struct students st;
void main()
{
    st s[2];
    int i;
    printf("enter details of 2 students");
    for(i=0;i<2;i++)
    {
        printf("\nname: ");
        fflush(stdin);
        gets(s[i].name);
        printf("\nroll no: ");
        scanf("%d",&s[i].rollno);
        printf("\nmarks of 3 subjects: ");
        scanf("%f%f%f",&s[i].m1,&s[i].m2,&s[i].m3);
        s[i].sum=s[i].m1+s[i].m2+s[i].m3;
    }
    for(i=0;i<2;i++)
    {
        puts(s[i].name);
        printf("total marks is %f",s[i].sum);
        printf("\n");
    }
}