import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class First{
    public static void main(String args[]){
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<30;i++){
            ls.add(i);
        }
        ListIterator<Integer> iter = ls.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}