import java.util.*;

public class dequee {
    public static void main(String[] args) {
        Deque<String> deque= new ArrayDeque<String>();
        deque.add("a");
        deque.offerFirst("b");
        deque.offer("c");
        deque.offerLast("z");
        deque.pollFirst();
        deque.poll();
        deque.peekFirst();
        for(String d:deque){
            System.out.println(d);
        }
        


    }
    
}
