public class mazepath {
    public static int countpath(int i, int j ,int m,int n){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 || j==m-1){
            return 1;
        }
        int downwards = countpath(i+1, j, m, n);
        int rightwards = countpath(i, j+1, m, n);
        return downwards+rightwards;

    }
    public static void main(String[] args) {
        int m=3,n=3;
        int total = countpath(0, 0, m, n);
        System.out.println(total);
    }
    
}
