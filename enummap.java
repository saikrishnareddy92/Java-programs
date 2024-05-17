import java.util.EnumMap;
import java.util.Map;

public class enummap {
    public enum days{
        Monday,Tuesday,Wednesday,Thursday
    };
    public static void main(String[] args) {
        EnumMap<days,String> map = new EnumMap<days,String>(days.class);
        map.put(days.Monday , "1");
        map.put(days.Tuesday,"2");
        map.put(days.Wednesday,"3");
        map.put(days.Thursday,"4");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+"-> "+m.getValue());
        }
    }
    
}
