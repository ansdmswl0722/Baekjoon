import sys

while 1:
    answer='wrong'
    a,b,c  = map(int,sys.stdin.readline().split())
    if a==b==c==0:
        break
    if a*a + b*b == c*c:
        answer='right'
    if a*a + c*c == b*b:
        answer='right'
    if b*b + c*c == a*a:
        answer = 'right'
    print(answer)

