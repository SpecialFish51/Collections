import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.ArrayList;
import java.util.LinkedList;

class Main {

    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 4;
        Integer e = 5;
        Integer f = 6;
        Integer g = 7;
        Integer h = 8;
        Integer k = 9;
        Integer l = 10;
        linkedList.add(a);
        linkedList.add(b);
        linkedList.add(c);
        linkedList.add(d);
        linkedList.add(e);
        linkedList.add(f);
        linkedList.add(g);
        linkedList.add(h);
        linkedList.add(k);
        linkedList.add(l);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(a);
        arrayList.add(b);

        for (int i = 3; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        for (int i = 7; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));

        System.out.println(linkedList);

        linkedList.remove(l);
        System.out.println(linkedList);

        linkedList.remove(3);
        System.out.println(linkedList);

    }
}
