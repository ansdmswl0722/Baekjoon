T = int(input())
str=input()
elements = [int(input()) for _ in range(T)]
dic={}
for i in range(len(elements)):
    dic[chr(65+i)]=elements[i]

stack=[]
def calc(x,y,cal):
    i=0
    if cal=='*':
        i = x*y
    elif cal=='+':
        i = x+y
    elif cal=='/':
        i = x/y
    elif cal=='-':
        i = x-y
    elif cal=='^':
        i =x^y
    elif cal=='%':
        i = x%y    
    return i
for e in str:
    if e.isalpha():
        stack.append(dic[e])
    else:
        i = calc(stack.pop(-2),stack.pop(-1),e)
        stack.append(i)

print(f'{stack.pop(-1):.2f}')