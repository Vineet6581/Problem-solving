//write a program to print out all the armstrong numbers 
//between 1 and 500. if the sum of cubes of each digit of the number
// is equal to the number itself,then the number is called an 
// armstrong number.FOR Example, 153=(1*1*1)+(5*5*5)+(3*3*3).
#include <stdio.h>
#include <math.h>

int main()
{
    int n, digit, originaln;
    float sum;
    printf("Armstrong numbers between 1 and 500 are:\n");
    for(int n = 1; n <= 500; n++)
    { 
        sum = 0;  // Initialize sum to 0 for each new number
        originaln = n;  // Store the original number
        
        while (originaln != 0)
        {
            digit = originaln % 10;  // Extract the last digit
            sum += pow(digit, 3);  // Add the cube of the digit to the sum
            originaln /= 10;  // Remove the last digit
        }
        
        // Check if the sum of cubes of digits is equal to the number itself
        if ((int)sum == n)  
        {
            printf("%d\n", n);  // Print the Armstrong number
        }
    }
    
    return 0;
}
