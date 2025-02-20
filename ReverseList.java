import java.util.*;

public class ReverseList {
    public static List reverseArrayList(List list){
        List reversed = new ArrayList();
        for(int i = list.size() - 1; i >= 0; i--){
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static List reverseLinkedList(LinkedList list) {
        LinkedList reversed = new LinkedList();
        Iterator it = list.descendingIterator();
        while(it.hasNext()){
            reversed.add(it.next());
        }
        return reversed;
    }

    public static void main(String[] args) {
        List arrayList = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList linkedList = new LinkedList(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Reversed ArrayList: " + reverseArrayList(arrayList));
        System.out.println("Reversed LinkedList: " + reverseLinkedList(linkedList));
    }
}
