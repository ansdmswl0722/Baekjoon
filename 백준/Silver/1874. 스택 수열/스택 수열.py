import sys
from collections import deque 
n = int(sys.stdin.readline())
stack = []
idx = 1
flag=0
answer=[]
for i in range(n):
    num =  int(sys.stdin.readline())   
    while num >= idx:
        stack.append(idx)
        idx+=1
        answer.append("+")  
    if num == stack[-1]:  
        stack.pop()
        answer.append("-")     
    else: 
        print("NO")   
        flag=1
        break
 
if flag==0:
    for i in answer:
        print(i)   