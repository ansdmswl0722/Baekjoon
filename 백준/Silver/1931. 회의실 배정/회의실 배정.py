import sys
n = int(sys.stdin.readline())
times = []
for i in range(n):
    i,j = map(int,sys.stdin.readline().split())
    times.append([i,j])
times.sort(key=lambda x:(x[1],x[0]))    

start = times[0][0]
posible=[times[0]]

for i in range(1,n):
    if times[i][0] >= start:
        posible.append(times[i])
        start = times[i][0]      

end = posible[0][1]
cnt=1
for i in range(1,len(posible)):
    if posible[i][0] >= end:
        cnt+=1
        end = posible[i][1]
print(cnt)

