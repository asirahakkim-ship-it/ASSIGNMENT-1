public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int n2=n;
        int arm=0;
        int rem;
        do{
            rem=n%10;
            arm=arm+(rem*rem*rem);
            n=n/10;
        }while(n>0);
        if(n2==arm){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not a Armstrong");
        }
    }
}
