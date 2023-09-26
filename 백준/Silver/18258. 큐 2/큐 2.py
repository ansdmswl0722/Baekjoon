import sys
from collections import deque
n = int(input())

queue=deque()
for _ in range(n):
    commend = sys.stdin.readline().split()
    if commend[0] == "push":
        queue.append(commend[1])
    if commend[0] == "pop":
         if(len(queue)>0):print(queue.popleft())
         else: print(-1)   
    if commend[0] == "size":
        print(len(queue))
    if commend[0] == "empty":
        if(len(queue)==0):print(1)
        else: print(0)
    if commend[0] == "front":
        if(len(queue)>0): print(queue[0])
        else : print(-1)           
    if commend[0] == "back":
        if(len(queue)>0): print(queue[-1])
        else : print(-1)   
