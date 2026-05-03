package part_02.Graphs;
import java.util.*;
public class traversals{
    public static List<List<Integer>> BuildGraph(int n , int [][]edges){
        List<List<Integer>>adj = new ArrayList<>();
        for(int i =0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i =0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        return adj;
    }
    public static void dfs(List<List<Integer>>adj,int n , int node ,boolean[]vis,List<Integer>Res){
        vis[node]=true;
        Res.add(node);
        for(int v :adj.get(node)){
            if(!vis[v]){
                dfs(adj,n,v,vis,Res);
            }
        }
    }
    public static List<Integer>bfs(int startNode , int [][]edges,int n){
        List<List<Integer>>adj = BuildGraph(n, edges);
        List<Integer>Result = new ArrayList<>();
        Queue<Integer>que = new LinkedList<>();
        boolean[] vis = new boolean[n];
        vis[startNode]=true;
        que.offer(startNode);
        while(!que.isEmpty()){
            int top = que.poll();
            Result.add(top);
            for(int neighbour :adj.get(top)){
                if(!vis[neighbour]){vis[neighbour]=true;
                que.offer(neighbour);}
            }
        }
        return Result;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] edges = new int[n][2];
        for(int i =0;i<n;i++){
            edges[i][0] = sc.nextInt();
            edges[i][1] =sc.nextInt();
        }
        List<Integer>resBfs = bfs(1,edges,n);
        System.out.println("Result of BFS is ");
        for(int r :resBfs){
            System.out.println(r);
        }
    }
}