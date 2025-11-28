import java.util.*;
public class majorityElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Size of the array elements ");
        for(int i = 0 ; i<n;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i =0 ; i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            if(mp.get(arr[i])>n/2){
                ans=arr[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
