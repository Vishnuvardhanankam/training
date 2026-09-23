public class alphacount {
    public static void main(String[] args) {
        String s="aaaabbbccd";
        char[] A1 = s.toCharArray();
        int count=0;
        char currench=A1[0];
        StringBuffer s1=new StringBuffer();
        for(char c:A1){
            if(c==currench){
                count++;
            }else{
                s1.append(currench).append(count);
                currench=c;
                count=1;
            }
        }
        s1.append(currench).append(count);
        System.out.println(s1);
    }
}
