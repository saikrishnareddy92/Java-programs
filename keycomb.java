import java.util.ArrayList;

public class keycomb {
    public static String[] keypad = {"abc","def","ghi","klm","nop","qrs","tuv","wx","yz"};
    public static void combinations(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i=0;i<mapping.length();i++){
            combinations(str, idx+1, newString+mapping.charAt(i));

        }

    }
    //key combinations with another approach
    public static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            pad(p+ch, up.substring(1));
        }
    }
    public static ArrayList<String> padrec(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        ArrayList<String> list = new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            list.addAll(padrec(p+ch, up.substring(1)));
            
        }
        return list;
    }

    //use array list for storing result

    public static void main(String[] args) {
        String str ="23";
        combinations(str, 0, "");
        pad("", "12");
        System.out.println(padrec("", "12"));

    }
    
}
