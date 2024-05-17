import java.util.*;

public class map1 {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<Integer , String>();
        map.put(1, "sai");
        map.put(2, "abc");
        map.put(4, "wer");
        //map.sorted(Map.Entry.comparingByValue());
        Set set=map.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("iterating hashmap");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" :" +m.getValue());

        }
    }
    
}
