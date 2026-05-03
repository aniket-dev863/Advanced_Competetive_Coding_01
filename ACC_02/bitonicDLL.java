// This is a Code to Sort a Bitonic Doublly linked list using 
// Split ,merge  method .
import java.util.*;
public class bitonicDLL {
    static Node head = null ;
    static class Node{
        int data;
        Node prev,next;
        Node(int val){
            data=val;
            prev=null;next=null;
        }
    }
    public static Node SortDLL(Node head){
        if(head==null || head.next==null)
                return head ;
        Node current=head;
        while(current.next!=null && current.data<=current.next.data){
            current=current.next;
        }
        if(current.next==null){
            // already sorted list;
            return head;
        }
        Node secondhead = current.next ;
        current.next=null;
        current.prev=null;

        // reverse the descending part to make it ascending 
        secondhead = reverseDLL(secondhead);
        return merge(head,secondhead);

    }
    public static Node reverseDLL(Node head){
        // reverse a linked list ;
    }
    public static Node merge(Node headOne,Node headSecond){
        if(headOne==null)return headSecond;
        if(headSecond==null)return headOne;
        Node result=null;
        if(headOne.data<headSecond.data){
            result=headOne;
            result.next=merge(headOne.next, headSecond);
            if(result.next!=null)result.next.prev=result;
        }
        else{
            result=headSecond;
            result.next=merge(headOne, headSecond.next);
            if(result.next!=null){
                result.next.prev=result;
            }
        }
        return result;
    }
}
