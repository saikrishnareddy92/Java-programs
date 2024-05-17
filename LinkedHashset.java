import java.util.*;
public class LinkedHashset {
    public static void main(String[] args) {
        //using linked hashset we can able to get unique val
        LinkedHashSet<String> list = new LinkedHashSet<String>();
        list.add("sai");
        list.add("krishna");
        list.add("reddy");
        list.add("sai");
        list.add("ssai");
        list.add("sai krishna");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(list.isEmpty());
        
        System.out.println(list.isEmpty());
        System.out.println(list.hashCode());

    }
    
}
