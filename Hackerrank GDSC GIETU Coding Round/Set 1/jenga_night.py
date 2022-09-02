#https://www.hackerrank.com/contests/gdsc-coding-final-round-set-1/challenges/jenga-night/copy-from/1347821788

for _ in range(int(input())):
    n, x = map(int, input().strip().split())
    print("YES" if(x%n==0) else "NO")
    