import java.util.Arrays;

//Insertion sort

public class insertion {
     static void insertion1(int nums[]){
            for(int i=0;i<nums.length-1;i++){
                for(int j=i+1;j>0;j--){
                    if(nums[j]<nums[j-1]){
                        int temp = nums[j];
                        nums[j] = nums[j-1];
                        nums[j-1] = temp;
                    }else{
                        break;
                    }
    
                }
            }
        }

     //selection sort
     static void selection(int[] nums){
        for(int i=0;i<nums.length;i++){
            int last = nums.length-i-1;
            int maxIndex = getMaxIndex(nums,0,last);

            swap(nums,maxIndex,last);
            
        }

     }
     static void swap(int[] nums,int first,int second){
        int temp =nums[first];
        nums[first] =nums[second];
        nums[second]=temp;
     }
     private static int getMaxIndex(int[] nums,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(nums[max]<nums[i]){
                max=i;

            }
        }
        return max;
     }
     //bubble sort
     static void bubblesort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    swap(nums, j, j-1);
                }
            }
        }
     }

    public static void main(String[] args) {
        int nums[] ={8,9,6,7,2,3};
        bubblesort(nums);
        //selection(nums);
        //insertion1(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    
}



