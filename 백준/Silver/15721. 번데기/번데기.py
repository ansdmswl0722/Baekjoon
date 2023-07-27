import sys
from collections import deque
a = int(sys.stdin.readline())
t = int(sys.stdin.readline())
w = int(sys.stdin.readline())

player=deque()
bun=daegi=1
cnt=1

while cnt:
    idx=len(player)  
    cnt+=1
    for i in range(2):
        player.append([0,bun])
        bun+=1
        player.append([1,daegi])
        daegi+=1
    for j in range(cnt):
        player.append([0,bun])
        bun+=1
    for m in range(cnt):
        player.append([1,daegi])   
        daegi+=1
    if bun >= t or daegi>=t:
        answer = player.index([w,t],idx,len(player))
        print(answer%a)    
        break
