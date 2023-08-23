graph = []
for i in range(1000001):    
    graph.append([])

for k in range(1,1000001):
    sum = k
    num_digit = len(str(k))
    num=k
    for j in range(1,num_digit+1):
        sum+=num%10
        num= num//10
    if sum<1000001 :  
        graph[sum].append(k)

n = int(input())
if len(graph[n])==0:
    print(0)
else : print(min(graph[n]))