package strings;
public class stringcheck {
    public static void main(String[] args) {
        String s1="jhgHGJIHGh9809@#$%";
        String s2=s1.toLowerCase();
        char[] A1=s2.toCharArray();
        int vowels=0;
        int consonants=0;
        int num=0;
        int special=0;
        for(char ch:A1){
            if(Character.isLetter(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
            else if(Character.isDigit(ch)){
                num++;
            } 
            else {
                special++;
            }  
            System.out.println(s1);
            System.out.println(vowels); 
            System.out.println(consonants); 
            System.out.println(num); 
            System.out.println(special); 
    }
}
}