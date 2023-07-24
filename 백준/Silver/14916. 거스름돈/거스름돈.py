import sys
n = int(sys.stdin.readline())
sum =0
while(n):
    if n%5==0:
        sum+=n//5
        break
    else:
        n=n-2
        sum+=1
if n<0:
    print(-1)
else:
    print(sum)