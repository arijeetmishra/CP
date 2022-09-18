---
title: "Slice Index Error"
difficulty: "Easy"
tags: ["Python", "slicing", "index", "list"]
---
## Question
```Python
list = ['g', 'd', 's', 'c']
print(list[10:])
```
a) 10  
b) []  
c) ['g', 'd', 's', 'c']  
d) no output  

Correct Answer: `Option b`  

## Explanation
As one would expect, attempting to access a member of a list using an index that exceeds the number of members (eg: attempting to access `list[10]` in the list above) results in an `IndexError`.  
However, attempting to access a `slice` of a list at a starting index that exceeds the number of members in the list will not result in an `IndexError` and will simply return and empty list.  
Similarly, 
```Python
list = ['g', 'd', 's', 'c']
print(list[:10])
```
Will result in `['g', 'd', 's', 'c']` and is perfectly fine without any `IndexError`.