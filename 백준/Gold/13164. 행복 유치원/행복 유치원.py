import sys
import heapq
n,k = map(int,sys.stdin.readline().split())
students = list(map(int,sys.stdin.readline().split()))
growth=[]
for i in range(len(students)-1):
    num=students[i+1]-students[i]
    heapq.heappush(growth, -num)

for i in range(k-1):
    heapq.heappop(growth)
   
print(-sum(growth))
