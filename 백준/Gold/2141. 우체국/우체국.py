import sys
n = int(sys.stdin.readline())
residents=[]
for i in range(n):
    a,b = map(int,sys.stdin.readline().split())
    residents.append([a,b])
residents.sort()

all = sum(row[1] for row in residents)
idx=0
if all%2==0:
    idx = all//2-1
else:
    idx = all//2  
cnt = residents[0][1]-1      
for m in range(len(residents)):
    if idx <= cnt:
        print(residents[m][0])
        break
    else:
        cnt+=residents[m+1][1]
