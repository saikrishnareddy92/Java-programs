import java.util.HashMap;

public class Hmap {
    public static String getStart(HashMap<String,String> tick){
        HashMap<String,String> revmap = new HashMap<>();

        for(String key:tick.keySet()){
            revmap.put(tick.get(key), key);
        }
        for(String key:tick.keySet()){
            if(!revmap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> map =new HashMap<>();
        map.put("chennai", "bengaluru");
        map.put("mumbai", "delhi");
        map.put("goa", "chennai");
        map.put("delhi", "goa");

        String start = getStart(map);
        while(map.containsKey(start)){
            System.out.print(start +" -> ");
            start=map.get(start);

        }
        System.out.println(start);
    }
    
}
