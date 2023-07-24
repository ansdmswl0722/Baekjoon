import sys

n = int(sys.stdin.readline())
k = int(sys.stdin.readline())
distance= set(list(map(int,sys.stdin.readline().split())))
dst = list(distance)
dst.sort()
between=[]
answer=0
if k >= len(dst) :
    answer=0
else:    
    for i in range(len(dst)-1): 
        between.append(dst[i+1]-dst[i])
    between.sort()
    for i in range(k-1):
        between.pop()
    answer = sum(between)   
print(answer)