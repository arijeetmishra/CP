## Problem Statement
Given an `integer array`, return the `second maximum number` in this array.

## Input Format
you are given an array as input

## Constraints
`1 <= nums.length <= 104`  
`-2^31 <= nums[i] <= 2^31 - 1`

## Output Format
The output should only be the `Second Maximum number`.

#### **Sample Input 0**
1 2

#### **Sample Output 0**
1

#### **Explanation 0**
The second maximum number is 1 so is the final output.

#### **Sample Input 1**
2 3 5 7 1 3

#### **Sample Output 1**
5

#### **Explanation 1**
The second maximum value is 5.
So 5 is the final Output.

## Solution
Sort the Array  
If you choose in Ascending Order:  
`print the second last element`  
Otherwise If you choose Descending Order:  
`print the second element`


#### **Side Note**
It's easy. All you need to focus on is how to take the input.   
##### Python 
In Python just use the `input()` function and split it based on `Space` Delimiter and set the type to list  
##### JAVA 
In JAVA you will face problem since the input is a space separated integer. Integer values given to you as String. To do this we need to learn String Inputs. You can use StringBuilder Class or StringTokenizer Class then convert it into a String Array then it will be easier.  

<br> 

### Need to have practice to know these key points 👍