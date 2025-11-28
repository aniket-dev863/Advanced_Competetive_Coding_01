import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r= new StringBuilder(s).reverse().toString();
        if(s.equals(r)){
            System.out.println("Its a palindrome");
        } 
        else{
            System.out.println("Not a Palindrome ");
        }
    }
}
