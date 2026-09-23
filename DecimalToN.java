import java.util.ArrayList;

public class DecimalToN {
    public static void main(String[] args) {
        
        int n=12;
        int num=718;
        int rem=0;
        ArrayList<Integer> remainder = new ArrayList<>();
        while(num>0){
            rem=num%n;
            num/=n;
            remainder.add(rem);
        }
        for(int i=remainder.size()-1;i>=0;i--){
            if(remainder.get(i)%10==remainder.get(i)){
                System.out.print(remainder.get(i));
            }else{
                System.out.print((char)(remainder.get(i)%10+'A'));
            }
        }
    }  
    
}
