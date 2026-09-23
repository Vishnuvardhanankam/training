public class stringQues {
    public static void main(String[] args) {
        String s="aaaabbccdaaabbbccc";
        char[] A1 = s.toCharArray();
        int count=0;
        char currentch=A1[0];
        StringBuffer s1=new StringBuffer();
        for(char c:A1){
            if(c==currentch){
                count++;
                if(count<=2){
                    s1.append(currentch);
                }
            }else{
                currentch=c;
                s1.append(currentch);
                count=1;
            }
        }
        System.out.println(s1);
    }
}
