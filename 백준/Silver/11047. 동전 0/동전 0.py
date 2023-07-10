n,k = map(int, input().split())

stack=[]
for i in range(n):
    stack.append(int(input()))

cnt = 0
for i in range(n):
    coin = stack.pop()
    if coin <= k:
        cnt += k//coin
        k=k%coin
        if not k:
           break 
print(cnt)   