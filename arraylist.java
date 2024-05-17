import java.util.*;



public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("sai");
        list.add("krishna");
        list.add("reddy");
        list.add("challagonda");
        for(String name:list){
            System.out.println(name);
        }
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }        
    }
    
}
