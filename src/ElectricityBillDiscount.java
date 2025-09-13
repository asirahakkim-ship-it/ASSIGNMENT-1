public class ElectricityBillDiscount{
    public static void main(String[] args){
        int bill=1200;
        if(bill>1000){
            System.out.println("10% discount");
        }
        else if(bill>=500){
            System.out.println("5% discount");
        }
        else{
            System.out.println("Pay the Full bill");
        }
    }
}
