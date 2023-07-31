import sys
from itertools import permutations
n = int(sys.stdin.readline())
k = int(sys.stdin.readline())
cards =  [int(sys.stdin.readline()) for _ in range(n)]
perm = set(permutations(cards,k))
check = set()
for p in perm:
    s = ''.join(map(str,p))
    check.add(s)

print(len(check))
