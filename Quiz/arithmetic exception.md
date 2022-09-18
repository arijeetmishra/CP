---
title: "Maths Arithmetic Exception"
difficulty: "Medium"
tags: ["JAVA", "divisionbyzero", "matherror", "nan", "infinity"]
---
## Question
```JAVA
class output {
    public static void main(String[] args) {
        double a, b, c;
        a = 3.0 / 0;
        b = 0 / 4.0;
        c = 0 / 0.0;

        System.out.println(a + "\t" + b + "\t" + c);
    }
}
```
a) Compilation Error  
b) Runtime Error DivisionByZero  
c) NaN  
d) Infinity     0.0     NaN  

Correct Answer: `Option d`  

## Explanation
For floating point literals,  
In JAVA we have a constant value to represent `10/0.0`, i.e., `Infinity` either *positive or negative*  
Also we have `NaN` (Not a Number) for undefined values like `0/0.0`  
But for integeral type,  
We don't have any constant that's why we get an arithmetic exception which is not the case for double or float. 