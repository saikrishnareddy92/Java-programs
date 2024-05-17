import java.util.Arrays;

public class sorting {
    static void insertion(int nums[]){
        for(int i=0;i<nums.length;i++){
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
    
    public static void main(String[] args) {
        int nums[]= {4,8,9,5,6,2};
        int size = nums.length;
        int temp =0;
        //insertion(nums);
        //System.out.println(Arrays.toString(nums));
        //bubble sort
        System.out.println("before sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]=temp;
                }
                
            }
            System.out.println();
            for(int num : nums){
            System.out.print(num + " ");
            }

                
        }
        System.out.println();
        System.out.println("after sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    
}

    

