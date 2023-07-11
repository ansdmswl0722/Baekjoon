n = int(input())
tlist = list(map(int,input().split()))
tlist.sort()
max=0
for i in range(len(tlist)//2):
    if len(tlist)%2 != 0:
        max = tlist.pop()
    t = tlist[i]+ tlist[-1-i]
    if t > max:
        max = t
print(max) 
