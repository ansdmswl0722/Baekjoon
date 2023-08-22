from collections import deque
n,m,v = map(int,input().split())

graph = []
for i in range(n+1):    
    graph.append([])

for i in range(m):
    a,b =  map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(len(graph)):
    graph[i] = sorted(graph[i])

visited=[False]*(n+1)

rating=[]
def dfs(graph,v,visited):
    visited[v]=True
    print(v,end=' ')
    for i in graph[v]:
        if not visited[i]:
            dfs(graph,i,visited)

dfs(graph,v,visited)
print()
visited=[False]*(n+1)
def bfs(graph,v,visited):
    queue = deque([v])
    visited[v]=True
    while queue:
        v = queue.popleft()
        print(v,end=" ") 
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i]=True

bfs(graph,v,visited)