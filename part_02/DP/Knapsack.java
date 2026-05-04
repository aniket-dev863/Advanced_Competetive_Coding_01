package part_02.DP;
import java.util.*;
public class Knapsack {
    public static int n ; 
    public static int[] w = new int[100100];
    public static int[] v = new int[100100];
    public static int[][] dp = new int[105][100100];
    public static int maxWeight ;
    public static int rec(int level , int currentWeight){
        // base case
        if(level==n){
            return 0 ;
        }
        // cache check 
        if(dp[level][currentWeight]!=-1){
            return dp[level][currentWeight];
        }
        // trans
        int ans  = rec(level+1,currentWeight);
        if(currentWeight+w[level]<=maxWeight){
            ans = Math.max(ans , v[level]+rec(level+1,currentWeight+w[level]));
        } 
        // save and return
        return dp[level][currentWeight]=ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i =0;i<=n;i++){
            v[i]=sc.nextInt();
            w[i]=sc.nextInt();
            Arrays.fill(dp[i],-1);
        }
        
    }
}
