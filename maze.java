public class maze {
    public static int mazecount(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = mazecount(r-1, c);
        int right = mazecount(r, c-1);
        return left+right;

    }
    public static void mazePath(String p ,int r ,int c){
        if(r==1&& c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
        mazePath(p+'D', r-1, c);
        }
        if(c>1){
        mazePath(p+'R', r, c-1);
        }

    }
    public static void main(String[] args) {
        System.out.println(mazecount(3, 3));
        mazePath("", 3, 3);
        
    }
    
}
