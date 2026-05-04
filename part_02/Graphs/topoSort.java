package part_02.Graphs;
import java.util.*;
public class topoSort {
    public static int n,m;
    public static int[]indeg = new int[100100];
    public static List<Integer>Result = new ArrayList<>();
    public static List<List<Integer>>adj = new ArrayList<>();
    public static void kahn(){
        Queue<Integer>que = new LinkedList<>();
        for(int i =1; i<=n;i++){
            if(indeg[i]==0){
                que.offer(i);
            }
        }
        while(!que.isEmpty()){
            int node = que.poll();
            Result.add(node);
            for( int neighBour : adj.get(node)){
                indeg[neighBour]--;
                if(indeg[neighBour]==0){
                    que.offer(neighBour);
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i =0 ;i<m;i++){
            int u,v ;
            u=sc.nextInt();
            v=sc.nextInt();
            indeg[v]++;
            adj.get(u).add(v);
        }
        for(int r:Result){
            System.out.println(r);
        }
    }
}
