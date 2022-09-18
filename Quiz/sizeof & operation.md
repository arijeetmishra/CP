---
title: "Operation inside sizeof() Operator"
difficulty: "Easy"
tags: ["C", "sizeof()", "unaryoperator", "literals", "selfincrement", "initialization", "garbagevalue"]
---
## Question
```C
#include <stdio.h>

int main() {
    int a = 4;
    float b;
    printf("%d\t", sizeof(++a + b));
    printf("%d", a);
    return 0;
}
```
What is the output in a 64 bit Compiler?  
a) error: variable b might not have been initialized  
b) 4    4  
c) 4    5  
d) 9    5  

Correct Answer: `Option b`  

## Explanation
Why not `Option a`? Garbage Value Concept.   
`Option a` is not the right answer. In `C Language` variables are stored on the stack or in a CPU register. For variables stored on the stack, "allocation" is performed when the function is called(here `main()` function). The initial value of variables assigned to CPU registers is the previous contents of the register.  
In layman terms ~ when you run any program, that uses variables to store values and when it ends, OS only release the memory and make it available for other programs but OS does not flush the data in those locations automatically. So, when you declare an uninitialized variable OS assigns any available memory to that variable, and because you have not assigned any value, the leftover value on that location is not over written and becomes the `GARBAGE VALUE` for that variable because it is not relevant. And this can also be proven with a small program by accessing the location of variable in previous program using pointers.

Why b is the answer?
The `a` as an integer will be converted to float[[type promotion](https://www.geeksforgeeks.org/automatic-type-promotion-in-overloading-in-java/)] while calculating the mathematical expression and then it will be passed in the `sizeof()` operator as a float constant. (++a = 5.0 and b will be some float garbage value). `sizeof(float)` is `4`  
*Point to note* is that the value of any variable doesn't modify inside `sizeof()` operator so `++a` will only fetch the value and not update it. Hence value of the variable `a` will remain `4`.