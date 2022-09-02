## Problem Statement
Given a string `paragraph` return the most frequent word.

The words in `paragraph` are case-insensitive and the answer should be returned in lowercase.

## Input Format
It takes one sentance or paragraph.

## Constraints
`1 <= paragraph.length <= 1000`  
`paragraph consists of English letters, space ' ', or one of the symbols: "!?',;.".`

## Output Format
Prints the word that is most frequent

#### **Sample Input 0**
bob hit a ball the hit ball flew far after it was hit

#### **Sample Output 0**
hit

#### **Explanation 0**
As hit occurs 3 times, it is the most frequent word.

## Solution
### Approach 1:
Using Hashmap Concept  
`<Key = Word> : <Value = Frequency>`  
The Key with highest Value is the answer  
Time Complexity: `O(n)`
##### Python
Use `Dictionary`
If word not in dictionary:  
`add the word and assign it 1`  
Otherwise if the word is present in the dictionary:  
`increment the value of the current word by 1`  

##### JAVA
Use `HashMaps`  
Same as above..

### Approach 2:
Time Complexity: `O(n*n)`  
Keep a boolean array of same size to indicate whether the element is visited yet or not. Basically if there are duplicate elements we visit them only once and mark/update them.  
Loop through the elements  
Use nested Loop again to do the same thing  
count the repeated words and at the same time mark them visited in the boolean array  
outside the nested loop check if the current word frequency is the highest frequency  
`store the word as answer`  
print answer outside all the loops

### Yes there are multiple approaches to a question. Approach 2 is better for learners.🤔