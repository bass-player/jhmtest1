import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //HashSet<String> hashSet = new HashSet<String>();
        //Set<String> set = new HashSet<String>();

        Set<String> set = new HashSet<String>();

        /* boolean b1 = set.isEmpty();
        System.out.println(b1);*/

        set.add("e");
        set.add("f");
        set.add("z");
        set.add("a");
        set.add("c");

        /*boolean b2 = set.isEmpty();
        System.out.println(b2);

        int i = set.size();
        System.out.println("clear之前的长度"+i);

        set.clear();
        int j = set.size();
        System.out.println("clear之后的长度"+j);*/

        Iterator<String> it = set.iterator();

        /*boolean b1 = it.hasNext();
        if(b1){
            String s = it.next();
            System.out.println(s);
        }

        boolean b2 = it.hasNext();
        if(b2){
            String s = it.next();
            System.out.println(s);*/

        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
