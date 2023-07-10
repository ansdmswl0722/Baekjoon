n,k = map(int, input().split())

stack=[]
for i in range(n):
    stack.append(int(input()))

coin = 0
cnt = 0
for i in range(n):
    coin = stack.pop()
    if coin <= k:
        cnt += k//coin
        k=k%coin
        if k:
            continue
        else: break     
print(cnt)   