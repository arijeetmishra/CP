## Problem Statement
Given a `sentence`. The task is to print the words with even length as it is and print the words with the odd length in reverse manner in a single line.

## Input Format
You will be getting a sentence as input.  

## Constraints
There can we any number of words in the sentence.  
`max word length < 15`  
`1 < number of words < 100`

## Output Format
print the words with even length as it is and print the words with the odd length in reverse manner in a single line.

### Maintain the order of the words.

#### **Sample Input 0**
I am Happy  

#### **Sample Output 0**
I am yppaH  

#### **Explanation 0**
The length of 'I' is 1 which is odd so reverse of 'I' is "I"  
We can clearly see the length of the word 'Happy' is 5 so its odd so its been printed     in reverse order.  
and the length of "am" 2 which is even so we print it as it is.     


## Solution:
Extract individual words from the string  
While doing so check their length  
If the length is even  
`print as it is`  
Otherwise  
`reverse it and print`

### How to reverse a String:
Keep a variable `Reversed_Word`  
Loop the original word  
Append each Character to the `Reversed_Word` variable like this:  
`Reversed_Word = Current_Character + Reversed_Word`  

Word = "GDSC" 

|Reversed_Word|Current Character|Updated Reversed_Word|
|-------------|-----------------|---------------------|
|""|G|G|
|G|D|D + G = DG|
|DG|S|S + DG = SDG|
|SDG|C|C + SDG = CSDG|
We obtain our requirement.👏

