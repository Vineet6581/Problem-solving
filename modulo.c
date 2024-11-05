#include<stdio.h>
int main(){
    int a ,b;
    printf("Enter the value of two numbers");
    scanf("%d%d",&a,&b);
    int r = a % b;
    printf("%d",r); //when a is greater than b then you will get the desired answer but whenever b is greater then b then you will get a as your reminder.
    return 0;
}