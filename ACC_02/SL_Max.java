// Sliding window Maximum
import java.util.*;
public class SL_Max{
    public static int[] Slidingwindowmax(int[] nums ,int k ){
        if(nums==null || nums.length==0 || k<=0){
            return new int[0];
        }
        int n = nums.length;
        int[] ans = new int[n-k+1];
        Deque<Integer> dq=new LinkedList<>();
        for(int i =0;i<n;i++){
            while(!dq.isEmpty() && dq.peek()<i-k+1){
                dq.poll();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offer(i);
            if(i>=k-1){
                ans[i-k+1]=nums[dq.peek()];
            }
        }
        return ans ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k =sc.nextInt();
        int[] ans = Slidingwindowmax(nums, k) ;
        for(int  it :ans){
            System.out.print(it);
        }
        System.out.println();
    }
}