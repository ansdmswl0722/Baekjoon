n,k = map(int,input().split())
arr = list(map(int,input().split()))

answer=0
cnt=0
visit = sum(arr[0:k])
for i in range(n-k+1):
    if(i!=0) : visit +=(arr[i+k-1]-arr[i-1])
    if(answer< visit):
        answer = visit
        cnt=1
    elif(answer == visit):
        cnt+=1  

if(answer==0):
    print("SAD")
else:   
    print(answer)
    print(cnt)
