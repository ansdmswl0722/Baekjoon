n = int(input())
stack=[]
start=1
result=""
numList = list(map(int,input().split()))
while numList:
    if numList[0] == start:
        numList.pop(0)
        start+=1
    else:
        stack.append(numList.pop(0))
    while stack:
        if stack[-1] == start:
            stack.pop()
            start+=1
        else:    
            break

       
if stack:
    print("Sad")
else:
    print("Nice")         