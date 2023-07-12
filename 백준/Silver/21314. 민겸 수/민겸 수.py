n = input()

min=""
max=""
cnt=0 
for i in range(len(n)):
    if n[i] == 'M':
        cnt+=1 
        if i ==len(n)-1:
            max+= "1"*cnt
            min+= "1"+"0"*(cnt-1)
    else:
        if cnt > 0:
            max+= "5"+"0"*cnt
            min+= "1"+"0"*(cnt-1)+"5"
            cnt=0
        else:
            max+= "5"
            min+= "5"
    
print(int(max))
print(int(min))