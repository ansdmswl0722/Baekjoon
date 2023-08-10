import sys
word=input()
# 전공책 수
n = int(sys.stdin.readline())
books=[list(sys.stdin.readline().split()) for _ in range(n)]

# 선택된 책에 원하는 단어가 들어있는지 확인
def check(word,choosed_books):
    for c in word:
        if c not in choosed_books :
            return False
        choosed_books=choosed_books.replace(c,"",1)
    return True

answer = -1
# 조합 만들기
for i in range(1<<n):
    choosed_books = ""
    cost=0
    for j in range(n):
        if i&(1<<j):
            choosed_books += books[j][1]
            cost += int(books[j][0])
    if check(word,choosed_books):
        if(answer == -1): answer=cost
        else : answer = min(answer,cost)
print(answer)