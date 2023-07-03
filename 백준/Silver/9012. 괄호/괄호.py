T = int(input())

for i in range(T):
    stack = []
    element=input()
    for e in element:
        if e =='(':
            stack.append('(')
        else : 
            if(stack):
                stack.pop()
            else: 
                print('NO')
                break  
    else:
        if(stack): print("NO")        
        else : print("YES")