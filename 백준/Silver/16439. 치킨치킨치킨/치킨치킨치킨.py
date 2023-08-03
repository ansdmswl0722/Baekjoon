import sys
from itertools import *

n,m = map(int,sys.stdin.readline().split())
chicken = [list(map(int,sys.stdin.readline().split())) for _ in range(n)]
idx= [i for i in range(m)]

sum=0
printList = list(combinations(idx,3))
for chi in printList:
    satisfy=0
    for j in range(n):
        num=0
        for i in chi:
            num=max(num,chicken[j][i])   
        satisfy+=num
        sum=max(sum,satisfy)
print(sum)
