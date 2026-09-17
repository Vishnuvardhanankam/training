public class GOOGLY {
    public static Boolean isPrime(int n){
    if(n<2){
        return false;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        int num=67;
        int sum=0;
        while(num>0){
            int d=num%10;
            sum+=d;
            num=num/10;
        }
        System.out.println(sum);
        if(isPrime(sum)){
            System.out.println(sum+"GOOGLY");
        }else {
            System.out.println(sum+"NOT GOOGLY");
        };
        }
    
}
