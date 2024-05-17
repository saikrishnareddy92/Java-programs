import java.util.ArrayList;

public class linearsearch {
    //starting from first
    public static int findindex(int[] arr ,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index] ==target){
            return index;
        }
        return findindex(arr, target, index+1);
    }
    //starting from last

    public static int findindexlast(int[] arr ,int target,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index] ==target){
            return index;
        }
        return findindexlast(arr, target, index-1);
    }
    //returning list while taking in argument
    //static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<Integer> findindexlist(int[] arr ,int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index] ==target){
            list.add(index);
            //return list;
            
        }
        return findindexlist(arr, target, index+1,list);
    }

    //returning list while taking array list  in body
    public static ArrayList<Integer> findindexlist2(int[] arr ,int target,int index){
        ArrayList<Integer> list =new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        //answer is present for that function call only
        if(arr[index] ==target){
            list.add(index);
            //return list;
            
        }
        ArrayList<Integer> ansfrombelowcalls= findindexlist2(arr, target, index+1);
        list.addAll(ansfrombelowcalls);
        return list;
    }
    public static void main(String[] args) {
        int[] arr ={5,8,9,7,5,5,6,6};
        int ans =findindex(arr, 6, 0);
        System.out.println(ans);
        int reverse= findindexlast(arr, 6, arr.length-1);
        System.out.println(reverse);
        System.out.println(findindexlist(arr, 6, 0,new ArrayList<>()));
        System.out.println(findindexlist2(arr,6,0));
    }
    
}
