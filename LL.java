import java.util.*;
public class LL {
    public static void main(String[] args) {
        //using collection framework we can use methods
        LinkedList<String> list= new LinkedList<String>();
        list.add("sai");
        list.add("is a");
        list.add("good boy");
        System.out.println(list);
        list.addFirst("this");
        list.addLast("man|||");
        list.remove(4);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);



    }
    
}
