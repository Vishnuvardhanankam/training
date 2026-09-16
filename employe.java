public class employe {
    public static void main(String[] args) {
        String EmpName="vv";
        double EmpId=101;
        int ERank=3;
        double EmpSalary=200;
        int performance=0;
        int carallowance=0;
        int houseallowance=0;
        int bounce=0;
        if(ERank==1){
            carallowance=5000;
            houseallowance=10000;
            if(performance<=50&&performance>100){
                bounce=500;
            }else{
                bounce=0;
            }
        }
        if(ERank==2){
            carallowance=5000;
            if(performance<=50&&performance>100){
                bounce=500;
            }else{
                bounce=0;
            }
        }
        if(ERank==3){
            if(performance<=50&&performance>100){
                bounce=500;
            }else{
                bounce=0;
            }
        }
        System.out.println(ERank);
        System.out.println(EmpName);
        System.out.println(EmpId);
        System.out.println(EmpSalary);
        System.out.println(carallowance);
        System.out.println(houseallowance);
        System.out.println(bounce);
        
    }
}
