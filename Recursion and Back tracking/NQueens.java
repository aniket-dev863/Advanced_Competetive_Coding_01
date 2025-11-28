import java.util.*;
public class NQueens {
    static int n ; 
    static char[][] board ;
    static int ans ; 
    static void Init(){
        board = new char[n][n];
        for(int i = 0 ; i<n;i++){
            for(int j = 0; j<n;j++){
                board[i][j]='#';
            }
        }
    }
    static void printer(){
        for(int i = 0 ; i<n;i++){
            for(int j = 0; j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static boolean limits(int r ,int c){
        
        return (r>=0 && r<n && c>=0 && c<n) ;
        
    }
    static boolean check(int row , int column){
        for(int i = 0 ; i<row;i++){
            if(board[i][column]=='Q')return false;
        }
        for(int i = row-1,j =column-1 ; i>=0&&j>=0 ;i--,j--){
            if(board[i][j]=='Q')return false;
        }
        for(int i=row-1 ,j=column+1;i>=0&&j<n;i--,j++){
            if(board[i][j]=='Q')return false;
        }
        return true ;
    }
    static void rec(int level){
        if(level==n){
            printer();
            ans++;
            return ;
        }
        
        for(int i = 0 ; i<n;i++){
            if(check(level,i)){
                board[level][i]='Q';
                rec(level+1);
                board[level][i]='#';
            }
        }
    }
    static void solve(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the board ");
        n=sc.nextInt();
        Init();
        rec(0);
        System.out.println(ans);
    }
    public static void main(String args[]){
        solve();
    }
}
