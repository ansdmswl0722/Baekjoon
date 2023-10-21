n,m = map(int,input().split())
a = list(map(int,input().split()))

p1=0
p2=1
cnt = 0
while p1<=n and p2<=n :
    sumA = sum(a[p1:p2])
    if sumA< m :
        p2+=1 
    elif sumA==m:
        cnt+=1
        p1+=1
        p2+=1
    else : p1+=1
print(cnt)  
