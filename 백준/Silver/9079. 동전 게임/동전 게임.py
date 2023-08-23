import sys
from collections import deque
T=int(input())

def solution(arr):
    row_idx = [[0,1,2],[3,4,5],[6,7,8],[0,3,6],
            [1,4,7],[2,5,8],[0,4,8],[2,4,6]]
    
    visited = [False] * 512
    visited[int(''.join(arr), 2)] = True
    queue= deque([(int(''.join(arr),2),0)])
    while queue:
        arrBin,count = queue.popleft()
        if arrBin == 0 or arrBin == 511:
            return count
        for numbers in row_idx:
            newArr = flip(numbers, list(bin(arrBin)[2:].zfill(9)))
            vs = int(''.join(newArr), 2)
            if not visited[vs]:
                visited[vs] = True
                queue.append((int(''.join(newArr), 2), count+1))
    
    return -1

def flip(numbers, arr):
    for num in numbers:
        arr[num] = '0' if arr[num] == '1' else '1'
    return arr

for i in range(T):
    arr = list(list(sys.stdin.readline().split()) for _ in range(3))
    arr = ['1' if arr[y][x]=='H' else '0' for y in range(3) for x in range(3)] 
    print(solution(arr))
