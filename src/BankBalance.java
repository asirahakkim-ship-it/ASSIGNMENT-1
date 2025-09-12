public class BankBalance {
    public static void main(String[] args) {
        int balance=-120;
        if(balance>0){
            System.out.println("Positive Balance");
        }
        else if(balance<0){
            System.out.println("Overddraft");
        }
        else{
            System.out.println("Zero Balance");
        }
    }
}
