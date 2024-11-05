#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct abc
{
    int a;
    float b;
    char c[29];
};
union pqr
{
    int p;
    float q;
    char r[29];
};
void  main()
{
    struct abc s1 = {1,6.5,"HELLO"};
    union  pqr s2 = {1,6.5,"ABES"};
    printf("the value in structure: \n");
    printf("%d\t",s1.a);
    printf("%f\t",s1.b);
    puts(s1.c);
    printf("\nthe value in union: \n");
    printf("%d\t",s2.p);
    printf("%f\t",s2.q);
    puts(s2.r);
    printf("\nthe value in union on accessing individual numbers: \n");
    s2.p=1;
    printf("%d\t",s2.p);
    s2.q=6.5;
    printf("%f\t",s2.q);
    strcpy(s2.r,"HELLO");
    puts(s2.r);
}
