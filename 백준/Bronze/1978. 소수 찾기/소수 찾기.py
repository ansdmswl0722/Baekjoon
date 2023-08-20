import sys
n = int(input())
nums = list(map(int,input().split()))

cnt=0
for i in nums:
    answer=True
    if i==1:
        continue
    for j in range(2,i):
        if i%j==0:
            answer=False
    if answer:    
        cnt+=1
print(cnt)