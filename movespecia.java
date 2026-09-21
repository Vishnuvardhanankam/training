/**
 * movehash
 */
public class movespecia {
    public static void main(String[] args) {
        StringBuilder name2=new StringBuilder();
        int count=0;
        String s1="V##i#####s###H";
        char[] A1=s1.toCharArray();
        for(char ch:A1){
            if(Character.isAlphabetic(ch)){
                name2.append(ch);
            }
            else{
                count++;
            }
        }
        System.out.println(name2);
        System.out.println(name2 + "#".repeat(count));
        System.out.println("#".repeat(count)+name2);
    }
    
}