import java.util.*;
public class prioQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("sai");
        queue.add("madhu");
        queue.add("mmm");
        queue.add("gvhd");
        System.out.println("head:"+queue.element());
        System.out.println("head" + queue.peek());
        //queue.remove(); 
        queue.poll();
        System.out.println("head" + queue.peek());      
    }
    
}
