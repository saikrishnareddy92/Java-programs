import java.util.Arrays;

public class pattern 
{

    public static void printstars(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            printstars(r, c+1);
        }else{
            System.out.println();
            printstars(r-1, 0);
        }
        

    }

    public static void bubble(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr, r, c+1);
        }else{
           bubble(arr,r-1, 0);
        }
    }
    
    public static void main(String[] args) {
        printstars(5, 0);

        int[] arr  = {4,3,2,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
        
        
    }
}
    

