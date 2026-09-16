public class primecheck {

public static Boolean isPrime(int n){
    if(n<2){
        return false;
    }
    for(int i=2;i<Math.sqrt(n);i++){
        if(n%2==0){
            return false;
        }
    }
    return true;
}
public static void main(String[] args) {
    for(int i=10;i<100;i++){
        if(isPrime(i)){
            System.out.println(i+"is prime");
        }else {
            System.out.println(i+"is not prime");
        };
        
    }
}
}
