t = int(input())
room = [[0,0]]
n=1
cnt=1
start=1
end=1
while(1):
    if start > t:
        break
    room.append([start,end])
    start+=n
    n =cnt*6
    cnt+=1
    end = start+n-1

for a,b in room:
    if t>=a and t<=b:
        idx=room.index([a,b])
        print(idx)
        break
