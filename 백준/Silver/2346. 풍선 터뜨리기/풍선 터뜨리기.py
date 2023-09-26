import sys
from collections import deque
n = int(input())
balloon = list(map(int,sys.stdin.readline().split()))
idx=[]
for i in range(n):
    idx.append(i+1)
queue=deque(idx)

answer = [1]
paper = balloon[queue.popleft()-1]
for _ in range(n-1):
    if paper>0:
        for _ in range(paper-1):
            front = queue.popleft()
            queue.append(front)
        i = queue.popleft()
        answer.append(i) 
        paper = balloon[i-1]    
    else:
        for _ in range(-paper-1):
            back = queue.pop()
            queue.appendleft(back)
        i = queue.pop()
        answer.append(i)    
        paper = balloon[i-1] 
    
for i in answer:
    print(i,end=" ")
    