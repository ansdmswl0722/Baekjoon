import sys
N = int(sys.stdin.readline())

arr=[]
for i in range(N):
    word = sys.stdin.readline().split()
    if(word[0]=='push'):
        arr.append(word[1])
    if(word[0]=='top'):
       if(len(arr)==0) : print(-1) 
       else : print(arr[-1])
    if(word[0]=='size'):
        print(len(arr))
    if(word[0]=='empty'):
        if(len(arr)==0): print(1)
        else :print(0)
    if(word[0]=='pop'):
          if(len(arr)==0): print(-1)
          else : print(arr.pop())            
        