import sys
from collections import deque
n,k = map(int,input().split())

queue=deque()
for i in range(n):
   queue.append(i+1)

answer=[]
idx=0
while(queue):
        for _ in range(k-1):
            front = queue.popleft()
            queue.append(front)
        answer.append(queue.popleft())    
    
print("<",end="")
for i in range(n):
     if i == n-1:
          print(answer[i],end="")
     else : print(answer[i],end=", ")     
print(">")         