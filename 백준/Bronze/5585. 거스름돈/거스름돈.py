price = int(input())

changes = 1000-price

cnt=0
value=500
while changes>0:
    if(changes>=value):
        cnt += changes//value
        changes = changes%value
    if(value//10==1 or value//10==10):
        value=value//2
    else :value = value//5 
print(cnt)       