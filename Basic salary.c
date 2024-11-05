#include <stdio.h>

int main() {
    float basicSalary, totalSalary, da, hra, pf, netSalary;

    printf("Enter the basic salary: ");
    scanf("%f", &basicSalary);

    if (basicSalary < 5000) {
        da = 0.4 * basicSalary;
        hra = 0.45 * basicSalary;
    } else if (basicSalary >= 5000 && basicSalary <= 10000) {
        da = 0.42 * basicSalary;
        hra = 0.47 * basicSalary;
    } else {
        da = 0.5 * basicSalary;
        hra = 0.52 * basicSalary;
    }

    totalSalary = basicSalary + da + hra;
    pf = 0.1 * totalSalary;
    netSalary = totalSalary - pf;

    printf("The net salary is: %.2f\n", netSalary);

    return 0;
}