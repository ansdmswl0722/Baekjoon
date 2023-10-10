from itertools import permutations
T = int(input())
for _ in range(T):
    answer=""
    n = int(input())
    words=list(input() for _ in range(n))
    perm = list(permutations(words,2))
    for p in perm:
        palindrome = p[0]+p[1]
        change=''.join(reversed(palindrome))
        if(palindrome==change):
            answer = change
            break
    if(answer=="") :print(0)
    else : print(answer)       