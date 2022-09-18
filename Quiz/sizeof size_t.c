#include <stdio.h>

int test();

int main() {
    if (sizeof(int) > -1)
        printf("True");
    else
        printf("False");
    test();
    return 0;
}

int test() {
    unsigned int a = -1;
    printf("\n%ui", (-1));
    return 0;
}