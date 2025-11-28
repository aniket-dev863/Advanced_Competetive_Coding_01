import java.util.*;
public class SortedUniquePermutation {
    static int n ; 
    static char[] ans ; 
    static char [] arr;
    static boolean[] used ;
    static void printer(){
        System.out.println(new String(ans));
    }
    static void rec(int level){
        if(level==n){
            printer();
            return ; 
        }
        for(int i =0;i<n;i++){
            if(used[i])continue;
            if(i>0 && arr[i]==arr[i-1]&&!used[i])continue;
            ans[level]=arr[i];
            used[i]=true ;
            rec(level+1);
            used[i]=false;
        }
    }
    static void Solve(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.next();
        arr = s.toCharArray();
        Arrays.sort(arr);
        n = s.length();
        ans=new char[n];
        used = new boolean[n];
        rec(0);
    }
    public static void main(String args[]){
        Solve();
    }
}
