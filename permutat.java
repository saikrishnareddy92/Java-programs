public class permutat {
    public static void permutations(String str , String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return; 
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0, i)+str.substring(i+1);
            permutations(newString, perm+currChar);
        }

    }
    public static void main(String[] args) {
        String str = "abc";
        permutations(str, "");
    }
    
}
