import sys
n = int(sys.stdin.readline())

dp=[]
dp=[100001]*(n+6)

dp[2]=1
dp[4]=2
dp[5]=1

for i in range(6,n+1):
    dp[i] = min(dp[i-2],dp[i-5])+1
  
if dp[n]>100000:
    print(-1)    
else:
    print(dp[n])