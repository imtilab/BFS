# BFS Algorithm

```
bfs(G) > G = (V, E)
> Initialize the vertex colors and predecessors
1 for each vertex v ϵ V
2   do color [v] = white
3     π[v] = null
4 for each vertex v ϵ V
5   do if color [v] = white
6     then BFS(G, v)


BFS(G, s) > G = (V, E)
1 color [s] = gray; π[s] = null; d[s] = 0
2 Q = Ø; Enqueue(Q, s)
3 while Q ≠ Ø
4   do u = Dequeue(Q)
5     for each vertex v ϵ Adj[u]
6       do if color [v] = white
7         then color [v] = gray
8           d[v] = d[u] + 1
9           π[v] = u
10          Enqueue(Q, v)
11    color [u] = black
```
