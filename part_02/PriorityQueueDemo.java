package part_02;
import java.util.*;
public class PriorityQueueDemo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        System.out.println("This is Descending Order");
        for(int i =0 ; i<n;i++){
            int tp = sc.nextInt();
            tp = (-1)*tp ; 
            pq.offer(tp);
        }
        while (!pq.isEmpty()) {
            int a = pq.poll();
            System.out.println(a*(-1));
        }
    }
}
