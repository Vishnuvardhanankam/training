import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }

        Stack<Character> res = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == '(' || i == '[' || i == '{') {
                res.push(i);
            } else if (i == ')' || i == ']' || i == '}') {
                if (res.empty()) {
                    return false;
                }
                
                char top = res.peek();
                if ((i == ')' && top == '(') || (i == ']' && top == '[') || (i == '}' && top == '{')) {
                    res.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return res.empty();
    }
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("(){}[]"));
    }
}
