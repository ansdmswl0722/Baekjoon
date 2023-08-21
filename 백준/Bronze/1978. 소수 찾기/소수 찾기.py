import sys
n = int(input())
nums = list(map(int,input().split()))
cnt=0
sieve = [1]*1001
sieve[0]=0
sieve[1]=0
for k in range(2,len(sieve)):
    if sieve[k]==0: continue
    for m in range(2*k,len(sieve),k):
        sieve[m]=0

for i in nums:
   if sieve[i]==1: cnt+=1
print(cnt)