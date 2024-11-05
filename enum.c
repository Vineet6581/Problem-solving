#include<stdio.h>
enum fooditems{burger=1,spinach,pizza,mushroom,cheese};
void main()
{
    enum fooditems f;
    printf("enter any value from 1 to 5: ");
    scanf("%d",&f);
    switch(f)
    {
        case burger : printf("i will not eat burger");
        break;
        case spinach : printf("i will eat spinach");
        break;
        case pizza : printf("i will not eat pizza");
        break;
        case mushroom : printf("i will eat mushroom");
        break;
        case cheese : printf("i will eat cheese");
        break;
        default : printf("invalid input");
    }
}