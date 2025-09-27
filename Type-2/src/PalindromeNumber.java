public class PalindromeNumber {
    public static void main(String[] args) {
        int n=1221;
        int x=n;
        int r=0;
        while(n>0){
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(x==r){
            System.out.println("Is a Plaindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
