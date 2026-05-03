package part_02;
import java.util.*;
public class MapDemo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int freq=0;
            if(mp.containsKey(a)){
                freq=mp.get(a);
            }
            mp.put(a,freq+1);
        }
        for(Map.Entry<Integer,Integer> entry :mp.entrySet()){
            System.out.println("Number is "+entry.getKey() +" Frequency is "+entry.getValue());
        }
    }
}
