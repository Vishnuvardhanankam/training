class disTax {
    public static void main(String[] args) {
        double AB=23000;
        double dis=0;
        double tax=0;
        if(AB>25000){
            dis=AB*0.15;
            tax=AB*0.18;
        }
        else if(AB>=10000&&AB<=25000){
            dis=AB*0.10;
            tax=AB*0.15;
        }
        else if(AB>=5000&&AB<10000){
            dis=AB*0.10;
            tax=AB*0.15;
        }
        else{
            tax=AB*10.0;
        }
        double FB=AB-dis+tax;
        System.out.println(AB);
        System.out.println(dis);
        System.out.println(tax);
        System.out.println(FB);


    }
}
