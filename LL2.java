import java.util.LinkedList;
public class LL2 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Linkedlist: "+list);
        list.addFirst(50);
        list.addLast(5);
        System.out.println("List after adding"+list);
        System.out.println("Element at index: "+list.get(2));
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing: "+list);
        list.remove(Integer.valueOf(30));
        System.out.println(list);
        System.out.println("Size: "+list.size());
    }
}
