import java.util.Stack;
public class strred {
    public static void main(String[] args) {
        String s1="abba";
        Stack<Character> res=new Stack<>();
        for (char i:s1.toCharArray()){
            if(res.empty()){
                res.push(i);
            }else if(i!=res.peek()){
                res.push(i);
            }
            else{
                res.pop();
            }
        }
        System.out.println(res);

    }
}