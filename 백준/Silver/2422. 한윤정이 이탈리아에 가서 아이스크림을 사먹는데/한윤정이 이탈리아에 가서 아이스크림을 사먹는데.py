import sys
import itertools
n,m = map(int,sys.stdin.readline().split())
ice = [[False for _ in range(n)] for _ in range(n)]
for _ in range(m):
    i ,j =map(int, sys.stdin.readline().split())
    ice[i-1][j-1]=True
    ice[j-1][i-1]=True

sum=0
for ele in itertools.combinations(range(n), 3):
        if ice[ele[0]][ele[1]] or ice[ele[0]][ele[2]] or ice[ele[1]][ele[2]]:    
            continue
        else:
            sum+=1         
print(sum)     
