#include <stdio.h>

int main() {
    char marital_status;
    int age, gender;
    printf("Enter marital status (M for married, U for unmarried): ");
    fflush(stdin);
    scanf(" %c", &marital_status);
    printf("Enter age: ");
    scanf("%d", &age);
    printf("Enter gender : ");
    fflush(stdin);
    scanf("%c", &gender);
    if(marital_status=='M'||marital_status=='m')
    printf("the deriver is insured");
    else if((gender=='M'||gender =='m' )&& age>30)
    printf("the deriver is insured");
    else if((gender=='F'|| gender=='f')&& age>25)
    printf("deriver is insured");
    else 
    printf("the deriver is not insured");
   

    return 0;
}