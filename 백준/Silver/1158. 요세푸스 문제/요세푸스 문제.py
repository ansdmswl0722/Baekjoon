from collections import deque
n, k = map(int,input().split())
newk = k
queue = deque([i+1 for i in range(0,n)])
list = []
while queue:
    if k>1:
        n = queue.popleft()
        queue.append(n)
        k-=1
    if k==1:
        list.append(queue.popleft())
        k=newk
print(str(list).replace('[', '<').replace(']', '>'))