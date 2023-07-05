n,m=map(int,input().split())
pick=list(map(int,input().split()))
queue = [i+1 for i in range(n)]

cnt=0

while pick :
    idx = queue.index(pick[0])
    if idx < len(queue)//2+1:
        value = queue.pop(0)
        if value != pick[0]:
            queue.append(value)
            cnt += 1
        elif value == pick[0]:
            pick.pop(0)
    else:
        value = queue.pop()
        if value != pick[0]:
            queue.insert(0,value)
            cnt += 1
        elif value == pick[0]:
            cnt+=1
            pick.pop(0)
print(cnt)