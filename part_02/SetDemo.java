package part_02;
import java.util.*;
public class SetDemo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> st = new HashSet<>();
        for(int i =0;i<n;i++){
            int tp = sc.nextInt() ;
            if(st.contains(tp)){
                System.out.println("This entity already Existis with us ");    
            }
            st.add(tp);
        }
        for(Integer val :st){
            System.out.println(val);
        }
    }
}