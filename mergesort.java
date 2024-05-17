import java.util.Arrays;

public class mergesort {
    static int[] merge(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
        

    }
     //using inplace 

    /*static void mergeInPlace(int[] arr,int s,int m,int e){
        if(e-s == 1){
            return ;
        }
        int m= e-s/2;
        mergeInPlace(arr,s,m);
        mergeInPlace(arr,m,e);

        return mergeInPlace(arr,s,m,e);
    }
    static int[] mergeInPlace(int[] arr,int s ,int m ,int e){
        int[] mix = new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l] =mix[l];

        }}*/
        

    
    public static void main(String[] args) {
        int[] arr= {5,3,2,1,5,8};
        arr=merge(arr);
        
        System.out.println(Arrays.toString(arr));
        
    }
    
}
