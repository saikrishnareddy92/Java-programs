import java.util.Arrays;

public class missingpositive {
    static int cyclic(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index] != index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }
    private static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int arr[]= {5,1,2,3};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
}
