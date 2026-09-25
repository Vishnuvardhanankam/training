import java.util.Stack;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<Character>();  
        Stack<Character> s2=new Stack<Character>();  
        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(!s1.isEmpty()){
                    s1.pop();
                }
            }else{
                s1.push(ch);
            }
        }
        for(char ch:t.toCharArray()){
            if(ch=='#'){
                if(!s2.isEmpty()){
                    s2.pop();
                }
            }else{
                s2.push(ch);
            }
        }
    
        return s1.equals(s2);
        

    }

    public static void main(String[] args) {
        System.out.println(new Solution().backspaceCompare("ab#c", "ad#c"));
    }
    }
