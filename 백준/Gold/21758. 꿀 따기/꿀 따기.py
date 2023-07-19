import sys
n = int(sys.stdin.readline())
place = list(map(int,sys.stdin.readline().split()))
honey = sum(place)
sum1=0
b=place[0]
for i in range(1,n):
    a = honey - place[0]- place[i]
    b += place[i]
    sum1 = max(sum1,a+honey-b)

for i in range(1,n-1):
    a = honey - place[0]-place[-1]+ place[i]
    sum1=max(sum1,a)
    
place.reverse()
b=place[0]
for i in range(1,n):
    a = honey - place[0]- place[i]
    b += place[i]
    sum1 = max(sum1,a+honey-b)
print(sum1)