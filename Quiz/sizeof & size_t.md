---
title: "sizeof() Operator and size_t Datatype"
difficulty: "Medium"
tags: ["C", "sizeof()", "size_t", "datatype", "bytes", "typepromotion"]
---
## Question
```C
#include <stdio.h>

int main() {
    if (sizeof(int) > -1)
        printf("True");
    else
        printf("False");
    return 0;
}
```
What is the output in a 64 bit Compiler?  
a) True  
b) False  

Correct Answer: `Option b False`  

## Explanation
Theory requirement:  
size_t : https://www.geeksforgeeks.org/size_t-data-type-c-language/  
It represents the size of an object in Bytes whose data type is `unsigned integral type`  
`sizeof(int) > -1` here we are comparing `unsigned integer type`[antecedant] with `signed integer type`[consequent]. Just like any other expression evaluation all the operands must be of same type using [Type Casting](https://www.w3schools.com/java/java_type_casting.asp/)[[Type Promotion](https://www.geeksforgeeks.org/automatic-type-promotion-in-overloading-in-java/) or Explicit Type Casting].  
C was designed to implicitly and silently change the integer types of the operands used in expressions. There exist several cases where the language forces the compiler to either change the operands to a larger type, or to change their signedness[generally negativet to positive or signed to unsigned since there is no subtraction concept in binary].    
Comparing the range of signed and unsigned:  

|       Type        |    Range          |  Size(in bytes)|
|-------------------|-------------------|----------------|
|   unsigned int    |    0 to 65535     |       2        |
| signed int or int | -32,768 to +32767 |       2        |

Given that a `size_t` is at least as large as an `int`[the maximum value of `unsigned int` is way more than `signed int`], the `signed operand` is converted to the type of the `unsigned operand`. This means the value -1 is converted to the largest value that can be stored in a `size_t`. Hence, the comparison results in false and `False` is printed.  

Proof:  
`printf("%ui\n", (-1));`  
Gives output as `4294967295i`  
Where `%ui` is the format specifier for `unsigned integer`. And we can definitely see that `4294967295i` is way much greater than `-1` so the above condition is `false`