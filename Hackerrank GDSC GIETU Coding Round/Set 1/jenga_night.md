## Problem Statement
Monaj hosts a party for his birthday. There are `N` people at the party. All these `N` people decide to play Jenga.

There are `X` Jenga tiles available. In one round, all the players pick 1 tile each and place it in the tower. The game is valid if:

All the players have a tile in each round;
All the tiles are used at the end.
Given `N` and `X`, find whether the game is valid.

## Input Format

First line will contain `T`, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, containing two space-separated integers `N` and `X` representing the number of people at the party and the number of available tiles respectively.
Constraints

`1 ≤ T ≤ 10^4`  
`1 ≤ N, X ≤ 1000`
## Output Format

For each test case, output in a single line `YES` if the game is valid, else output `NO`.

#### **Sample Input 0**
3  
3 3  
4 2  
2 4  

#### **Sample Output 0**
YES  
NO  
YES  

#### **Explanation 0**
Test case 1: The game will last for 11 round after which the tiles will finish.

Test case 2: There are not enough Jenga tiles for everyone to place.

Test case 3: The game will last for 22 rounds as after round 22 all Jenga tiles are used.

#### **Sample Input 1**

5  
5 6  
2 8  
1 5  
9 11  
10 100  
#### **Sample Output 1**

NO  
YES  
YES  
NO  
YES  
#### **Explanation 1**

Test case 1: There are not enough Jenga tiles for everyone to place in the second round.

Test case 2: The game will last for 4 rounds as after round 4 all Jenga tiles are used.

Test case 3: The game will last for 5 rounds as after round 5 all Jenga tiles are used.

Test case 4: There are not enough Jenga tiles for everyone to place in the second round.

Test case 5: The game will last for 10 rounds as after round 10 all Jenga tiles are used.


## Solution
Time Complexity: O(1)
If the number of tiles is completely divisible by the number of people then a valid game exists  
`if(x % n == 0)` is all you need

Simple Modular Math 😅