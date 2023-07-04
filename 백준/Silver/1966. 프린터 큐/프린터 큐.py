T = int(input())
for i in range(T):
    n,pick=map(int,input().split())
    queue=list(map(int,input().split()))
  
    cnt=0
    while queue :
        maxValue = max(queue)
        value = queue.pop(0)
        pick -= 1
        if value == maxValue:
            cnt+=1
            if pick<0:
                print(cnt)
                break     
        else:
            queue.append(value)
            if pick < 0 : 
                pick = len(queue) - 1
            