import sys
n = int(sys.stdin.readline())
place = list(map(int,sys.stdin.readline().split()))

sum1=0
for i in range(1,n-1):
    a = sum(place[1:]) - place[i]
    b = sum(place[i+1:])
    sum1 = max(sum1,a+b)

for i in range(1,n-1):
     a = sum(place[1:n-1])+ place[i]
     sum1=max(sum1,a)
    
place.reverse()
for i in range(1,n-1):
    a = sum(place[1:]) - place[i]
    b = sum(place[i+1:])
    sum1 = max(sum1,a+b)   

print(sum1)