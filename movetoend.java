public class movetoend {
    public static void printEnd(String str,int idx ,int count ,String newString){
        
        if(idx == str.length()){
            for(int i=0;i<count ; i++){
                newString+='x';
                
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        
        if(currChar == 'x'){
            count++;
            printEnd(str, idx+1, count, newString);
        }else{
            newString+=currChar;
            printEnd(str, idx+1, count, newString);

        }


    }
    public static void main(String[] args) {
        String str = "axdxcxxd";
        printEnd(str, 0, 0, "");

    }
    
}
