n = input()

min="0"
max="0"
for i in range(len(n)):
    if n[i]=='K':
       min += "5"
    else:
        if min[-1]=="1":
            min += "0" 
        elif i >0 and n[i-1]=="M":
            min += "0"      
        else:
            min += "1"
cnt=0 
for i in range(len(n)):
    if n[i] == 'K' and i==0:
        max+='5'
    elif n[i] =='K' and n[i-1]=='M':
        max += "5"+"0"*cnt
        cnt=0 
    elif n[i] =='K' and n[i-1]=='K': 
        max += "5"     
    elif n[i] == 'M':
        cnt+=1  
    if i ==len(n)-1:
        max+= "1"*cnt
print(int(max))
print(int(min))          