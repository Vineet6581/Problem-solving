#include <stdio.h>
int main()
{
    int a,b;
    char operation,repeat;
    do{
        printf("enter two numbers :\n");
        scanf("%d%d",&a,&b);
        printf("enter the operator :");
        fflush(stdin);
        scanf("%c",&operation);
        switch(operation)
        {
            case '+' :printf("ANSWER is %d",a+b);
            break;
            case '-' :printf("ANSWER is %d",a-b);
            break;
            case '*' :printf("ANSWER is %d",a*b);
            break;
            case '/' :printf("ANSWER is %d",a/b);
            break;
            default : printf("invalid number");
        }
        printf("\n do you wish to continue(y/n)");
        fflush(stdin);
        scanf("%c",&repeat);
    }while(repeat=='y'|| repeat=='Y');
}