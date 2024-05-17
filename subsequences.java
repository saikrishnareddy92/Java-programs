
import java.util.HashSet;

public class subsequences {
    public static void printSub(String str,int idx , String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        printSub(str, idx+1, newString+currChar);
        printSub(str, idx+1, newString);
    }

    // if new sequence contains dupilicates
    public static void printSub(String str,int idx , String newString ,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
            
        }
        char currChar = str.charAt(idx);
        printSub(str, idx+1, newString+currChar,set);
        printSub(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        String str = "abc";
        HashSet<String> set = new HashSet<>();
        printSub(str, 0, "",set);

    }
    
}
