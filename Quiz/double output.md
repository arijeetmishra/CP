---
title: "Double Literal Output"
difficulty: "Very Easy"
tags: ["JAVA", "decimals", "floats", "literals", "arrays", "loops", "roundingoff"]
---
## Question
```JAVA
class Average {
    public static void main(String[] args) {
        double[] num = {8.6, 12.4, 2.0, 5.5, 11.9, 2.6};
        double sum = 0;
        for(int i = 0; i < num.length; i++)
            sum += num[i];
        System.out.println(sum / arr.length);
    }
}
```
a) 7.2  
b) 7.167  
c) 7.166666666666667  
d) 7.166666666666666  

Correct Answer: `Option c`  

## Explanation
Are you familiar with base 10 to base 2 conversion (decimal to binary) for fractions? If not, look it up.  

Then you'll see that although 9.99 looks pretty normal in base 10, it doesn't really look that nice in binary. It looks like a [repeating decimal](https://en.wikipedia.org/wiki/Repeating_decimal), but in binary. I'm sure you've seen a [repeating decimal](https://en.wikipedia.org/wiki/Repeating_decimal) before, right? It doesn't end. But Java (or any language for that matter) has to save that infinite sequence of digits into a limited number of bytes. And that's when the extra digits appear. When you convert that truncated binary back to decimal, you're really dealing with a different number. The number stored in the variable isn't 9.99 exactly, it something like 9.9999999991 (just an example, I didn't work out the math).  

But you're probably interested on how to solve this, right? Look up the [BigDecimal class](https://www.geeksforgeeks.org/bigdecimal-class-java/). Also, look up [DecimalFormat](https://www.geeksforgeeks.org/bigdecimal-class-java/), which is a class for writing a number as a properly formatted string. I think it does rounding for you when you want to show only 2 decimal digits and your number has a lot more digits actually.  

Note: A similar case happens when we find the power of a number using Math.pow() which returns a decimal value. When the exponent is large the accuracy decreases and give wrong output due to the conversion of truncated binary back to decimal. 