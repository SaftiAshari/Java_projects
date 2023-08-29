import java.util.*;
public class Collection_List {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       Collections.sort(a);
       for(Integer i:a)
       {
           System.out.print(i+" ");
       }
    }
}
