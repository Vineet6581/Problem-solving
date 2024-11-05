#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct date
{
   int dd,mm,yy;
};
struct emloyee
{
     char ename[20],estate[30];
    int eid;
    struct date edoj;
    float esalary;
};
typedef struct emloyee ep;
void main()
{
    ep e[20];
    int i,n;
    char state[30];
    printf("enter the number of employees = ");
    scanf("%d",&n);
    printf("\nenter the employees details:");
    for(i=0;i<n;i++)
    {
        printf("\nNAME = ");
        fflush(stdin);
        gets(e[i].ename);
        printf("\nID = ");
        scanf("%d",&e[i].eid);
        printf("\nDATE OF JOINING = ");
        scanf("%d %d %d",&e[i].edoj.dd,&e[i].edoj.mm,&e[i].edoj.yy);
        printf("\nSALARY = ");
        scanf("%f",&e[i].esalary);
        printf("\nSTATE = ");
        fflush(stdin);
        gets(e[i].estate);
        strupr(e[i].estate);
    }
    printf("\nenter any state = ");
    fflush(stdin);
    gets(state);
    strupr(state);
    printf("\nThe following employees belongs to ");
    puts(state);
    for(i=0;i<n;i++)
    {
        if(!strcmp(state,e[i].estate))
        {
            puts(e[i].ename);
            printf("\n");
        }
    }
}
