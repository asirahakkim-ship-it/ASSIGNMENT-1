public class BiggestTreasure {
    public static void main(String[] args) {
        int a=100;
        int b=50;
        int c=75;
        if(a<b && b>c){
            System.out.print(b+"\t The largest value");
        }
        else if(a<=b && b<c){
            System.out.print(c+"The largest value");
        }
        else{
            System.out.println(a+"The largest value");
        }
    }
}
