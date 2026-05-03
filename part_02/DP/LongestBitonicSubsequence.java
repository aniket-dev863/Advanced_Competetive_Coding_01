package part_02.DP;
import java.util.*;
public class LongestBitonicSubsequence {
    public static int findLBS(int[] arr ,int n){
        if(n==0)return 0;
        int[]inc = new int[n];
        int[]dec = new int[n];
        Arrays.fill(inc,1);
        Arrays.fill(dec,1);
        for(int i =1;i<n;i++){
            for(int j = 0 ; j<i;j++){
                if(arr[i]>arr[j] && inc[i]<inc[j]+1){
                    inc[i]=inc[j]+1;
                }
            }
        }
        for(int i = n-2 ;i>=0;i--){
            for(int j = n-1;j>i;j--){
                if(arr[i]>arr[j] && dec[i]<dec[j]+1){
                    dec[i]=dec[j]+1;
                }
            }
        }
        int maxFound = 0 ;
        for(int i =0;i<n;i++){
            int currentMax=inc[i]+dec[i]-1;
            if(currentMax>maxFound){
                maxFound=currentMax;
            }
        }
        return maxFound;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n] ;
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        System.out.println("The Array is :"+Arrays.toString(arr));
        System.out.println("The longest bitonic sequence is "+findLBS(arr, n));
    }
}
