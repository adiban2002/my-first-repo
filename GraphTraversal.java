import java.util.*;
class GraphTraversal 
{
    private Map<Integer, List<Integer>> adjList;
    public GraphTraversal() 
    {
        adjList = new HashMap<>();
    }
    public void addEdge(int u, int v) 
    {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
    }
    public void dfs(int start) 
    {
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS Traversal starting from node " + start + ": ");
        dfsUtil(start, visited);
        System.out.println();
    }
    private void dfsUtil(int node, Set<Integer> visited) 
    {
        visited.add(node);
        System.out.print(node + " ");
        for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) 
        {
            if (!visited.contains(neighbor)) 
            {
                dfsUtil(neighbor, visited);
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        GraphTraversal graph = new GraphTraversal();
        System.out.print("Enter the number of edges: ");
        int edges = sc.nextInt();
        System.out.println("Enter each edge as two integers (u v):");
        for (int i = 0; i < edges; i++) 
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u, v);
        }
        System.out.print("Enter the starting node for DFS: ");
        int start = sc.nextInt();
        graph.dfs(start);
        sc.close();
    }
}

