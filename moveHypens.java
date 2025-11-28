import java.util.*;
public class moveHypens {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.next();
        char[] str = s.toCharArray();
        int j = str.length-1;
        for(int i = str.length-1;i>=0;i--){
            if(str[i]!='-'){
                str[j]=str[i];
                j-- ;
            }
        }
        while(j>=0){
            str[j]='-';
            j--;
        }
        System.out.println(String.valueOf(str));
    }
}
