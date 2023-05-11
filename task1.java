// Пусть дан LinkedList с несколькими элементами. 
// Реалезуйте метод, который вернет "перевернутый" список.

import java.util.LinkedList;

public class task1 {

    public static void main(String[] args) {
        LinkedList<Integer> linkedli = new LinkedList<Integer>();
        linkedli.add(new Integer(1));
        linkedli.add(new Integer(2));
        linkedli.add(new Integer(3));
        linkedli.add(new Integer(4));
        linkedli.add(new Integer(5));
        System.out.print("До: " + linkedli);
 
        linkedli = reverseLinkedList(linkedli);
        System.out.print("\nПосле: " + linkedli);
    }
 
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist)
    {
        for (int i = 0; i < llist.size() / 2; i++) {
            Integer temp = llist.get(i);
            llist.set(i, llist.get(llist.size() - i - 1));
            llist.set(llist.size() - i - 1, temp);
        }
        return llist;
    }
}