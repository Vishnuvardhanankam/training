public class encrp {
    public static void main(String[] args) {
        String input="Zomato";
        int k=92;
        k=k % 26;
        StringBuilder result=new StringBuilder();
        for(char c:input.toCharArray()){
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)){
                    char encrp=(char)(((c-65+k)%26)+65);
                    result.append(encrp);
                }else{
                    char encrp=(char)(((c-97+k)%26)+97);    
                    result.append(encrp);
                }
            }else{
                result.append(c);
            }
        }
        System.out.println(result);

    }

}
