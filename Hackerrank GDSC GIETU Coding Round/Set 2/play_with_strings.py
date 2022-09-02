inp = list(input().split())
for i in inp:
    print(i[::-1] + " " if len(i) % 2 != 0 else i+ " ", end="")