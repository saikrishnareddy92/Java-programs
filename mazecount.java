import java.util.ArrayList;

public class mazecount {
    public static void main(String[] args) {
        
        //System.out.println(count(3,3));
        path("", 3, 3);
        System.out.println(path("", 3, 3));
        
    }
    public static int count(int r ,int c){
        if(r==1||c==1){
            return 1;
        }
        int left =  count(r-1,c);
        int right = count(r,c-1); 
        return  left+right;
    }
    static ArrayList<String> path(String p , int row,int col){
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            //System.out.println(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row>1){
            list.addAll(path(p+'D', row-1, col));

        }
        if(col>1){
            list.addAll(path(p+'R', row, col-1));
        }
        return list;


    }
    

}
