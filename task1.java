import java.util.LinkedList;
import java.util.Collections;

public class task1 {

    public static void main(String[] args) {
        LinkedList<Integer> linkedli = new LinkedList<>();
        linkedli.add(1);
        linkedli.add(2);
        linkedli.add(3);
        linkedli.add(4);
        System.out.print("До: " + linkedli);
 
        linkedli = reverseLinkedList(linkedli);
        System.out.print("\nПосле: " + linkedli);
    }
 
    public static LinkedList<Integer> reverseLinkedList(LinkedList llist) {
        Collections.reverse(llist);
        return llist;
    }
}
