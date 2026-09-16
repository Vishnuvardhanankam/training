class Main {
    public static void main(String[] args) {
        int d=240;
        double r=0;
        if(d<100){
            r=d*1.5;
        }else if(d<250){
            r=(100*1.5)+((d-100)*2.5);
        }else if(d<500){
            r=(100*1.5)+(150*2.5)+((d-350)*4);
        }else{
            r=(100*1.5)+(150*2.5)+(250*4)+((d-500)*4);
        }
        System.out.println(r);
    }
}
