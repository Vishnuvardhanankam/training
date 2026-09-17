public class fact {
    public static int factioral(int n){
        if(n<=1){
            return 1;
        }else{
            return n*factioral(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(factioral(6));
    }
}
