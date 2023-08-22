a , b = map(int,input().split())
big = max(a,b)
small = min(a,b)

def gcd(a,b):
    if a%b == 0:
        return b
    else:
        return gcd(b,a%b)
    
common_divisor = gcd(big,small)  
print(common_divisor)
print(int(big*small/common_divisor))