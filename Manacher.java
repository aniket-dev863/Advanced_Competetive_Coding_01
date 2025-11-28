import java.util.*;
/**
 * this is the Brute force way of doing the 
 * longest palindrome substring in the string .
 */
public class Manacher {
    public static int Expand(int left , int right,String s ){
        while(left>=0 && right<s.length()&& s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the String : ");
        String s = sc.next();
        int ans = -1 ; 
        int start =0 ; int end=0 ;
        for(int i = 0 ; i<s.length();i++){
            int len1 = Expand(i,i,s);
            int len2 = Expand(i, i+1, s);
            ans = Math.max(len1,len2);
            if(ans>end-start){
                start = i -(ans-1)/2;
                end = i+(ans)/2;
            }
        }
        System.out.println(s.substring(start, end+1));
    }
}
