import java.util.*;
public class maxProduct {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements ");
        int[] arr = new int[n];
        for(int i =0 ;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        int ans=0;
        int pre=1;int suf=1 ;  
        for(int i =0 ;i<n;i++){
            if(pre==0)pre=1;
            if(suf==0)suf=1;
            pre*=arr[i];
            suf*=arr[n-i-1];
            ans = Math.max(ans,Math.max(pre,suf));
        }
        System.out.println(ans);
    }
}
