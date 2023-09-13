T = int(input())

for i in range(T):
    h,w,n = map(int,input().split())
    
    if(n>h):
        if(n%h==0):
            floor = h
            room = n//h
        else:    
            room = n//h + 1
            floor = n%h
    else:
        room = 1
        floor = n    
    print(floor*100+room)