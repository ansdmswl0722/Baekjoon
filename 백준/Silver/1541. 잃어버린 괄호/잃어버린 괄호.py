n = input()
num_only = n.replace('+',' ').replace('-',' ')
nums = list(map(int,num_only.split()))

cal=[]
for i in n:
    if i == '-' or i=="+":
        cal.append(i)

sum = nums[0] 
for i in range(len(cal)):
    if cal[i]=='-':
       sum -= nums[i+1]
       if i < len(cal)-1:
        cal[i+1]= '-'
    else:
        sum += nums[i+1]
print(sum)