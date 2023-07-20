import sys
import heapq
n = int(sys.stdin.readline())
times= [list(map(int,sys.stdin.readline().split())) for _ in range(n)]

times.sort()
room= []
heapq.heappush(room,times[0][1])
for i in range(1, n):
    start=times[i][0]  
    if times[i][0] < room[0]  :
        heapq.heappush(room,times[i][1])
    else:
        heapq.heappop(room)
        heapq.heappush(room,times[i][1])
print(len(room))