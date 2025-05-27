import java.util.*;
class Graph 
{
    private Map<Integer, List<Integer>> adjList;
    public Graph() 
    {
        adjList = new HashMap<>();
    }
    public void addEdge(int u, int v) 
    {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>()); 
        adjList.get(u).add(v);
    }
    public void bfs(int start) 
    {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new java.util.LinkedList<>();
        visited.add(start);
        queue.add(start);
        System.out.print("BFS Traversal starting from node " + start + ": ");
        while (!queue.isEmpty()) 
        {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) 
            {
            if (!visited.contains(neighbor)) 
                  {
                    visited.add(neighbor);
                    queue.add(neighbor);
                  }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Graph g = new Graph();
        System.out.print("Enter the number of edges: ");
        int edges = sc.nextInt();
        System.out.println("Enter each edge as two integers (u v):");
        for (int i = 0; i < edges; i++) 
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdge(u, v);
        }
        System.out.print("Enter the starting node for BFS: ");
        int start = sc.nextInt();
        g.bfs(start);
        sc.close();
    }
}


