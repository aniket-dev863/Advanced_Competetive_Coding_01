import java.util.*;
public class Combinations {
    static int r,n ; 
    static int[] arr ;
    static int[] ans ;
    static void printer(){
        for(int i = 0 ; i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    static void rec(int ind , int level){
        if(level==r){
            printer();
            return ; 
        }
        for(int i = ind ;i<n;i++){
            ans[level]=arr[i];
            rec(ind+1,level+1);
        }
    }
    static void solve(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array and combinations : ");
        n = sc.nextInt();
        r = sc.nextInt() ; 
        arr = new int[n];
        ans = new int[r];
        System.out.println("Enter the Elements of array. ;");
        for(int i = 0 ; i<n;i++){
            arr[i]=sc.nextInt();
        } 
        rec(0,0);

    } 
    public static void main(String args[]){
        solve();
    }
}
