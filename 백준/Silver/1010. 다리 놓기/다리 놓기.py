import math
T = int(input())
for i in range(T):
    n,m = map(int,input().split())
    result = math.factorial(m)/(math.factorial(n)*math.factorial(m-n))
    print(round(result))
