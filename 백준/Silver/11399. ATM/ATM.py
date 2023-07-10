n = int(input())
time = list(map(int,input().split()))
time.sort()
sum=0
max=0
for i in time:
    max +=i
    sum += max
print(sum)  