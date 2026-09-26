import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q1=new LinkedList<>();
        q1.add(7);
        q1.add(8);
        q1.add(11);
        q1.add(9);
        q1.add(10);
        q1.add(6);
        q1.add(5);
        System.out.println(q1);
        q1.remove();
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1.size());
        System.out.println(q1.isEmpty());
    }
}
