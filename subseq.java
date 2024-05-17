import java.util.ArrayList;

public class subseq {
    
    static void subseqce(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqce(p+ch, up.substring(1));
        subseqce(p, up.substring(1));


    }

   // returning an array list
    static ArrayList<String> subseqarray(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left=subseqarray(p+ch, up.substring(1));
        ArrayList<String> right=subseqarray(p, up.substring(1));
        left.addAll(right);
        return left;


    }

    
    public static void main(String[] args) {
        String s ="abc";
        subseqce("",  s);
        System.out.println(subseqarray("", s));
        
    }
    
}
