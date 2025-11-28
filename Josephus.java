import java.util.*;
public class Josephus {
    static int Jos(int n ,int k){
        int ans=0;
        for(int i=2;i<=n;i++){
            ans=(ans+k)%i ;
        }
        return ans ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N and K: ");
        int n=sc.nextInt();
        int k =sc.nextInt();
        System.out.println("Survivor : " +(Jos(n, k)+1) );
    }
}
