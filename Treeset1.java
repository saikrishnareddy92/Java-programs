import java.util.*;
public class Treeset1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        System.out.println(set.last());
    }
    
}
