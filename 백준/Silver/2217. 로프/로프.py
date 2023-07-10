n = int(input())

stack=[]
for i in range(n):
    stack.append(int(input()))

stack.sort(reverse=True)
max = 0
for i in range(n):
    weight = stack[i]*(i+1)
    if weight > max:
        max=weight
print(max) 