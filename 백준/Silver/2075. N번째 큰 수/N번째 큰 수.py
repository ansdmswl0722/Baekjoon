import sys
import heapq
input = sys.stdin.readline 

h=[]
result=[]
   
n = int(input())
for i in range(n):
    arr = list(map(int,input().split()))
    for value in arr :
        heapq.heappush(h,value)
        if len(h)>2*n:
            v=heapq.heappop(h)
maxlist = heapq.nlargest(n,h)
print(maxlist[n-1])