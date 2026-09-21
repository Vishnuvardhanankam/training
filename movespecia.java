/**
 * movehash
 */
public class movespecia {
    public static void main(String[] args) {
        String name="";
        String hash="";
        String s1="V##i#####s###H";
        // String s2=s1.toLowerCase();
        char[] A1=s1.toCharArray();
        for(char ch:A1){
            if(Character.isAlphabetic(ch)){
                name+=ch;
            }
            else{
                hash+=ch;
            }
        }
        System.out.println(name);
        System.out.println(name+hash);
        System.out.println(hash+name);
    }

    
}