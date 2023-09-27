while True:
    line = input()
    if line=="END": break
    else:
        rev = list(line)
        rev.reverse()
        sum = ''.join(rev)
        print(sum)
