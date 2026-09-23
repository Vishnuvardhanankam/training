import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack <String> s1=new Stack<String>();
        s1.push("C lang");
        s1.push("Java lang");
        s1.push("C++ lang");
        s1.push("Css");
        System.out.println(s1);
        String topbook=s1.peek();
        System.out.println("Top lang : "+topbook);
        String poplang=s1.pop();
        System.out.println(poplang);
    }
}
