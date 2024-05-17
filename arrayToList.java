import java.lang.reflect.Array;
import java.util.*;

public class arrayToList
{
    public static void main(String[] args) {
        String[] array = {"sai","krishna","reddy"};
        System.out.println("printing array to string"+Arrays.toString(array));
        //converting array ro list
        List<String> list = new ArrayList<String>();
        for(String lan :array){
            list.add(lan);
        }
        System.out.println("printing list" +list);
        //to iterate in forward and backward using iterator interface
        ListIterator<String> itr= list.listIterator();
        System.out.println("traversing in forawrd direction");
        while(itr.hasNext()){
            System.out.println("index : "+itr.nextIndex() + "  value : "+itr.next());
        }

        System.out.println("traversing in backward direction");
        while(itr.hasPrevious()){
            System.out.println("index : "+itr.previousIndex() + "  value: " + itr.previous());
        }


    }

}
    

    

