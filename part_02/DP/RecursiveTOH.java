package part_02.DP;
import java.util.*;
public class RecursiveTOH {
    // This is the code for recursive Tower of Hanoi 
    public static void rec(int n ,int src , int aux ,int dst){
        if(n==1){
            System.out.println("Move disk 1 from "+src+"to"+dst);
            return;
        }
        rec(n-1,src,dst,aux);
        System.out.println("Move Dist "+n+"From"+src +"to"+dst);
        rec(n-1,aux,src,dst);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Printing Recursive Tower of Hanoi for "+n+" Disks");
        rec(3,1,2,3);
    }
}
