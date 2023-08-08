import sys
n,m = map(int,sys.stdin.readline().split())
chess = [list(input()) for _ in range(n)]

min_chess=64
for i in range((n-8+1)):
    for g in range(m-8+1):
        white= ((['W']+['B'])*4+(['B']+['W'])*4)*4
        black= ((['B']+['W'])*4+(['W']+['B'])*4)*4
        w_cnt=0
        b_cnt=0
        for j in range(i,i+8):
            for k in range(g,g+8):
                w = white.pop() 
                b = black.pop()
                if w != chess[j][k]:
                    w_cnt+=1
                if b != chess[j][k]:
                    b_cnt+=1 
        min_chess= min(min_chess,w_cnt,b_cnt)
    
print(min_chess)
