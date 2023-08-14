import sys
from itertools import combinations
h,w = map(int,sys.stdin.readline().split())
n = int(input())
sticker = [list(map(int,sys.stdin.readline().split())) for _ in range(n)]

combi = list(combinations(range(n),2))
dimension=0
for a,b in combi:
    can = False
    one = sticker[a]
    two = sticker[b]
    if one[0]+ two[0] <= h and max(one[1],two[1])<= w :
        can=True
    if max(one[0],two[0])<=h and  one[1]+two[1]<=w:
        can=True
    if one[0]+two[1] <= h and max(one[1],two[0])<=w:
        can=True
    if max(one[0],two[1]) <=h and one[1]+two[0]<=w:
        can=True 
    if one[1]+two[0]<=h and max(one[0],two[1])<=w:
        can=True
    if max(one[1],two[0])<=h and one[0]+two[1]<=w:
        can =True
    if one[1]+two[1] <=h and max(one[0],two[0])<=w:
        can = True
    if max(one[1],two[1])<=h and one[0]+two[0]<=w:
        can=True      
    if can:          
        answer = one[0]*one[1] + two[0]*two[1]
        dimension = max(dimension,answer)

print(dimension)