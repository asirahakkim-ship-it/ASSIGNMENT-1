public class ReverseNumber {
    public static void main(String[] args) {
        int n=12345;
        int reverse=0;
        int rem;
        while(n!=0){
            rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        System.out.println("reverse of a number"+" " +reverse);
    }
}
