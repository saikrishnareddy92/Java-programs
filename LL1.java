class LL1 {
    Node head;
    private int size;


    LL1() {
        size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }

    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;        
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;

        }
        Node lastNode= head;
        while(lastNode.next != null){
            lastNode=lastNode.next;


        }
        lastNode.next= newNode;

    }
    public void printList(){
        Node currentNode= head;
        while(currentNode!=null){
            System.out.print(currentNode.data + " -> ");
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        head=this.head.next;
        size--;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node currNode=head;
        Node lastNode=head.next;
        while(lastNode.next != null){
            currNode=currNode.next;
            lastNode=lastNode.next;
        } 
        currNode.next=null;
       }
       public int getSize(){
          return size;
       }
       public void addInmiddle(int index,String data){
            if(index>size || index<0){
                System.out.println("invalid synatx");
                return;

            }
            size++;
            Node newNode=new Node(data);
            if(head==null || index==0){
                newNode.next=head;
                head=newNode;
                return;

            }
            Node currNode=head;
            for(int i=1;i<size;i++){
                if(i==index){
                    Node nextNode=currNode.next;
                    currNode.next=newNode;
                    newNode.next = newNode;
                    break;
                }
                currNode=currNode.next;
            }

            
            

        }

    public static void main(String[] args) {
        LL1 list= new LL1();
        list.addFirst("sai");
        list.addFirst("saii");
        list.addFirst("krishna");
        list.addLast("reddy");
        list.addFirst("challagonda");
        list.removeFirst();
        list.removeLast();
        list.addInmiddle(0,"challagond");
        list.getSize();
        list.printList();
        

    }
    
    
}
