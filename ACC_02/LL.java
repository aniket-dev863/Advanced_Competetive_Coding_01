public class LL {
    static Node head = null;
    static class Node {
        int data;
        Node next,prev;
        Node(int val){
            data = val;
            next=null;
            prev=null;
        }
    }
    public static void segregateOddEven(){
        Node current = head ;
        Node oddHead = null ; Node evenHead=null;
        Node oddTail=null   ; Node evenTail=null;
        while(current!=null){
            Node currentNext=current.next;
            current.next=null;
            current.prev=null;
            int val =current.data;
            if (val%2==1){
                if(oddHead==null){
                    oddHead=current;
                    oddTail=current;
                }
                else{
                    oddTail.next=current;
                    current.prev=oddTail;
                    oddTail=current;
                }
            }
            current=currentNext;
        }
        if(oddHead==null){
            head=evenHead;
            return;
        }
        else if(evenHead==null){
            head=oddHead;
            return ;
        }
        oddTail.next=evenHead;
        evenHead.prev=oddTail;
        head=oddHead;
        return ;
    }
}
