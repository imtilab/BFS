# BFS Algorithm

```
bfs(G) > G = (V, E)
> Initialize the vertex colors and predecessors
1 for each vertex v 2 V
2   do color [v] = white
3     p[v] = null
4 for each vertex v 2 V
5   do if color [v] = white
6     then BFS(G, v)


BFS(G, s) > G = (V, E)
1 color [s] = gray; p[s] = null; d[s] = 0
2 Q = emptySet; Enqueue(Q, s)
3 while Q 6= ;
4   do u = Dequeue(Q)
5     for each vertex v 2 Adj[u]
6       do if color [v] = white
7         then color [v] = gray
8           d[v] = d[u] + 1
9           p[v] = u
10          Enqueue(Q, v)
11    color [u] = black
```
