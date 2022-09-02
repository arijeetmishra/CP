def filt(w):
    s = ""
    for i in w:
        if(ord)(i)>=97 and (ord)(i)<=122:
            s+=i
    return s

inp = list(input().split())
inp = [filt(i.lower()) for i in inp]
d, max, word = {}, -1, ""
for i in inp:
    try:
        d[i] += 1
    except:
        d[i] = 1
        
for i in d.keys():
    if d[i] > max:
        max = d[i]
for i in d.keys():
    if d[i] == max:
        word = i
        break
print(word)