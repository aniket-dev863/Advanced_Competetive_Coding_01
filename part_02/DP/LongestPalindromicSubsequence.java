package part_02.DP;

import java.util.Scanner;

public class LongestPalindromicSubsequence {
    public static int LCS(String s , String r){
        int n = s.length();
        int m = r.length();
        int[][]dp = new int[n+1][m+1];
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==r.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine() ; 
        String reverseString = new StringBuilder(s).reverse().toString();
        System.out.println("The Original String is : "+s) ;
        System.out.println("The Longest Palindromic Subsequnce is "+LCS(s, reverseString));
    }
}
