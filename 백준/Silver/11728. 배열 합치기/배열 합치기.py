a,b = map(int,input().split())
arrA = list(map(int,input().split()))
arrB = list(map(int,input().split()))

lt=0
rt=0
answer=[]

while(lt<a and rt<b):
    if(arrA[lt]<arrB[rt]):
        answer.append(arrA[lt])
        lt+=1
    else:
        answer.append(arrB[rt])
        rt+=1  

if(lt<a):
    for i in range(lt,a):
        answer.append(arrA[i])
if(rt<b):
    for i in range(rt,b):
        answer.append(arrB[i])        

for i in answer:
    print(i,end=" ")
