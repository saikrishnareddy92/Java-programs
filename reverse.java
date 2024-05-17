import java.util.LinkedList;

import org.w3c.dom.Node;

public class reverse {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            
        }

    }
    public void reverseList() {
       if(head == null || head.next == null) {
           return;
       }


       Node prevNode = head;
       Node currNode = head.next;
       while(currNode != null) {
           Node nextNode = currNode.next;
           currNode.next = prevNode;
           prevNode = currNode;
           currNode = nextNode;
       }
       head.next = null;
       head = prevNode;
   }
    public void addFirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;        
    }
   public static void main(String[] args) {
     reverse list=new reverse();
     list.addFirst("sai");
     list.addFirst("krishna");
     list.addFirst("reddy");
     list.addFirst("challagonda");
     System.out.println(list);
     list.reverseList();
     System.out.println(list.reverseList());


   }


    
}
